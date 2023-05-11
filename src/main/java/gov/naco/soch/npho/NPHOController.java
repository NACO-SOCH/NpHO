package gov.naco.soch.npho;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

@Controller
@RequestMapping("/savenpho")
public class NPHOController {
		
	private final String NPHO_FILE_PATH = "Nphodata.json";
	private final String CHD_FILE_PATH = "chd.json";
	 private static final Logger logger = Logger.getLogger(NPHOController.class.getName());
	@GetMapping("/")
	public ResponseEntity<List<NPHOData>> getNPHOData() {
	    try {
	        ObjectMapper objectMapper = new ObjectMapper();
	        List<NPHOData> nphoDataList = objectMapper.readValue(new File(NPHO_FILE_PATH), new TypeReference<List<NPHOData>>() {});
	        return ResponseEntity.ok(nphoDataList);
	    } catch (IOException e) {
	        e.printStackTrace();
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }
	}
	
	@GetMapping("npho/{date}")
	public ResponseEntity<List<NPHOData>> getNPHODataByYear(@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
	    
		 try {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        List<NPHOData> nphoDataList = objectMapper.readValue(new File(NPHO_FILE_PATH), new TypeReference<List<NPHOData>>() {});
        
        List<NPHOData> nphoData = nphoDataList.stream()
	            .filter(data -> data.getYear().equals(date)).collect(Collectors.toList());
        return ResponseEntity.ok(nphoData);
		 } catch (IOException e) {
        e.printStackTrace();
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}


	@PostMapping("/saveNphoData")
	public ResponseEntity<?> saveNPHOData(@RequestBody NPHOData nphoData) {
	    try {
	        ObjectMapper objectMapper = new ObjectMapper();
	        objectMapper.registerModule(new JavaTimeModule());
	        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
	        File file = new File(NPHO_FILE_PATH);
	        if (!file.exists()) {
	            file.createNewFile();
	        }
	        List<NPHOData> nphoDataList;
	        if (file.length() == 0) {
	            nphoDataList = new ArrayList<>();
	        } else {
	            nphoDataList = objectMapper.readValue(file, new TypeReference<List<NPHOData>>() {});
	        }
	        nphoDataList.add(nphoData);
	        objectMapper.writeValue(file, nphoDataList);
	        return ResponseEntity.ok().build();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    
	    	}
	   }

	@GetMapping("/trends/{year}")
	public ResponseEntity<?> trendData(@PathVariable String year) throws IOException {
		 List<JSONObject> jsonList = new ArrayList<>();
		 
		 Map<String, Integer> yearData = new HashMap<>();
		    try {
		      FileInputStream excelFile = new FileInputStream("April_2023.xlsx");
		      XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
		      Sheet sheet = workbook.getSheetAt(0);

		      int estimationMinIndex = -1, estimationMaxIndex = -1, yearIndex = -1;
		      Row headerRow = sheet.getRow(0);
		      logger.info(headerRow+"");
		      for (Cell cell : headerRow) {
		        String header = cell.getStringCellValue();
		        if (header.contains(year) && header.contains("Min")) {
		          estimationMinIndex = cell.getColumnIndex();
		        } else if (header.contains(year) && header.contains("Max")) {
		          estimationMaxIndex = cell.getColumnIndex();
		        } else if (header.equals(year)) {
		          yearIndex = cell.getColumnIndex();
		        }
		      }

		      if (estimationMinIndex == -1 || estimationMaxIndex == -1 || yearIndex == -1) {
		        throw new IllegalStateException("Year " + year + " not found in header");
		      }

		      for (Row row : sheet) {
		        if (row.getRowNum() == 0) {
		          continue; // skip header row
		        }
		        Cell stateCell = row.getCell(0);
		        String state = stateCell.getStringCellValue();
		        Cell yearCell = row.getCell(yearIndex);
		        if (yearCell == null) {
		          continue; // skip rows with no data for the given year
		        }
		        int yearValue = (int) yearCell.getNumericCellValue();
		        int estimationMin = (int) row.getCell(estimationMinIndex).getNumericCellValue();
		        int estimationMax = (int) row.getCell(estimationMaxIndex).getNumericCellValue();
		        logger.info(yearValue +" " +estimationMin+ " "+estimationMax );
		        yearData.put(state + "_min", estimationMin);
		        yearData.put(state + "_max", estimationMax);
		        yearData.put(state + "_" + year, yearValue);
		      }

		      workbook.close();
		      excelFile.close();

		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		 
//		 try {
//	            FileInputStream file = new FileInputStream(new File("April_2023.xlsx"));
//	            Workbook workbook = new XSSFWorkbook(file);
//	            Sheet sheet = workbook.getSheetAt(3);
//	            logger.info(sheet.getSheetName());
//	            Iterator<Row> rowIterator = sheet.iterator();
//	            int yearColumnIndex = 1; // assuming the year column is at index 1 (B column)
//
//	            Map<String, Integer> yearData = new HashMap<String, Integer>();
//	            while (rowIterator.hasNext()) {
//	                Row row = rowIterator.next();
//	                String state = row.getCell(0).getStringCellValue(); // assuming state names are in column A
//	                logger.info(state);
//	                // get estimation data for 2010
//	                if (row.getRowNum() == 0) { // skip header row
//	                    continue;
//	                }
//	                Cell yearCell = row.getCell(yearColumnIndex);
//	               
//	                if (yearCell.getCellType() == CellType.NUMERIC && yearCell.getNumericCellValue() == 2011) {
//	                    yearData.put(state, (int) row.getCell(yearColumnIndex + 1).getNumericCellValue()); // assuming estimation data is in the column next to the year column
//	                    logger.info(yearCell+" : "+ row.getCell(yearColumnIndex + 1) + " "+  row.getCell(yearColumnIndex+2) );
//	                }
//	            }
//
//	            // print the results
//	            for (String state : yearData.keySet()) {
//	            	logger.info("abc");
//	                System.out.println("State: " + state + ", Estimation Data (2010): " + yearData.get(state));
//	                logger.info("State: " + state + ", Estimation Data (2010): " + yearData.get(state));
//	            }
//
//	
//
//	            workbook.close();
//	            file.close();
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }	
		 return ResponseEntity.ok(null);
	    }

	  }
		 
		 
		 
//		try {
//		 	FileInputStream inputStream = null;
//		 	 Workbook workbook = null;
//			 	try {
//			 	inputStream = new FileInputStream(new File("April_2023.xlsx"));
//				        logger.info("inside function");
//				        workbook  = new XSSFWorkbook(inputStream);
//			 	}catch(Exception e) {
//			 		
//			 	}
//		       
//	            Sheet sheet = workbook.getSheetAt(3);
//	            	
//	            Map<String, Map<String, Integer>> data = new HashMap<>();
//
//	            for (Row row : sheet) {
//	                String state = row.getCell(0).getStringCellValue();
//
//	                Map<String,  Integer> yearData = new HashMap<>();
//
//	                for (int i = 1; i < row.getLastCellNum(); i += 3) {
//	                    Cell yearCell = row.getCell(i);
//	                    Cell minCell = row.getCell(i + 1);
//	                    Cell maxCell = row.getCell(i + 2);
//
//	                    String yearStr;
//	                    int year;
//
//	                    if (yearCell.getCellType() == CellType.NUMERIC) {
//	                        year = (int) yearCell.getNumericCellValue();
//	                        yearStr = Integer.toString(year);
//	                        logger.info(yearStr);
//	                    } else {
//	                        yearStr = yearCell.getStringCellValue();
//	                        year = Integer.parseInt(yearStr);
//	                    }
//
//	                    int min = (int) minCell.getNumericCellValue();
//	                    int max = (int) maxCell.getNumericCellValue();
//
//	                    yearData.put(yearStr, min);
//	                    yearData.put(yearStr + " (Max)", max);
//	                }
//
//	                data.put(state, yearData);
//	            }


		        
//		}catch(Exception e) {
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		}
//		
	
//	  public static String convertToJson(List<TrendsData> stateDataList) {
//	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//	        return gson.toJson(stateDataList);
//	    }


//
//
//try {
//    ObjectMapper objectMapper = new ObjectMapper();
//    
//    objectMapper.registerModule(new JavaTimeModule());
//    objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
//    
//    List<NPHOData> nphoDataList = objectMapper.readValue(new File(NPHO_FILE_PATH), new TypeReference<List<NPHOData>>() {});
//    List<NPHOData> nphoDataByYearList = new ArrayList<>();
//    for (NPHOData nphoData : nphoDataList) {
//        if (nphoData.getYear() == year) {
//            nphoDataByYearList.add(nphoData);
//        }
//    }
//    return ResponseEntity.ok(nphoDataByYearList);
//} catch (IOException e) {
//    e.printStackTrace();
//    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//}



//try {
//       ObjectMapper objectMapper = new ObjectMapper();
//       objectMapper.registerModule(new JavaTimeModule());
//       objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
//       chdDataList = objectMapper.readValue(new File(CHD_FILE_PATH), new TypeReference<List<CHDData>>() {});
//   } catch (IOException e) {
//       e.printStackTrace();
//       return "Date is not valid";
//   }

//@GetMapping("npho/{year}")
//public ResponseEntity<List<NPHOData>> getNPHODataByYear(@PathVariable int year) {
//   try {
//       ObjectMapper objectMapper = new ObjectMapper();
//       List<NPHOData> nphoDataList = objectMapper.readValue(new File(NPHO_FILE_PATH), new TypeReference<List<NPHOData>>() {});
//       List<NPHOData> nphoDataByYearList = new ArrayList<>();
//       for (NPHOData nphoData : nphoDataList) {
//           if (nphoData.getYear() == year) {
//               nphoDataByYearList.add(nphoData);
//           }
//       }
//       return ResponseEntity.ok(nphoDataByYearList);
//   } catch (IOException e) {
//       e.printStackTrace();
//       return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//   }
//}
