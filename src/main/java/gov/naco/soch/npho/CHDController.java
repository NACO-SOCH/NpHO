package gov.naco.soch.npho;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import gov.naco.soch.npho.model.CHDintData;

@RestController
@RequestMapping("/chd")
public class CHDController {
    private final String CHD_FILE_PATH = "chddata.json";
    
    @GetMapping("data/{date}")
    public ResponseEntity<List<CHDData>> getCHDDataByDate(@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {

        List<CHDData> chdDataList;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
            chdDataList = objectMapper.readValue(new File(CHD_FILE_PATH), new TypeReference<List<CHDData>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        List<CHDData> chdData = chdDataList.stream()
                .filter(data -> data.getDate().equals(date)).collect(Collectors.toList());

        if (chdData == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(chdData);
        }
    }
    
    @PostMapping
    public ResponseEntity<?> saveCHDData(@RequestBody CHDData chdData) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

            File file = new File(CHD_FILE_PATH);
            if (!file.exists()) {
                file.createNewFile();
            }
            List<CHDData> chdDataList;
            if (file.length() == 0) {
                chdDataList = new ArrayList<>();
            } else {
                chdDataList = objectMapper.readValue(file, new TypeReference<List<CHDData>>() {});
            }
            chdDataList.add(chdData);
            objectMapper.writeValue(file, chdDataList);
            return ResponseEntity.ok().build();
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("dataInt/{date}")
    public ResponseEntity<List<CHDintData>> getCHDDataByDateInt(@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        List<CHDintData> chdDataList;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
            chdDataList = objectMapper.readValue(new File(CHD_FILE_PATH), new TypeReference<List<CHDintData>>() {});

            // Convert string values to int
            for (CHDintData chdData : chdDataList) {
                chdData.setTesting(chdData.getTesting());
                chdData.setPlhiv(chdData.getPlhiv());
                chdData.setViralLoad(chdData.getViralLoad());
                chdData.setStateCode(chdData.getStateCode() != 0 ? chdData.getStateCode() : 0);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        List<CHDintData> chdData = chdDataList.stream()
                .filter(data -> data.getDate().equals(date)).collect(Collectors.toList());

        if (chdData == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(chdData);
        }
    }
    
}
