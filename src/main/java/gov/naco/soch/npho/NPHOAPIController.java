package gov.naco.soch.npho;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.logging.Logger;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class NPHOAPIController {
	
//	private final String NPHO_FILE_PATH = "Nphodata.json";
	private final String CHD_FILE_PATH = "chd.json";
    private static final Logger logger = Logger.getLogger(NPHOAPIController.class.getName());

	@XSecretAuthorizeAttribute
	@GetMapping("/sendNPHOreport/{date}")
	public String  shareNPHOdata(@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date)throws IOException {

	    List<CHDData> chdDataList = null;
	    try {
	        ObjectMapper objectMapper = new ObjectMapper();
	        objectMapper.registerModule(new JavaTimeModule());
	        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
	        chdDataList = objectMapper.readValue(new File(CHD_FILE_PATH), new TypeReference<List<CHDData>>() {});
	    } catch (IOException e) {
	        e.printStackTrace();
	        return "Date is not valid";
	    }
	    JSONObject jsonObject = new JSONObject();
	    JSONArray dataArray = new JSONArray();
	    
	    
	    JSONObject filteredJsonObj = new JSONObject();
	    List<CHDData> chdData = chdDataList.stream()
	            .filter(data -> data.getDate().equals(date)).collect(Collectors.toList());
	    List<String> result = new ArrayList<>();
	    for (CHDData data : chdData) {
	        String state =  data.getState()  == null ? "" : data.getState();
	        String testing = data.getTesting()   == null ? "" : data.getTesting();
	        String plhiv = data.getPlhiv()   == null ? "" : data.getPlhiv();
	        String viralLoad = data.getViralLoad()   == null ? "" : data.getViralLoad();
	        String stateCode = data.getStateCode()   == null ? "" : data.getStateCode();
	        logger.info(data.getState());

	        
	        JSONObject dataObject = new JSONObject();
	        dataObject.put("date", date.toString());
	        dataObject.put("State_ID", stateCode);
	        dataObject.put("State_Name", state);
;
	        dataObject.put("Total_HIV_Test_Done", testing);
	        dataObject.put("PLHIV_On-ART", plhiv);
	        dataObject.put("Total_Viral_Load_Testing_Done", viralLoad);
	        dataArray.put(dataObject);
	    }
	    JSONObject response = new JSONObject();
	    response.put("Data", dataArray);
	    return response.toString();

	}
}


