package gov.naco.soch.npho;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import gov.naco.soch.npho.TRENDSData;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Controller
@RequestMapping("/savetrends")
public class TRENDSController {
		
	 private final String TRENDS_FILE_PATH = "Trendsdata.json";
	 private static final Logger logger = Logger.getLogger(TRENDSController.class.getName());
	 
	
//	@GetMapping("trends/{year}")
//	public ResponseEntity<List<TRENDSData>> getTRENDSDataByYear(@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
//	    
//		 try {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.registerModule(new JavaTimeModule());
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
//        List<TRENDSData> trendsDataList = objectMapper.readValue(new File(TRENDS_FILE_PATH), new TypeReference<List<TRENDSData>>() {});
//        
//        List<TRENDSData> trendsData = trendsDataList.stream()
//	            .filter(data -> data.getYear().equals(date)).collect(Collectors.toList());
//        return ResponseEntity.ok(trendsData);
//		 } catch (IOException e) {
//        e.printStackTrace();
//        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		}
//	}
	
	@GetMapping("trends/{year}")
	public ResponseEntity<List<TRENDSData>> getTRENDSDataByYear(@PathVariable("year") int year) {
	    
		 try {
	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.registerModule(new JavaTimeModule());
	    objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
	    List<TRENDSData> trendsDataList = objectMapper.readValue(new File(TRENDS_FILE_PATH), new TypeReference<List<TRENDSData>>() {});
	    
	    LocalDate yearStartDate = LocalDate.ofYearDay(year, 1);
	    LocalDate yearEndDate = yearStartDate.plusYears(1).minusDays(1);
	    
//	    List<TRENDSData> trendsData = trendsDataList.stream()
//	            .filter(data -> data.getYear().isAfter(yearStartDate.minusDays(1)) && data.getYear().isBefore(yearEndDate.plusDays(1)))
//	            .collect(Collectors.toList());
	    List<TRENDSData> trendsData = trendsDataList.stream()
	            .filter(data -> data.getYear() == year)
	            .collect(Collectors.toList());
	   
	    return ResponseEntity.ok(trendsData);
		 } catch (IOException e) {
	    e.printStackTrace();
	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}



	@PostMapping("/saveTrendsData")
	public ResponseEntity<?> saveTRENDSData(@RequestBody TRENDSData trendsData) {
	    try {
	        ObjectMapper objectMapper = new ObjectMapper();
	        objectMapper.registerModule(new JavaTimeModule());
	        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
	        File file = new File(TRENDS_FILE_PATH);
	        if (!file.exists()) {
	            file.createNewFile();
	        }
	        List<TRENDSData> trendsDataList;
	        if (file.length() == 0) {
	            trendsDataList = new ArrayList<>();
	        } else {
	            trendsDataList = objectMapper.readValue(file, new TypeReference<List<TRENDSData>>() {});
	        }
	        // Check if the trendsData object already exists in the list
	        if (trendsDataList.contains(trendsData)) {
	            return ResponseEntity.status(HttpStatus.CONFLICT).build();
	        }
	        trendsDataList.add(trendsData);
	        objectMapper.writeValue(file, trendsDataList);
	        return ResponseEntity.ok().build();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    
	    	}
	   }
}
