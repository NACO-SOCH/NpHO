package gov.naco.soch.npho;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.logging.Logger;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import gov.naco.soch.npho.model.DarpanDTO;


@RestController
@RequestMapping("/darpan")
public class DarpanController {

	  private final String CHD_FILE_PATH = "chd.json";
	  private static final Logger logger = Logger.getLogger(NPHOController.class.getName());
	  
	  @GetMapping("getData/{date}")
	  public ResponseEntity<List<DarpanDTO>> getCHDDataByDate(@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {

	      List<DarpanDTO> darpanList;
	      try {
	          ObjectMapper objectMapper = new ObjectMapper();
	          objectMapper.registerModule(new JavaTimeModule());
	          objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
	          darpanList = objectMapper.readValue(new File(CHD_FILE_PATH), new TypeReference<List<DarpanDTO>>() {});
	      } catch (IOException e) {
	          e.printStackTrace();
	          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	      }
	      logger.info(darpanList+"");
	      List<DarpanDTO> selectedFieldsList = darpanList.stream()
	                .filter(data -> data.getDate().equals(date)).collect(Collectors.toList());

	      if (selectedFieldsList.isEmpty()) {
	          return ResponseEntity.notFound().build();
	      } else {
	          return ResponseEntity.ok(selectedFieldsList);
	      }
	  }
}
