package gov.naco.soch.npho;
import gov.naco.soch.npho.model.CampData;

import gov.naco.soch.npho.model.HealthCamp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/prisonApp")
public class HealthCampController {
	 
	
	@Autowired
    CampDataService campDataService;

	private static final Logger logger = LoggerFactory.getLogger(HealthCampController.class);
    
    @GetMapping("/health-camps")
    public List<HealthCamp> getAllHealthCamps() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<HealthCamp> healthCamps = null;
        try {
            File file = ResourceUtils.getFile("health-camps.json");
            healthCamps = objectMapper.readValue(file, new TypeReference<List<HealthCamp>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return healthCamps;
    }
    
    @GetMapping("/healthCampData")
    public List<HealthCamp> getHealthCampsByState(@RequestParam("state") String state) {
        List<HealthCamp> healthCampsByState = new ArrayList<>();
        List<HealthCamp> allHealthCamps = getAllHealthCamps();
        for (HealthCamp healthCamp : allHealthCamps) {
            CampData campData = healthCamp.getCampData();
            if (campData != null && campData.getStateName() != null && campData.getStateName().equalsIgnoreCase(state)) {
                healthCampsByState.add(healthCamp);
            }
        }
        return healthCampsByState;
    }
    
//    
//    @GetMapping("/users")
//    public ResponseEntity<List<User>> getUsers() throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            File file = ResourceUtils.getFile("Users.json");
//            List<User> users = objectMapper.readValue(file, new TypeReference<List<User>>(){});
//            return ResponseEntity.ok(users);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }



    @PostMapping("/Auth")
    public ResponseEntity<?> login(@RequestBody User user) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = ResourceUtils.getFile("Users.json");
            List<User> users = objectMapper.readValue(file, new TypeReference<List<User>>(){});

            String encodedUsername = Base64.getEncoder().encodeToString(user.getUsername().getBytes());
            String encodedPassword = Base64.getEncoder().encodeToString(user.getPassword().getBytes());

            for (User u : users) {
                String storedUsername = Base64.getEncoder().encodeToString(u.getUsername().getBytes());
                String storedPassword = Base64.getEncoder().encodeToString(u.getPassword().getBytes());
                if (storedUsername.equals(encodedUsername) && storedPassword.equals(encodedPassword)) {
                    return ResponseEntity.ok("Login successfull!!");
                }
            }
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password!!");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @PostMapping("/dataEntry")
    public ResponseEntity<String> createHealthCamp(@RequestBody HealthCamp healthCamp) throws IOException {
    	 try {
    	        campDataService.saveCampData(healthCamp);
    	        campDataService.saveServiceUptake(healthCamp);
    	        return ResponseEntity.ok().build();
    	    } catch (Exception e) {
    	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save health camp data.");
    	    }
    }
    
    
    
//    @PostMapping("/dataEntry")
//    public HealthCamp createHealthCamp(@RequestBody HealthCamp healthCamp) throws IOException {
//
//        HealthCamp savedHealthCamp = healthCampRepository.save(healthCamp);
//
//        // Read the existing JSON data from the file into a List<HealthCamp>
//        ObjectMapper objectMapper = new ObjectMapper();
//        File file = new File("health-camps.json");
//        List<HealthCamp> allHealthCamps = new ArrayList<>();
//        if (file.exists()) {
//            if (file.length() > 0) {
//                allHealthCamps = objectMapper.readValue(file, new TypeReference<List<HealthCamp>>() {});
//            } else {
//
//                allHealthCamps = new ArrayList<>();
//            }
//        }
//
//        allHealthCamps.add(healthCamp);
//        String json = objectMapper.writeValueAsString(allHealthCamps);
//
//        FileWriter fileWriter = new FileWriter(file);
//        fileWriter.write(json);
//        fileWriter.flush();
//        fileWriter.close();
//
//        return savedHealthCamp;
//    }

    
    @PutMapping("/resetPassword")
    public ResponseEntity<String> resetPassword(@RequestParam String userName, @RequestParam String currentPassword, @RequestParam String newPassword) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = ResourceUtils.getFile("Users.json");
            List<User> users = objectMapper.readValue(file, new TypeReference<List<User>>(){});

            String encodedUsername = Base64.getEncoder().encodeToString(userName.getBytes());
            String encodedCurrentPassword = null;
            if (currentPassword != null) {
                encodedCurrentPassword = Base64.getEncoder().encodeToString(currentPassword.getBytes());
            }
            String encodedNewPassword = null;
            if (newPassword != null) {
                encodedNewPassword = Base64.getEncoder().encodeToString(newPassword.getBytes());
            }

            for (User user : users) {
                String storedUsername = Base64.getEncoder().encodeToString(user.getUsername().getBytes());
                String storedCurrentPassword = Base64.getEncoder().encodeToString(user.getPassword().getBytes());

                if (storedUsername.equals(encodedUsername) && storedCurrentPassword.equals(encodedCurrentPassword)) {
                    if (newPassword != null) {
                        user.setPassword(newPassword);
                    }
                    String json =   objectMapper.writer().withoutAttribute("newPassword").writeValueAsString(users);  // objectMapper.writeValueAsString(users);
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(json);
                    fileWriter.flush();
                    fileWriter.close();
                    return ResponseEntity.ok("Password updated successfully!");
                }
            }
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid current password!!");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
   
   


}
