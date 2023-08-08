package gov.naco.soch.npho;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;

import gov.naco.soch.npho.model.CampData;
import gov.naco.soch.npho.model.HealthCamp;
import gov.naco.soch.npho.model.NewHealthCamp;
import gov.naco.soch.npho.model.NewSTISyndromeDTO;
import gov.naco.soch.npho.model.NewServiceUptake;
import gov.naco.soch.npho.model.STISyndrome;
import gov.naco.soch.npho.model.ServiceUptake;
import gov.naco.soch.npho.model.UserDTO;
import gov.naco.soch.repository.OfflineRepository;
import gov.naco.soch.repository.PrisonApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Transactional
@Service
public class CampDataService {
	
	@Autowired
	 private final PrisonApp prisonRepo;
	
	 private static final Logger logger = LoggerFactory.getLogger(CampDataService.class);

	 
	 public CampDataService(PrisonApp prisonRepo) {
	        this.prisonRepo = prisonRepo;
	    }
	 
	 
	 
	 
	 public UserDTO loginService(String username , String password) {
		 logger.info(username+" "+password);
		 String result =prisonRepo.login(username, password);
		 
		 if (result.isEmpty()) return null;
		 logger.info(prisonRepo.login(username, password));
		 String[] parts = result.split(",");
		 for(String s : parts) {
			 logger.info(s);
		 }
		 UserDTO userDTO = new UserDTO();	 
		 userDTO.setDistrict(parts[0]);
		 userDTO.setState(parts[1]);
		 userDTO.setUserid(parts[2]);
		 return userDTO;
	 }
	 
	 public int resetPassword(String username , String password, String newPassword) {
		 return prisonRepo.resetPassword(username, password,newPassword);
	 }
	 
	  public void saveCampData(NewHealthCamp healthCamp, String guid) {
	        CampData campData = healthCamp.getCampData();
	        logger.info(campData.getDistrictName()+"");
	        	prisonRepo.insertCampData(
	            campData.getStateName(),
	            campData.getDistrictName(),
	            campData.getPocType(),
	            campData.getCampsiteName(),
	            campData.getDistrictNodalOfficerName(),
	            campData.getContactNumber(),
	            campData.getCampDate(),
	            campData.getReportDate(),
	            campData.getUserId(),
	            guid,
	            campData.getGeneratedDate()
	        ); 
	         
	    }
	  
	  public void updateCampData(NewHealthCamp healthCamp, String guid) {
	        CampData campData = healthCamp.getCampData();
	        	prisonRepo.updateCampData(
	            campData.getStateName(),
	            campData.getDistrictName(),
	            campData.getPocType(),
	            campData.getCampsiteName(),
	            campData.getDistrictNodalOfficerName(),
	            campData.getContactNumber(),
	            campData.getCampDate(),
	            campData.getReportDate(),
	            campData.getUserId(),
	            guid,
	            campData.getGeneratedDate()
	        );        
	    }
	  
	  public List<NewHealthCamp> getStateData(String stateName) {
		  List<Object[]> dataList;
		    if (stateName == null) {
		        dataList = prisonRepo.getAllData();
		    } else {
		        dataList = prisonRepo.getStateData(stateName);
		    }

		  List<NewHealthCamp> healthCamps = new ArrayList<>();
		  for (Object[] data : dataList) {
			  
			    CampData campData = new CampData();
			    campData.setId(data[0] != null ? ((Integer) data[0]).longValue() : null);
			    campData.setStateName(data[1] != null ? (String) data[1] : null);
			    campData.setDistrictName(data[2] != null ? (String) data[2] : null);
			    campData.setPocType(data[3] != null ? (String) data[3] : null);
			    campData.setCampsiteName(data[4] != null ? (String) data[4] : null);
			    campData.setDistrictNodalOfficerName(data[5] != null ? (String) data[5] : null);
			    campData.setContactNumber(data[6] != null ? (String) data[6] : null);

			    campData.setCampDate(data[7] != null ? (Date) data[7] : null);
			    campData.setReportDate(data[8] != null ? (Date) data[8] : null);
			    
			    campData.setUserId(data[9] != null ? (String) data[9] : null);        
			    
			    campData.setGeneratedDate(data[154] != null ? (Date) data[154] : null); 
			    
			    campData.setGuid(data[153] != null ? (String) data[153] : null);
			    
			    NewServiceUptake serviceUptake = new NewServiceUptake();
			    serviceUptake.setGeneralHealthCheckupMale(data[10] != null ? (Integer) data[10] : null);
			    serviceUptake.setGeneralHealthCheckupFemale(data[11] != null ? (Integer) data[11] : null);
			    serviceUptake.setGeneralHealthCheckupTransgender(data[12] != null ? (Integer) data[12] : null);
			    serviceUptake.setGeneralHealthCheckupTotal(data[13] != null ? (Integer) data[13] : null);
			    serviceUptake.setAntenatalCheckupFemale(data[14] != null ? (Integer) data[14] : null);
			    serviceUptake.setAntenatalCheckupTotal(data[15] != null ? (Integer) data[15] : null);
			    serviceUptake.setStiCheckupMale(data[16] != null ? (Integer) data[16] : null);
			    serviceUptake.setStiCheckupFemale(data[17] != null ? (Integer) data[17] : null);
			    serviceUptake.setStiCheckupTransgender(data[18] != null ? (Integer) data[18] : null);
			    serviceUptake.setStiCheckupTotal(data[19] != null ? (Integer) data[19] : null);
			    serviceUptake.setStiDiagnosedMale(data[20] != null ? (Integer) data[20] : null);
			    serviceUptake.setStiDiagnosedFemale(data[21] != null ? (Integer) data[21] : null);
			    serviceUptake.setStiDiagnosedTransgender(data[22] != null ? (Integer) data[22] : null);
			    serviceUptake.setStiDiagnosedTotal(data[23] != null ? (Integer) data[23] : null);
			    serviceUptake.setStiTreatedMale(data[24] != null ? (Integer) data[24] : null);
			    serviceUptake.setStiTreatedFemale(data[25] != null ? (Integer) data[25] : null);
			    serviceUptake.setStiTreatedTransgender(data[26] != null ? (Integer) data[26] : null);
			    serviceUptake.setStiTreatedTotal(data[27] != null ? (Integer) data[27] : null);
			    serviceUptake.setHivScreenedMale(data[28] != null ? (Integer) data[28] : null);
			    serviceUptake.setHivScreenedFemale(data[29] != null ? (Integer) data[29] : null);
			    serviceUptake.setHivScreenedTransgender(data[30] != null ? (Integer) data[30] : null);
			    serviceUptake.setHivScreenedTotal(data[31] != null ? (Integer) data[31] : null);
			    serviceUptake.setHivReactiveMale(data[32] != null ? (Integer) data[32] : null);
			    serviceUptake.setHivReactiveFemale(data[33] != null ? (Integer) data[33] : null);
			    serviceUptake.setHivReactiveTransgender(data[34] != null ? (Integer) data[34] : null);
			    serviceUptake.setHivReactiveTotal(data[35] != null ? (Integer) data[35] : null);
			    serviceUptake.setHivConfirmedPositiveMale(data[36] != null ? (Integer) data[36] : null);
			    serviceUptake.setHivConfirmedPositiveFemale(data[37] != null ? (Integer) data[37] : null);
			    serviceUptake.setHivConfirmedPositiveTransgender(data[38] != null ? (Integer) data[38] : null);
			    serviceUptake.setHivConfirmedPositiveTotal(data[39] != null ? (Integer) data[39] : null);
			    serviceUptake.setHivPositiveLinkedToArtMale(data[40] != null ? (Integer) data[40] : null);
			    serviceUptake.setHivPositiveLinkedToArtFemale(data[41] != null ? (Integer) data[41] : null);
			    serviceUptake.setHivPositiveLinkedToArtTransgender(data[42] != null ? (Integer) data[42] : null);
			    serviceUptake.setHivPositiveLinkedToArtTotal(data[43] != null ? (Integer) data[43] : null);
			    serviceUptake.setSyphilisScreenedMale(data[44] != null ? (Integer) data[44] : null);
			    serviceUptake.setSyphilisScreenedFemale(data[45] != null ? (Integer) data[45] : null);
			    serviceUptake.setSyphilisScreenedTransgender(data[46] != null ? (Integer) data[46] : null);
			    serviceUptake.setSyphilisScreenedTotal(data[47] != null ? (Integer) data[47] : null);
			    serviceUptake.setSyphilisReactiveMale(data[48] != null ? (Integer) data[48] : null);
			    serviceUptake.setSyphilisReactiveFemale(data[49] != null ? (Integer) data[49] : null);
			    serviceUptake.setSyphilisReactiveTransgender(data[50] != null ? (Integer) data[50] : null);
			    serviceUptake.setSyphilisReactiveTotal(data[51] != null ? (Integer) data[51] : null);
			    serviceUptake.setSyphilisTreatedMale(data[52] != null ? (Integer) data[52] : null);
			    serviceUptake.setSyphilisTreatedFemale(data[53] != null ? (Integer) data[53] : null);
			    serviceUptake.setSyphilisTreatedTransgender(data[54] != null ? (Integer) data[54] : null);
			    serviceUptake.setSyphilisTreatedTotal(data[55] != null ? (Integer) data[55] : null);
			    serviceUptake.setTbScreenedMale(data[56] != null ? (Integer) data[56] : null);
			    serviceUptake.setTbScreenedFemale(data[57] != null ? (Integer) data[57] : null);
			    serviceUptake.setTbScreenedTransgender(data[58] != null ? (Integer) data[58] : null);
			    serviceUptake.setTbScreenedTotal(data[59] != null ? (Integer) data[59] : null);
			    serviceUptake.setTbSuspectedMale(data[60] != null ? (Integer) data[60] : null);
			    serviceUptake.setTbSuspectedFemale(data[61] != null ? (Integer) data[61] : null);
			    serviceUptake.setTbSuspectedTransgender(data[62] != null ? (Integer) data[62] : null);
			    serviceUptake.setTbSuspectedTotal(data[63] != null ? (Integer) data[63] : null);
			    serviceUptake.setTbTestedMale(data[64] != null ? (Integer) data[64] : null);
			    serviceUptake.setTbTestedFemale(data[65] != null ? (Integer) data[65] : null);
			    serviceUptake.setTbTestedTransgender(data[66] != null ? (Integer) data[66] : null);
			    serviceUptake.setTbTestedTotal(data[67] != null ? (Integer) data[67] : null);
			    serviceUptake.setTbPositiveMale(data[68] != null ? (Integer) data[68] : null);
			    serviceUptake.setTbPositiveFemale(data[69] != null ? (Integer) data[69] : null);
			    serviceUptake.setTbPositiveTransgender(data[70] != null ? (Integer) data[70] : null);
			    serviceUptake.setTbPositiveTotal(data[71] != null ? (Integer) data[71] : null);
			    serviceUptake.setTbPositivePutOnDotsMale(data[72] != null ? (Integer) data[72] : null);
			    serviceUptake.setTbPositivePutOnDotsFemale(data[73] != null ? (Integer) data[73] : null);
			    serviceUptake.setTbPositivePutOnDotsTransgender(data[74] != null ? (Integer) data[74] : null);
			    serviceUptake.setTbPositivePutOnDotsTotal(data[75] != null ? (Integer) data[75] : null);
			    serviceUptake.setScreenedForHepBMale(data[76] != null ? (Integer) data[76] : null);
			    serviceUptake.setScreenedForHepBFemale(data[77] != null ? (Integer) data[77] : null);
			    serviceUptake.setScreenedForHepBTransgender(data[78] != null ? (Integer) data[78] : null);
			    serviceUptake.setScreenedForHepBTotal(data[79] != null ? (Integer) data[79] : null);
			    serviceUptake.setHepBReactiveMale(data[80] != null ? (Integer) data[80] : null);
			    serviceUptake.setHepBReactiveFemale(data[81] != null ? (Integer) data[81] : null);
			    serviceUptake.setHepBReactiveTransgender(data[82] != null ? (Integer) data[82] : null);
			    serviceUptake.setHepBReactiveTotal(data[83] != null ? (Integer) data[83] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentMale(data[84] != null ? (Integer) data[84] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentFemale(data[85] != null ? (Integer) data[85] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentTransgender(data[86] != null ? (Integer) data[86] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentTotal(data[87] != null ? (Integer) data[87] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentMale(data[88] != null ? (Integer) data[88] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentFemale(data[89] != null ? (Integer) data[89] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentTransgender(data[90] != null ? (Integer) data[90] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentTotal(data[91] != null ? (Integer) data[91] : null);
			    serviceUptake.setScreenedForHepCMale(data[92] != null ? (Integer) data[92] : null);
			    serviceUptake.setScreenedForHepCFemale(data[93] != null ? (Integer) data[93] : null);
			    serviceUptake.setScreenedForHepCTransgender(data[94] != null ? (Integer) data[94] : null);
			    serviceUptake.setScreenedForHepCTotal(data[95] != null ? (Integer) data[95] : null);
			    serviceUptake.setHepCReactiveMale(data[96] != null ? (Integer) data[96] : null);
			    serviceUptake.setHepCReactiveFemale(data[97] != null ? (Integer) data[97] : null);
			    serviceUptake.setHepCReactiveTransgender(data[98] != null ? (Integer) data[98] : null);
			    serviceUptake.setHepCReactiveTotal(data[99] != null ? (Integer) data[99] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentMale(data[100] != null ? (Integer) data[100] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentFemale(data[101] != null ? (Integer) data[101] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentTransgender(data[102] != null ? (Integer) data[102] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentTotal(data[103] != null ? (Integer) data[103] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentMale(data[104] != null ? (Integer) data[104] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentFemale(data[105] != null ? (Integer) data[105] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentTransgender(data[106] != null ? (Integer) data[106] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentTotal(data[107] != null ? (Integer) data[107] : null);
			    
			    
			    NewSTISyndromeDTO stiSyndrome = new NewSTISyndromeDTO();
			    stiSyndrome.setVcdFemale(data[108] != null ? ((Integer) data[108]).intValue() : null);
			    stiSyndrome.setVcdTotal(data[109] != null ? ((Integer) data[109]).intValue() : null);
			    stiSyndrome.setVcdTreated(data[110] != null ? ((Integer) data[110]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticMale(data[111] != null ? ((Integer) data[111]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticFemale(data[112] != null ? ((Integer) data[112]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticTGTS(data[113] != null ? ((Integer) data[113]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticTotal(data[114] != null ? ((Integer) data[114]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticTreated(data[115] != null ? ((Integer) data[115]).intValue() : null);
			    stiSyndrome.setGudHerpeticMale(data[116] != null ? ((Integer) data[116]).intValue() : null);
			    stiSyndrome.setGudHerpeticFemale(data[117] != null ? ((Integer) data[117]).intValue() : null);
			    stiSyndrome.setGudHerpeticTGTS(data[118] != null ? ((Integer) data[118]).intValue() : null);
			    stiSyndrome.setGudHerpeticTotal(data[119] != null ? ((Integer) data[119]).intValue() : null);
			    stiSyndrome.setGudHerpeticTreated(data[120] != null ? ((Integer) data[120]).intValue() : null);
			    stiSyndrome.setLapFemale(data[121] != null ? ((Integer) data[121]).intValue() : null);
			    stiSyndrome.setLapTotal(data[122] != null ? ((Integer) data[122]).intValue() : null);
			    stiSyndrome.setLapTreated(data[123] != null ? ((Integer) data[123]).intValue() : null);
			    stiSyndrome.setUdMale(data[124] != null ? ((Integer) data[124]).intValue() : null);
			    stiSyndrome.setUdTGTS(data[125] != null ? ((Integer) data[125]).intValue() : null);
			    stiSyndrome.setUdTotal(data[126] != null ? ((Integer) data[126]).intValue() : null);
			    stiSyndrome.setUdTreated(data[127] != null ? ((Integer) data[127]).intValue() : null);
			    stiSyndrome.setArdMale(data[128] != null ? ((Integer) data[128]).intValue() : null);
			    stiSyndrome.setArdFemale(data[129] != null ? ((Integer) data[129]).intValue() : null);
			    stiSyndrome.setArdTGTS(data[130] != null ? ((Integer) data[130]).intValue() : null);
			    stiSyndrome.setArdTotal(data[131] != null ? ((Integer) data[131]).intValue() : null);
			    stiSyndrome.setArdTreated(data[132] != null ? ((Integer) data[132]).intValue() : null);    
			    stiSyndrome.setIbMale(data[133] != null ? ((Integer) data[133]).intValue() : null);
			    stiSyndrome.setIbFemale(data[134] != null ? ((Integer) data[134]).intValue() : null);
			    stiSyndrome.setIbTGTS(data[135] != null ? ((Integer) data[135]).intValue() : null);
			    stiSyndrome.setIbTotal(data[136] != null ? ((Integer) data[136]).intValue() : null);
			    stiSyndrome.setIbTreated(data[137] != null ? ((Integer) data[137]).intValue() : null);
			    stiSyndrome.setSsMale(data[138] != null ? ((Integer) data[138]).intValue() : null);
			    stiSyndrome.setSsTGTS(data[139] != null ? ((Integer) data[139]).intValue() : null);
			    stiSyndrome.setSsTotal(data[140] != null ? ((Integer) data[140]).intValue() : null);
			    stiSyndrome.setSsTreated(data[141] != null ? ((Integer) data[141]).intValue() : null);
			    stiSyndrome.setGenitalWartsMale(data[142] != null ? ((Integer) data[142]).intValue() : null);
			    stiSyndrome.setGenitalWartsFemale(data[143] != null ? ((Integer) data[143]).intValue() : null);
			    stiSyndrome.setGenitalWartsTGTS(data[144] != null ? ((Integer) data[144]).intValue() : null);
			    stiSyndrome.setGenitalWartsTotal(data[145] != null ? ((Integer) data[145]).intValue() : null);
			    stiSyndrome.setGenitalWartsTreated(data[146] != null ? ((Integer) data[146]).intValue() : null);
			    stiSyndrome.setOtherSTIsMale(data[147] != null ? ((Integer) data[147]).intValue() : null);
			    stiSyndrome.setOtherSTIsFemale(data[148] != null ? ((Integer) data[148]).intValue() : null);
			    stiSyndrome.setOtherSTIsTGTS(data[149] != null ? ((Integer) data[149]).intValue() : null);
			    stiSyndrome.setOtherSTIsTotal(data[150] != null ? ((Integer) data[150]).intValue() : null);
			    stiSyndrome.setOtherSTIsTreated(data[151] != null ? ((Integer) data[151]).intValue() : null);
			    stiSyndrome.setOtherInformation(data[152] != null ? (String) data[152] : null);

			    NewHealthCamp healthCamp = new NewHealthCamp(campData,serviceUptake,stiSyndrome);
			    healthCamp.setCampData(campData);
	            healthCamp.setNewserviceUptake(serviceUptake);
	            healthCamp.setNewstiSyndrome(stiSyndrome);

	            healthCamps.add(healthCamp);
	        }

	        return healthCamps;
	    }
	  
	  public List<NewHealthCamp> getAllData() {
		  
		  List<Object[]> dataList = prisonRepo.getAllData();
		  
		  List<NewHealthCamp> healthCamps = new ArrayList<>();
		  for (Object[] data : dataList) {
			  
			    CampData campData = new CampData();
			    campData.setId(data[0] != null ? ((Integer) data[0]).longValue() : null);
			    campData.setStateName(data[1] != null ? (String) data[1] : null);
			    campData.setDistrictName(data[2] != null ? (String) data[2] : null);
			    campData.setPocType(data[3] != null ? (String) data[3] : null);
			    campData.setCampsiteName(data[4] != null ? (String) data[4] : null);
			    campData.setDistrictNodalOfficerName(data[5] != null ? (String) data[5] : null);
			    campData.setContactNumber(data[6] != null ? (String) data[6] : null);

			    campData.setCampDate(data[7] != null ? (Date) data[7] : null);
			    campData.setReportDate(data[8] != null ? (Date) data[8] : null);
			    
			    campData.setUserId(data[9] != null ? (String) data[9] : null);        
			    
			    campData.setGeneratedDate(data[154] != null ? (Date) data[154] : null); 
			    
			    campData.setGuid(data[153] != null ? (String) data[153] : null);
			    
			    NewServiceUptake serviceUptake = new NewServiceUptake();
			    serviceUptake.setGeneralHealthCheckupMale(data[10] != null ? (Integer) data[10] : null);
			    serviceUptake.setGeneralHealthCheckupFemale(data[11] != null ? (Integer) data[11] : null);
			    serviceUptake.setGeneralHealthCheckupTransgender(data[12] != null ? (Integer) data[12] : null);
			    serviceUptake.setGeneralHealthCheckupTotal(data[13] != null ? (Integer) data[13] : null);
			    serviceUptake.setAntenatalCheckupFemale(data[14] != null ? (Integer) data[14] : null);
			    serviceUptake.setAntenatalCheckupTotal(data[15] != null ? (Integer) data[15] : null);
			    serviceUptake.setStiCheckupMale(data[16] != null ? (Integer) data[16] : null);
			    serviceUptake.setStiCheckupFemale(data[17] != null ? (Integer) data[17] : null);
			    serviceUptake.setStiCheckupTransgender(data[18] != null ? (Integer) data[18] : null);
			    serviceUptake.setStiCheckupTotal(data[19] != null ? (Integer) data[19] : null);
			    serviceUptake.setStiDiagnosedMale(data[20] != null ? (Integer) data[20] : null);
			    serviceUptake.setStiDiagnosedFemale(data[21] != null ? (Integer) data[21] : null);
			    serviceUptake.setStiDiagnosedTransgender(data[22] != null ? (Integer) data[22] : null);
			    serviceUptake.setStiDiagnosedTotal(data[23] != null ? (Integer) data[23] : null);
			    serviceUptake.setStiTreatedMale(data[24] != null ? (Integer) data[24] : null);
			    serviceUptake.setStiTreatedFemale(data[25] != null ? (Integer) data[25] : null);
			    serviceUptake.setStiTreatedTransgender(data[26] != null ? (Integer) data[26] : null);
			    serviceUptake.setStiTreatedTotal(data[27] != null ? (Integer) data[27] : null);
			    serviceUptake.setHivScreenedMale(data[28] != null ? (Integer) data[28] : null);
			    serviceUptake.setHivScreenedFemale(data[29] != null ? (Integer) data[29] : null);
			    serviceUptake.setHivScreenedTransgender(data[30] != null ? (Integer) data[30] : null);
			    serviceUptake.setHivScreenedTotal(data[31] != null ? (Integer) data[31] : null);
			    serviceUptake.setHivReactiveMale(data[32] != null ? (Integer) data[32] : null);
			    serviceUptake.setHivReactiveFemale(data[33] != null ? (Integer) data[33] : null);
			    serviceUptake.setHivReactiveTransgender(data[34] != null ? (Integer) data[34] : null);
			    serviceUptake.setHivReactiveTotal(data[35] != null ? (Integer) data[35] : null);
			    serviceUptake.setHivConfirmedPositiveMale(data[36] != null ? (Integer) data[36] : null);
			    serviceUptake.setHivConfirmedPositiveFemale(data[37] != null ? (Integer) data[37] : null);
			    serviceUptake.setHivConfirmedPositiveTransgender(data[38] != null ? (Integer) data[38] : null);
			    serviceUptake.setHivConfirmedPositiveTotal(data[39] != null ? (Integer) data[39] : null);
			    serviceUptake.setHivPositiveLinkedToArtMale(data[40] != null ? (Integer) data[40] : null);
			    serviceUptake.setHivPositiveLinkedToArtFemale(data[41] != null ? (Integer) data[41] : null);
			    serviceUptake.setHivPositiveLinkedToArtTransgender(data[42] != null ? (Integer) data[42] : null);
			    serviceUptake.setHivPositiveLinkedToArtTotal(data[43] != null ? (Integer) data[43] : null);
			    serviceUptake.setSyphilisScreenedMale(data[44] != null ? (Integer) data[44] : null);
			    serviceUptake.setSyphilisScreenedFemale(data[45] != null ? (Integer) data[45] : null);
			    serviceUptake.setSyphilisScreenedTransgender(data[46] != null ? (Integer) data[46] : null);
			    serviceUptake.setSyphilisScreenedTotal(data[47] != null ? (Integer) data[47] : null);
			    serviceUptake.setSyphilisReactiveMale(data[48] != null ? (Integer) data[48] : null);
			    serviceUptake.setSyphilisReactiveFemale(data[49] != null ? (Integer) data[49] : null);
			    serviceUptake.setSyphilisReactiveTransgender(data[50] != null ? (Integer) data[50] : null);
			    serviceUptake.setSyphilisReactiveTotal(data[51] != null ? (Integer) data[51] : null);
			    serviceUptake.setSyphilisTreatedMale(data[52] != null ? (Integer) data[52] : null);
			    serviceUptake.setSyphilisTreatedFemale(data[53] != null ? (Integer) data[53] : null);
			    serviceUptake.setSyphilisTreatedTransgender(data[54] != null ? (Integer) data[54] : null);
			    serviceUptake.setSyphilisTreatedTotal(data[55] != null ? (Integer) data[55] : null);
			    serviceUptake.setTbScreenedMale(data[56] != null ? (Integer) data[56] : null);
			    serviceUptake.setTbScreenedFemale(data[57] != null ? (Integer) data[57] : null);
			    serviceUptake.setTbScreenedTransgender(data[58] != null ? (Integer) data[58] : null);
			    serviceUptake.setTbScreenedTotal(data[59] != null ? (Integer) data[59] : null);
			    serviceUptake.setTbSuspectedMale(data[60] != null ? (Integer) data[60] : null);
			    serviceUptake.setTbSuspectedFemale(data[61] != null ? (Integer) data[61] : null);
			    serviceUptake.setTbSuspectedTransgender(data[62] != null ? (Integer) data[62] : null);
			    serviceUptake.setTbSuspectedTotal(data[63] != null ? (Integer) data[63] : null);
			    serviceUptake.setTbTestedMale(data[64] != null ? (Integer) data[64] : null);
			    serviceUptake.setTbTestedFemale(data[65] != null ? (Integer) data[65] : null);
			    serviceUptake.setTbTestedTransgender(data[66] != null ? (Integer) data[66] : null);
			    serviceUptake.setTbTestedTotal(data[67] != null ? (Integer) data[67] : null);
			    serviceUptake.setTbPositiveMale(data[68] != null ? (Integer) data[68] : null);
			    serviceUptake.setTbPositiveFemale(data[69] != null ? (Integer) data[69] : null);
			    serviceUptake.setTbPositiveTransgender(data[70] != null ? (Integer) data[70] : null);
			    serviceUptake.setTbPositiveTotal(data[71] != null ? (Integer) data[71] : null);
			    serviceUptake.setTbPositivePutOnDotsMale(data[72] != null ? (Integer) data[72] : null);
			    serviceUptake.setTbPositivePutOnDotsFemale(data[73] != null ? (Integer) data[73] : null);
			    serviceUptake.setTbPositivePutOnDotsTransgender(data[74] != null ? (Integer) data[74] : null);
			    serviceUptake.setTbPositivePutOnDotsTotal(data[75] != null ? (Integer) data[75] : null);
			    serviceUptake.setScreenedForHepBMale(data[76] != null ? (Integer) data[76] : null);
			    serviceUptake.setScreenedForHepBFemale(data[77] != null ? (Integer) data[77] : null);
			    serviceUptake.setScreenedForHepBTransgender(data[78] != null ? (Integer) data[78] : null);
			    serviceUptake.setScreenedForHepBTotal(data[79] != null ? (Integer) data[79] : null);
			    serviceUptake.setHepBReactiveMale(data[80] != null ? (Integer) data[80] : null);
			    serviceUptake.setHepBReactiveFemale(data[81] != null ? (Integer) data[81] : null);
			    serviceUptake.setHepBReactiveTransgender(data[82] != null ? (Integer) data[82] : null);
			    serviceUptake.setHepBReactiveTotal(data[83] != null ? (Integer) data[83] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentMale(data[84] != null ? (Integer) data[84] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentFemale(data[85] != null ? (Integer) data[85] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentTransgender(data[86] != null ? (Integer) data[86] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentTotal(data[87] != null ? (Integer) data[87] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentMale(data[88] != null ? (Integer) data[88] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentFemale(data[89] != null ? (Integer) data[89] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentTransgender(data[90] != null ? (Integer) data[90] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentTotal(data[91] != null ? (Integer) data[91] : null);
			    serviceUptake.setScreenedForHepCMale(data[92] != null ? (Integer) data[92] : null);
			    serviceUptake.setScreenedForHepCFemale(data[93] != null ? (Integer) data[93] : null);
			    serviceUptake.setScreenedForHepCTransgender(data[94] != null ? (Integer) data[94] : null);
			    serviceUptake.setScreenedForHepCTotal(data[95] != null ? (Integer) data[95] : null);
			    serviceUptake.setHepCReactiveMale(data[96] != null ? (Integer) data[96] : null);
			    serviceUptake.setHepCReactiveFemale(data[97] != null ? (Integer) data[97] : null);
			    serviceUptake.setHepCReactiveTransgender(data[98] != null ? (Integer) data[98] : null);
			    serviceUptake.setHepCReactiveTotal(data[99] != null ? (Integer) data[99] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentMale(data[100] != null ? (Integer) data[100] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentFemale(data[101] != null ? (Integer) data[101] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentTransgender(data[102] != null ? (Integer) data[102] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentTotal(data[103] != null ? (Integer) data[103] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentMale(data[104] != null ? (Integer) data[104] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentFemale(data[105] != null ? (Integer) data[105] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentTransgender(data[106] != null ? (Integer) data[106] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentTotal(data[107] != null ? (Integer) data[107] : null);
			    
			    
			    NewSTISyndromeDTO stiSyndrome = new NewSTISyndromeDTO();
			    stiSyndrome.setVcdFemale(data[108] != null ? ((Integer) data[108]).intValue() : null);
			    stiSyndrome.setVcdTotal(data[109] != null ? ((Integer) data[109]).intValue() : null);
			    stiSyndrome.setVcdTreated(data[110] != null ? ((Integer) data[110]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticMale(data[111] != null ? ((Integer) data[111]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticFemale(data[112] != null ? ((Integer) data[112]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticTGTS(data[113] != null ? ((Integer) data[113]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticTotal(data[114] != null ? ((Integer) data[114]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticTreated(data[115] != null ? ((Integer) data[115]).intValue() : null);
			    stiSyndrome.setGudHerpeticMale(data[116] != null ? ((Integer) data[116]).intValue() : null);
			    stiSyndrome.setGudHerpeticFemale(data[117] != null ? ((Integer) data[117]).intValue() : null);
			    stiSyndrome.setGudHerpeticTGTS(data[118] != null ? ((Integer) data[118]).intValue() : null);
			    stiSyndrome.setGudHerpeticTotal(data[119] != null ? ((Integer) data[119]).intValue() : null);
			    stiSyndrome.setGudHerpeticTreated(data[120] != null ? ((Integer) data[120]).intValue() : null);
			    stiSyndrome.setLapFemale(data[121] != null ? ((Integer) data[121]).intValue() : null);
			    stiSyndrome.setLapTotal(data[122] != null ? ((Integer) data[122]).intValue() : null);
			    stiSyndrome.setLapTreated(data[123] != null ? ((Integer) data[123]).intValue() : null);
			    stiSyndrome.setUdMale(data[124] != null ? ((Integer) data[124]).intValue() : null);
			    stiSyndrome.setUdTGTS(data[125] != null ? ((Integer) data[125]).intValue() : null);
			    stiSyndrome.setUdTotal(data[126] != null ? ((Integer) data[126]).intValue() : null);
			    stiSyndrome.setUdTreated(data[127] != null ? ((Integer) data[127]).intValue() : null);
			    stiSyndrome.setArdMale(data[128] != null ? ((Integer) data[128]).intValue() : null);
			    stiSyndrome.setArdFemale(data[129] != null ? ((Integer) data[129]).intValue() : null);
			    stiSyndrome.setArdTGTS(data[130] != null ? ((Integer) data[130]).intValue() : null);
			    stiSyndrome.setArdTotal(data[131] != null ? ((Integer) data[131]).intValue() : null);
			    stiSyndrome.setArdTreated(data[132] != null ? ((Integer) data[132]).intValue() : null);    
			    stiSyndrome.setIbMale(data[133] != null ? ((Integer) data[133]).intValue() : null);
			    stiSyndrome.setIbFemale(data[134] != null ? ((Integer) data[134]).intValue() : null);
			    stiSyndrome.setIbTGTS(data[135] != null ? ((Integer) data[135]).intValue() : null);
			    stiSyndrome.setIbTotal(data[136] != null ? ((Integer) data[136]).intValue() : null);
			    stiSyndrome.setIbTreated(data[137] != null ? ((Integer) data[137]).intValue() : null);
			    stiSyndrome.setSsMale(data[138] != null ? ((Integer) data[138]).intValue() : null);
			    stiSyndrome.setSsTGTS(data[139] != null ? ((Integer) data[139]).intValue() : null);
			    stiSyndrome.setSsTotal(data[140] != null ? ((Integer) data[140]).intValue() : null);
			    stiSyndrome.setSsTreated(data[141] != null ? ((Integer) data[141]).intValue() : null);
			    stiSyndrome.setGenitalWartsMale(data[142] != null ? ((Integer) data[142]).intValue() : null);
			    stiSyndrome.setGenitalWartsFemale(data[143] != null ? ((Integer) data[143]).intValue() : null);
			    stiSyndrome.setGenitalWartsTGTS(data[144] != null ? ((Integer) data[144]).intValue() : null);
			    stiSyndrome.setGenitalWartsTotal(data[145] != null ? ((Integer) data[145]).intValue() : null);
			    stiSyndrome.setGenitalWartsTreated(data[146] != null ? ((Integer) data[146]).intValue() : null);
			    stiSyndrome.setOtherSTIsMale(data[147] != null ? ((Integer) data[147]).intValue() : null);
			    stiSyndrome.setOtherSTIsFemale(data[148] != null ? ((Integer) data[148]).intValue() : null);
			    stiSyndrome.setOtherSTIsTGTS(data[149] != null ? ((Integer) data[149]).intValue() : null);
			    stiSyndrome.setOtherSTIsTotal(data[150] != null ? ((Integer) data[150]).intValue() : null);
			    stiSyndrome.setOtherSTIsTreated(data[151] != null ? ((Integer) data[151]).intValue() : null);
			    stiSyndrome.setOtherInformation(data[152] != null ? (String) data[152] : null);

			    NewHealthCamp healthCamp = new NewHealthCamp(campData,serviceUptake,stiSyndrome);
			    healthCamp.setCampData(campData);
	            healthCamp.setNewserviceUptake(serviceUptake);
	            healthCamp.setNewstiSyndrome(stiSyndrome);

	            healthCamps.add(healthCamp);
	        }

	        return healthCamps;
	    }
	  
	  public List<NewHealthCamp> getUserData(String userid) {
		  
		  List<Object[]> dataList = prisonRepo.getUserData(userid);
		  
		  List<NewHealthCamp> healthCamps = new ArrayList<>();
		  for (Object[] data : dataList) {
			  
			    CampData campData = new CampData();
			    campData.setId(data[0] != null ? ((Integer) data[0]).longValue() : null);
			    campData.setStateName(data[1] != null ? (String) data[1] : null);
			    campData.setDistrictName(data[2] != null ? (String) data[2] : null);
			    campData.setPocType(data[3] != null ? (String) data[3] : null);
			    campData.setCampsiteName(data[4] != null ? (String) data[4] : null);
			    campData.setDistrictNodalOfficerName(data[5] != null ? (String) data[5] : null);
			    campData.setContactNumber(data[6] != null ? (String) data[6] : null);

			    campData.setCampDate(data[7] != null ? (Date) data[7] : null);
			    campData.setReportDate(data[8] != null ? (Date) data[8] : null);
			    
			    campData.setUserId(data[9] != null ? (String) data[9] : null);        
			    
			    campData.setGeneratedDate(data[154] != null ? (Date) data[154] : null); 
			    
			    campData.setGuid(data[153] != null ? (String) data[153] : null);
			    
			    NewServiceUptake serviceUptake = new NewServiceUptake();
			    serviceUptake.setGeneralHealthCheckupMale(data[10] != null ? (Integer) data[10] : null);
			    serviceUptake.setGeneralHealthCheckupFemale(data[11] != null ? (Integer) data[11] : null);
			    serviceUptake.setGeneralHealthCheckupTransgender(data[12] != null ? (Integer) data[12] : null);
			    serviceUptake.setGeneralHealthCheckupTotal(data[13] != null ? (Integer) data[13] : null);
			    serviceUptake.setAntenatalCheckupFemale(data[14] != null ? (Integer) data[14] : null);
			    serviceUptake.setAntenatalCheckupTotal(data[15] != null ? (Integer) data[15] : null);
			    serviceUptake.setStiCheckupMale(data[16] != null ? (Integer) data[16] : null);
			    serviceUptake.setStiCheckupFemale(data[17] != null ? (Integer) data[17] : null);
			    serviceUptake.setStiCheckupTransgender(data[18] != null ? (Integer) data[18] : null);
			    serviceUptake.setStiCheckupTotal(data[19] != null ? (Integer) data[19] : null);
			    serviceUptake.setStiDiagnosedMale(data[20] != null ? (Integer) data[20] : null);
			    serviceUptake.setStiDiagnosedFemale(data[21] != null ? (Integer) data[21] : null);
			    serviceUptake.setStiDiagnosedTransgender(data[22] != null ? (Integer) data[22] : null);
			    serviceUptake.setStiDiagnosedTotal(data[23] != null ? (Integer) data[23] : null);
			    serviceUptake.setStiTreatedMale(data[24] != null ? (Integer) data[24] : null);
			    serviceUptake.setStiTreatedFemale(data[25] != null ? (Integer) data[25] : null);
			    serviceUptake.setStiTreatedTransgender(data[26] != null ? (Integer) data[26] : null);
			    serviceUptake.setStiTreatedTotal(data[27] != null ? (Integer) data[27] : null);
			    serviceUptake.setHivScreenedMale(data[28] != null ? (Integer) data[28] : null);
			    serviceUptake.setHivScreenedFemale(data[29] != null ? (Integer) data[29] : null);
			    serviceUptake.setHivScreenedTransgender(data[30] != null ? (Integer) data[30] : null);
			    serviceUptake.setHivScreenedTotal(data[31] != null ? (Integer) data[31] : null);
			    serviceUptake.setHivReactiveMale(data[32] != null ? (Integer) data[32] : null);
			    serviceUptake.setHivReactiveFemale(data[33] != null ? (Integer) data[33] : null);
			    serviceUptake.setHivReactiveTransgender(data[34] != null ? (Integer) data[34] : null);
			    serviceUptake.setHivReactiveTotal(data[35] != null ? (Integer) data[35] : null);
			    serviceUptake.setHivConfirmedPositiveMale(data[36] != null ? (Integer) data[36] : null);
			    serviceUptake.setHivConfirmedPositiveFemale(data[37] != null ? (Integer) data[37] : null);
			    serviceUptake.setHivConfirmedPositiveTransgender(data[38] != null ? (Integer) data[38] : null);
			    serviceUptake.setHivConfirmedPositiveTotal(data[39] != null ? (Integer) data[39] : null);
			    serviceUptake.setHivPositiveLinkedToArtMale(data[40] != null ? (Integer) data[40] : null);
			    serviceUptake.setHivPositiveLinkedToArtFemale(data[41] != null ? (Integer) data[41] : null);
			    serviceUptake.setHivPositiveLinkedToArtTransgender(data[42] != null ? (Integer) data[42] : null);
			    serviceUptake.setHivPositiveLinkedToArtTotal(data[43] != null ? (Integer) data[43] : null);
			    serviceUptake.setSyphilisScreenedMale(data[44] != null ? (Integer) data[44] : null);
			    serviceUptake.setSyphilisScreenedFemale(data[45] != null ? (Integer) data[45] : null);
			    serviceUptake.setSyphilisScreenedTransgender(data[46] != null ? (Integer) data[46] : null);
			    serviceUptake.setSyphilisScreenedTotal(data[47] != null ? (Integer) data[47] : null);
			    serviceUptake.setSyphilisReactiveMale(data[48] != null ? (Integer) data[48] : null);
			    serviceUptake.setSyphilisReactiveFemale(data[49] != null ? (Integer) data[49] : null);
			    serviceUptake.setSyphilisReactiveTransgender(data[50] != null ? (Integer) data[50] : null);
			    serviceUptake.setSyphilisReactiveTotal(data[51] != null ? (Integer) data[51] : null);
			    serviceUptake.setSyphilisTreatedMale(data[52] != null ? (Integer) data[52] : null);
			    serviceUptake.setSyphilisTreatedFemale(data[53] != null ? (Integer) data[53] : null);
			    serviceUptake.setSyphilisTreatedTransgender(data[54] != null ? (Integer) data[54] : null);
			    serviceUptake.setSyphilisTreatedTotal(data[55] != null ? (Integer) data[55] : null);
			    serviceUptake.setTbScreenedMale(data[56] != null ? (Integer) data[56] : null);
			    serviceUptake.setTbScreenedFemale(data[57] != null ? (Integer) data[57] : null);
			    serviceUptake.setTbScreenedTransgender(data[58] != null ? (Integer) data[58] : null);
			    serviceUptake.setTbScreenedTotal(data[59] != null ? (Integer) data[59] : null);
			    serviceUptake.setTbSuspectedMale(data[60] != null ? (Integer) data[60] : null);
			    serviceUptake.setTbSuspectedFemale(data[61] != null ? (Integer) data[61] : null);
			    serviceUptake.setTbSuspectedTransgender(data[62] != null ? (Integer) data[62] : null);
			    serviceUptake.setTbSuspectedTotal(data[63] != null ? (Integer) data[63] : null);
			    serviceUptake.setTbTestedMale(data[64] != null ? (Integer) data[64] : null);
			    serviceUptake.setTbTestedFemale(data[65] != null ? (Integer) data[65] : null);
			    serviceUptake.setTbTestedTransgender(data[66] != null ? (Integer) data[66] : null);
			    serviceUptake.setTbTestedTotal(data[67] != null ? (Integer) data[67] : null);
			    serviceUptake.setTbPositiveMale(data[68] != null ? (Integer) data[68] : null);
			    serviceUptake.setTbPositiveFemale(data[69] != null ? (Integer) data[69] : null);
			    serviceUptake.setTbPositiveTransgender(data[70] != null ? (Integer) data[70] : null);
			    serviceUptake.setTbPositiveTotal(data[71] != null ? (Integer) data[71] : null);
			    serviceUptake.setTbPositivePutOnDotsMale(data[72] != null ? (Integer) data[72] : null);
			    serviceUptake.setTbPositivePutOnDotsFemale(data[73] != null ? (Integer) data[73] : null);
			    serviceUptake.setTbPositivePutOnDotsTransgender(data[74] != null ? (Integer) data[74] : null);
			    serviceUptake.setTbPositivePutOnDotsTotal(data[75] != null ? (Integer) data[75] : null);
			    serviceUptake.setScreenedForHepBMale(data[76] != null ? (Integer) data[76] : null);
			    serviceUptake.setScreenedForHepBFemale(data[77] != null ? (Integer) data[77] : null);
			    serviceUptake.setScreenedForHepBTransgender(data[78] != null ? (Integer) data[78] : null);
			    serviceUptake.setScreenedForHepBTotal(data[79] != null ? (Integer) data[79] : null);
			    serviceUptake.setHepBReactiveMale(data[80] != null ? (Integer) data[80] : null);
			    serviceUptake.setHepBReactiveFemale(data[81] != null ? (Integer) data[81] : null);
			    serviceUptake.setHepBReactiveTransgender(data[82] != null ? (Integer) data[82] : null);
			    serviceUptake.setHepBReactiveTotal(data[83] != null ? (Integer) data[83] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentMale(data[84] != null ? (Integer) data[84] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentFemale(data[85] != null ? (Integer) data[85] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentTransgender(data[86] != null ? (Integer) data[86] : null);
			    serviceUptake.setHepBReactiveLinkedForTreatmentTotal(data[87] != null ? (Integer) data[87] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentMale(data[88] != null ? (Integer) data[88] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentFemale(data[89] != null ? (Integer) data[89] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentTransgender(data[90] != null ? (Integer) data[90] : null);
			    serviceUptake.setHepBPositivePutOnTreatmentTotal(data[91] != null ? (Integer) data[91] : null);
			    serviceUptake.setScreenedForHepCMale(data[92] != null ? (Integer) data[92] : null);
			    serviceUptake.setScreenedForHepCFemale(data[93] != null ? (Integer) data[93] : null);
			    serviceUptake.setScreenedForHepCTransgender(data[94] != null ? (Integer) data[94] : null);
			    serviceUptake.setScreenedForHepCTotal(data[95] != null ? (Integer) data[95] : null);
			    serviceUptake.setHepCReactiveMale(data[96] != null ? (Integer) data[96] : null);
			    serviceUptake.setHepCReactiveFemale(data[97] != null ? (Integer) data[97] : null);
			    serviceUptake.setHepCReactiveTransgender(data[98] != null ? (Integer) data[98] : null);
			    serviceUptake.setHepCReactiveTotal(data[99] != null ? (Integer) data[99] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentMale(data[100] != null ? (Integer) data[100] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentFemale(data[101] != null ? (Integer) data[101] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentTransgender(data[102] != null ? (Integer) data[102] : null);
			    serviceUptake.setHepCReactiveLinkedForTreatmentTotal(data[103] != null ? (Integer) data[103] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentMale(data[104] != null ? (Integer) data[104] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentFemale(data[105] != null ? (Integer) data[105] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentTransgender(data[106] != null ? (Integer) data[106] : null);
			    serviceUptake.setHepCPositivePutOnTreatmentTotal(data[107] != null ? (Integer) data[107] : null);
			    
			    
			    NewSTISyndromeDTO stiSyndrome = new NewSTISyndromeDTO();
			    stiSyndrome.setVcdFemale(data[108] != null ? ((Integer) data[108]).intValue() : null);
			    stiSyndrome.setVcdTotal(data[109] != null ? ((Integer) data[109]).intValue() : null);
			    stiSyndrome.setVcdTreated(data[110] != null ? ((Integer) data[110]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticMale(data[111] != null ? ((Integer) data[111]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticFemale(data[112] != null ? ((Integer) data[112]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticTGTS(data[113] != null ? ((Integer) data[113]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticTotal(data[114] != null ? ((Integer) data[114]).intValue() : null);
			    stiSyndrome.setGudNonHerpeticTreated(data[115] != null ? ((Integer) data[115]).intValue() : null);
			    stiSyndrome.setGudHerpeticMale(data[116] != null ? ((Integer) data[116]).intValue() : null);
			    stiSyndrome.setGudHerpeticFemale(data[117] != null ? ((Integer) data[117]).intValue() : null);
			    stiSyndrome.setGudHerpeticTGTS(data[118] != null ? ((Integer) data[118]).intValue() : null);
			    stiSyndrome.setGudHerpeticTotal(data[119] != null ? ((Integer) data[119]).intValue() : null);
			    stiSyndrome.setGudHerpeticTreated(data[120] != null ? ((Integer) data[120]).intValue() : null);
			    stiSyndrome.setLapFemale(data[121] != null ? ((Integer) data[121]).intValue() : null);
			    stiSyndrome.setLapTotal(data[122] != null ? ((Integer) data[122]).intValue() : null);
			    stiSyndrome.setLapTreated(data[123] != null ? ((Integer) data[123]).intValue() : null);
			    stiSyndrome.setUdMale(data[124] != null ? ((Integer) data[124]).intValue() : null);
			    stiSyndrome.setUdTGTS(data[125] != null ? ((Integer) data[125]).intValue() : null);
			    stiSyndrome.setUdTotal(data[126] != null ? ((Integer) data[126]).intValue() : null);
			    stiSyndrome.setUdTreated(data[127] != null ? ((Integer) data[127]).intValue() : null);
			    stiSyndrome.setArdMale(data[128] != null ? ((Integer) data[128]).intValue() : null);
			    stiSyndrome.setArdFemale(data[129] != null ? ((Integer) data[129]).intValue() : null);
			    stiSyndrome.setArdTGTS(data[130] != null ? ((Integer) data[130]).intValue() : null);
			    stiSyndrome.setArdTotal(data[131] != null ? ((Integer) data[131]).intValue() : null);
			    stiSyndrome.setArdTreated(data[132] != null ? ((Integer) data[132]).intValue() : null);    
			    stiSyndrome.setIbMale(data[133] != null ? ((Integer) data[133]).intValue() : null);
			    stiSyndrome.setIbFemale(data[134] != null ? ((Integer) data[134]).intValue() : null);
			    stiSyndrome.setIbTGTS(data[135] != null ? ((Integer) data[135]).intValue() : null);
			    stiSyndrome.setIbTotal(data[136] != null ? ((Integer) data[136]).intValue() : null);
			    stiSyndrome.setIbTreated(data[137] != null ? ((Integer) data[137]).intValue() : null);
			    stiSyndrome.setSsMale(data[138] != null ? ((Integer) data[138]).intValue() : null);
			    stiSyndrome.setSsTGTS(data[139] != null ? ((Integer) data[139]).intValue() : null);
			    stiSyndrome.setSsTotal(data[140] != null ? ((Integer) data[140]).intValue() : null);
			    stiSyndrome.setSsTreated(data[141] != null ? ((Integer) data[141]).intValue() : null);
			    stiSyndrome.setGenitalWartsMale(data[142] != null ? ((Integer) data[142]).intValue() : null);
			    stiSyndrome.setGenitalWartsFemale(data[143] != null ? ((Integer) data[143]).intValue() : null);
			    stiSyndrome.setGenitalWartsTGTS(data[144] != null ? ((Integer) data[144]).intValue() : null);
			    stiSyndrome.setGenitalWartsTotal(data[145] != null ? ((Integer) data[145]).intValue() : null);
			    stiSyndrome.setGenitalWartsTreated(data[146] != null ? ((Integer) data[146]).intValue() : null);
			    stiSyndrome.setOtherSTIsMale(data[147] != null ? ((Integer) data[147]).intValue() : null);
			    stiSyndrome.setOtherSTIsFemale(data[148] != null ? ((Integer) data[148]).intValue() : null);
			    stiSyndrome.setOtherSTIsTGTS(data[149] != null ? ((Integer) data[149]).intValue() : null);
			    stiSyndrome.setOtherSTIsTotal(data[150] != null ? ((Integer) data[150]).intValue() : null);
			    stiSyndrome.setOtherSTIsTreated(data[151] != null ? ((Integer) data[151]).intValue() : null);
			    stiSyndrome.setOtherInformation(data[152] != null ? (String) data[152] : null);

			    NewHealthCamp healthCamp = new NewHealthCamp(campData,serviceUptake,stiSyndrome);
			    healthCamp.setCampData(campData);
	            healthCamp.setNewserviceUptake(serviceUptake);
	            healthCamp.setNewstiSyndrome(stiSyndrome);

	            healthCamps.add(healthCamp);
	        }

	        return healthCamps;
	    }
	    
		/*
		 * Long lastInsertedId() { return campDataRepository.getLastInsertedId(); }
		 */
	    
	    public void saveServiceUptake(NewHealthCamp healthCamp, String guid) {
	    	 logger.info("inside save Services");
	    	 NewServiceUptake serviceUptake = healthCamp.getNewserviceUptake();
	    	 logger.info(serviceUptake.getAntenatalCheckupFemale()+"Abc");
	    	 prisonRepo.insertServiceUptake(
	    			    serviceUptake.getGeneralHealthCheckupMale(),
	    			    serviceUptake.getGeneralHealthCheckupFemale(),
	    			    serviceUptake.getGeneralHealthCheckupTransgender(),
	    			    serviceUptake.getGeneralHealthCheckupTotal(),
	    			    serviceUptake.getAntenatalCheckupFemale(),
	    			    serviceUptake.getAntenatalCheckupTotal(),
	    			    serviceUptake.getStiCheckupMale(),
	    			    serviceUptake.getStiCheckupFemale(),
	    			    serviceUptake.getStiCheckupTransgender(),
	    			    serviceUptake.getStiCheckupTotal(),
	    			    serviceUptake.getStiDiagnosedMale(),
	    			    serviceUptake.getStiDiagnosedFemale(),
	    			    serviceUptake.getStiDiagnosedTransgender(),
	    			    serviceUptake.getStiDiagnosedTotal(),
	    			    serviceUptake.getStiTreatedMale(),
	    			    serviceUptake.getStiTreatedFemale(),
	    			    serviceUptake.getStiTreatedTransgender(),
	    			    serviceUptake.getStiTreatedTotal(),
	    			    serviceUptake.getHivScreenedMale(),
	    			    serviceUptake.getHivScreenedFemale(),
	    			    serviceUptake.getHivScreenedTransgender(),
	    			    serviceUptake.getHivScreenedTotal(),
	    			    serviceUptake.getHivReactiveMale(),
	    			    serviceUptake.getHivReactiveFemale(),
	    			    serviceUptake.getHivReactiveTransgender(),
	    			    serviceUptake.getHivReactiveTotal(),
	    			    serviceUptake.getHivConfirmedPositiveMale(),
	    			    serviceUptake.getHivConfirmedPositiveFemale(),
	    			    serviceUptake.getHivConfirmedPositiveTransgender(),
	    			    serviceUptake.getHivConfirmedPositiveTotal(),
	    			    serviceUptake.getHivPositiveLinkedToArtMale(),
	    			    serviceUptake.getHivPositiveLinkedToArtFemale(),
	    			    serviceUptake.getHivPositiveLinkedToArtTransgender(),
	    			    serviceUptake.getHivPositiveLinkedToArtTotal(),
	    			    serviceUptake.getSyphilisScreenedMale(),
	    			    serviceUptake.getSyphilisScreenedFemale(),
	    			    serviceUptake.getSyphilisScreenedTransgender(),
	    			    serviceUptake.getSyphilisScreenedTotal(),
	    			    serviceUptake.getSyphilisReactiveMale(),
	    			    serviceUptake.getSyphilisReactiveFemale(),
	    			    serviceUptake.getSyphilisReactiveTransgender(),
	    			    serviceUptake.getSyphilisReactiveTotal(),
	    			    serviceUptake.getSyphilisTreatedMale(),
	    			    serviceUptake.getSyphilisTreatedFemale(),
	    			    serviceUptake.getSyphilisTreatedTransgender(),
	    			    serviceUptake.getSyphilisTreatedTotal(),
	    			    serviceUptake.getTbScreenedMale(),
	    			    serviceUptake.getTbScreenedFemale(),
	    			    serviceUptake.getTbScreenedTransgender(),
	    			    serviceUptake.getTbScreenedTotal(),
	    			    serviceUptake.getTbSuspectedMale(),
	    			    serviceUptake.getTbSuspectedFemale(),
	    			    serviceUptake.getTbSuspectedTransgender(),
	    			    serviceUptake.getTbSuspectedTotal(),
	    			    serviceUptake.getTbTestedMale(),
	    			    serviceUptake.getTbTestedFemale(),
	    			    serviceUptake.getTbTestedTransgender(),
	    			    serviceUptake.getTbTestedTotal(),
	    			    serviceUptake.getTbPositiveMale(),
	    			    serviceUptake.getTbPositiveFemale(),
	    			    serviceUptake.getTbPositiveTransgender(),
	    			    serviceUptake.getTbPositiveTotal(),
	    			    serviceUptake.getTbPositivePutOnDotsMale(),
	    			    serviceUptake.getTbPositivePutOnDotsFemale(),
	    			    serviceUptake.getTbPositivePutOnDotsTransgender(),
	    			    serviceUptake.getTbPositivePutOnDotsTotal(),
	    			    serviceUptake.getScreenedForHepBMale(),
	    			    serviceUptake.getScreenedForHepBFemale(),
	    			    serviceUptake.getScreenedForHepBTransgender(),
	    			    serviceUptake.getScreenedForHepBTotal(),
	    			    serviceUptake.getHepBReactiveMale(),
	    			    serviceUptake.getHepBReactiveFemale(),
	    			    serviceUptake.getHepBReactiveTransgender(),
	    			    serviceUptake.getHepBReactiveTotal(),
	    			    serviceUptake.getHepBReactiveLinkedForTreatmentMale(),//new added
	    			    serviceUptake.getHepBReactiveLinkedForTreatmentFemale(),//new added
	    			    serviceUptake.getHepBReactiveLinkedForTreatmentTransgender(),//new added
	    			    serviceUptake.getHepBReactiveLinkedForTreatmentTotal(),//new added
	    			    serviceUptake.getScreenedForHepCMale(),
	    			    serviceUptake.getScreenedForHepCFemale(),
	    			    serviceUptake.getScreenedForHepCTransgender(),
	    			    serviceUptake.getScreenedForHepCTotal(),
	    			    serviceUptake.getHepCReactiveMale(),
	    			    serviceUptake.getHepCReactiveFemale(),
	    			    serviceUptake.getHepCReactiveTransgender(),
	    			    serviceUptake.getHepCReactiveTotal(),
	    			    serviceUptake.getHepCReactiveLinkedForTreatmentMale(),
	    			    serviceUptake.getHepCReactiveLinkedForTreatmentFemale(),
	    			    serviceUptake.getHepCReactiveLinkedForTreatmentTransgender(),
	    			    serviceUptake.getHepCReactiveLinkedForTreatmentTotal(),
	    			    
	    			    serviceUptake.getHepBPositivePutOnTreatmentMale(),        //new added
	    			    serviceUptake.getHepBPositivePutOnTreatmentFemale(),      //new added
	    			    serviceUptake.getHepBPositivePutOnTreatmentTransgender(), //new added
	    			    serviceUptake.getHepBPositivePutOnTreatmentTotal(),       //new added

	    			    serviceUptake.getHepCPositivePutOnTreatmentMale(),      //new added
	    			    serviceUptake.getHepCPositivePutOnTreatmentFemale(),    //new added
	    			    serviceUptake.getHepCPositivePutOnTreatmentTransgender(),  //new added
	    			    serviceUptake.getHepCPositivePutOnTreatmentTotal(),
	    			    guid
	    			);
	    }

//	    Long getServiceExtId() {
//		    	return campDataRepository.getServiceExtId();
//	    }
	    
	    public void stiSyndrome(NewHealthCamp healthCamp,String guid) {
	    	NewSTISyndromeDTO campData = healthCamp.getNewstiSyndrome();
	       logger.info("inside stiSyndrome");
	       logger.info("abc:"+campData.getOtherInformation());
	       logger.info(campData.getArdFemale() + "abc");
	       try {
	    	   		prisonRepo.insertSTISyndrome(
	        		    campData.getVcdFemale(),
	        		    campData.getVcdTotal(),
	        		    campData.getVcdTreated(),
	        		    campData.getGudNonHerpeticMale(),
	        		    campData.getGudNonHerpeticFemale(),
	        		    campData.getGudNonHerpeticTGTS(),
	        		    campData.getGudNonHerpeticTotal(),
	        		    campData.getGudNonHerpeticTreated(),
	        		    campData.getGudHerpeticMale(),
	        		    campData.getGudHerpeticFemale(),
	        		    campData.getGudHerpeticTGTS(),
	        		    campData.getGudHerpeticTotal(),
	        		    campData.getGudHerpeticTreated(),
	        		    campData.getLapFemale(),
	        		    campData.getLapTotal(),
	        		    campData.getLapTreated(),
	        		    campData.getUdMale(),
	        		    campData.getUdTGTS(),
	        		    campData.getUdTotal(),
	        		    campData.getUdTreated(),
	        		    campData.getArdMale(),
	        		    campData.getArdFemale(),
	        		    campData.getArdTGTS(),
	        		    campData.getArdTotal(),
	        		    campData.getArdTreated(),
	        		    campData.getIbMale(),
	        		    campData.getIbFemale(),
	        		    campData.getIbTGTS(),
	        		    campData.getIbTotal(),
	        		    campData.getIbTreated(),
	        		    campData.getSsMale(),
	        		    campData.getSsTGTS(),
	        		    campData.getSsTotal(),
	        		    campData.getSsTreated(),
	        		    campData.getGenitalWartsMale(),
	        		    campData.getGenitalWartsFemale(),
	        		    campData.getGenitalWartsTGTS(),
	        		    campData.getGenitalWartsTotal(),
	        		    campData.getGenitalWartsTreated(),
	        		    campData.getOtherSTIsMale(),
	        		    campData.getOtherSTIsFemale(),
	        		    campData.getOtherSTIsTGTS(),
	        		    campData.getOtherSTIsTotal(),
	        		    campData.getOtherSTIsTreated(),
	        		    campData.getOtherInformation(),
	        		    guid
	        ); 
	       }catch(Exception e) {
//	    	   System.out.println(e.printStackTrace());
	    	   logger.info(e.getMessage());
	       }
	    }
	    
	    public List<Object[]> getMPRData(String district, String artc_name, Integer mpr_month, Integer mpr_year, String stateName) {
	           return prisonRepo.getAllDataMPR(district, artc_name,  mpr_month,  mpr_year, stateName);
	       }
	    
	    public void deleteData(Integer id) {
	    	  prisonRepo.deleteData(id);
	    }
	    
	    public List<NewHealthCamp> getUserData(String userid) {
			  
			  List<Object[]> dataList = prisonRepo.getUserData(userid);
			  
			  List<NewHealthCamp> healthCamps = new ArrayList<>();
			  for (Object[] data : dataList) {
				  
				    CampData campData = new CampData();
				    campData.setId(data[0] != null ? ((Integer) data[0]).longValue() : null);
				    campData.setStateName(data[1] != null ? (String) data[1] : null);
				    campData.setDistrictName(data[2] != null ? (String) data[2] : null);
				    campData.setPocType(data[3] != null ? (String) data[3] : null);
				    campData.setCampsiteName(data[4] != null ? (String) data[4] : null);
				    campData.setDistrictNodalOfficerName(data[5] != null ? (String) data[5] : null);
				    campData.setContactNumber(data[6] != null ? (String) data[6] : null);

				    campData.setCampDate(data[7] != null ? (Date) data[7] : null);
				    campData.setReportDate(data[8] != null ? (Date) data[8] : null);
				    
				    campData.setUserId(data[9] != null ? (String) data[9] : null);        
				    
				    campData.setGeneratedDate(data[154] != null ? (Date) data[154] : null); 
				    
				    campData.setGuid(data[153] != null ? (String) data[153] : null);
				    
				    NewServiceUptake serviceUptake = new NewServiceUptake();
				    serviceUptake.setGeneralHealthCheckupMale(data[10] != null ? (Integer) data[10] : null);
				    serviceUptake.setGeneralHealthCheckupFemale(data[11] != null ? (Integer) data[11] : null);
				    serviceUptake.setGeneralHealthCheckupTransgender(data[12] != null ? (Integer) data[12] : null);
				    serviceUptake.setGeneralHealthCheckupTotal(data[13] != null ? (Integer) data[13] : null);
				    serviceUptake.setAntenatalCheckupFemale(data[14] != null ? (Integer) data[14] : null);
				    serviceUptake.setAntenatalCheckupTotal(data[15] != null ? (Integer) data[15] : null);
				    serviceUptake.setStiCheckupMale(data[16] != null ? (Integer) data[16] : null);
				    serviceUptake.setStiCheckupFemale(data[17] != null ? (Integer) data[17] : null);
				    serviceUptake.setStiCheckupTransgender(data[18] != null ? (Integer) data[18] : null);
				    serviceUptake.setStiCheckupTotal(data[19] != null ? (Integer) data[19] : null);
				    serviceUptake.setStiDiagnosedMale(data[20] != null ? (Integer) data[20] : null);
				    serviceUptake.setStiDiagnosedFemale(data[21] != null ? (Integer) data[21] : null);
				    serviceUptake.setStiDiagnosedTransgender(data[22] != null ? (Integer) data[22] : null);
				    serviceUptake.setStiDiagnosedTotal(data[23] != null ? (Integer) data[23] : null);
				    serviceUptake.setStiTreatedMale(data[24] != null ? (Integer) data[24] : null);
				    serviceUptake.setStiTreatedFemale(data[25] != null ? (Integer) data[25] : null);
				    serviceUptake.setStiTreatedTransgender(data[26] != null ? (Integer) data[26] : null);
				    serviceUptake.setStiTreatedTotal(data[27] != null ? (Integer) data[27] : null);
				    serviceUptake.setHivScreenedMale(data[28] != null ? (Integer) data[28] : null);
				    serviceUptake.setHivScreenedFemale(data[29] != null ? (Integer) data[29] : null);
				    serviceUptake.setHivScreenedTransgender(data[30] != null ? (Integer) data[30] : null);
				    serviceUptake.setHivScreenedTotal(data[31] != null ? (Integer) data[31] : null);
				    serviceUptake.setHivReactiveMale(data[32] != null ? (Integer) data[32] : null);
				    serviceUptake.setHivReactiveFemale(data[33] != null ? (Integer) data[33] : null);
				    serviceUptake.setHivReactiveTransgender(data[34] != null ? (Integer) data[34] : null);
				    serviceUptake.setHivReactiveTotal(data[35] != null ? (Integer) data[35] : null);
				    serviceUptake.setHivConfirmedPositiveMale(data[36] != null ? (Integer) data[36] : null);
				    serviceUptake.setHivConfirmedPositiveFemale(data[37] != null ? (Integer) data[37] : null);
				    serviceUptake.setHivConfirmedPositiveTransgender(data[38] != null ? (Integer) data[38] : null);
				    serviceUptake.setHivConfirmedPositiveTotal(data[39] != null ? (Integer) data[39] : null);
				    serviceUptake.setHivPositiveLinkedToArtMale(data[40] != null ? (Integer) data[40] : null);
				    serviceUptake.setHivPositiveLinkedToArtFemale(data[41] != null ? (Integer) data[41] : null);
				    serviceUptake.setHivPositiveLinkedToArtTransgender(data[42] != null ? (Integer) data[42] : null);
				    serviceUptake.setHivPositiveLinkedToArtTotal(data[43] != null ? (Integer) data[43] : null);
				    serviceUptake.setSyphilisScreenedMale(data[44] != null ? (Integer) data[44] : null);
				    serviceUptake.setSyphilisScreenedFemale(data[45] != null ? (Integer) data[45] : null);
				    serviceUptake.setSyphilisScreenedTransgender(data[46] != null ? (Integer) data[46] : null);
				    serviceUptake.setSyphilisScreenedTotal(data[47] != null ? (Integer) data[47] : null);
				    serviceUptake.setSyphilisReactiveMale(data[48] != null ? (Integer) data[48] : null);
				    serviceUptake.setSyphilisReactiveFemale(data[49] != null ? (Integer) data[49] : null);
				    serviceUptake.setSyphilisReactiveTransgender(data[50] != null ? (Integer) data[50] : null);
				    serviceUptake.setSyphilisReactiveTotal(data[51] != null ? (Integer) data[51] : null);
				    serviceUptake.setSyphilisTreatedMale(data[52] != null ? (Integer) data[52] : null);
				    serviceUptake.setSyphilisTreatedFemale(data[53] != null ? (Integer) data[53] : null);
				    serviceUptake.setSyphilisTreatedTransgender(data[54] != null ? (Integer) data[54] : null);
				    serviceUptake.setSyphilisTreatedTotal(data[55] != null ? (Integer) data[55] : null);
				    serviceUptake.setTbScreenedMale(data[56] != null ? (Integer) data[56] : null);
				    serviceUptake.setTbScreenedFemale(data[57] != null ? (Integer) data[57] : null);
				    serviceUptake.setTbScreenedTransgender(data[58] != null ? (Integer) data[58] : null);
				    serviceUptake.setTbScreenedTotal(data[59] != null ? (Integer) data[59] : null);
				    serviceUptake.setTbSuspectedMale(data[60] != null ? (Integer) data[60] : null);
				    serviceUptake.setTbSuspectedFemale(data[61] != null ? (Integer) data[61] : null);
				    serviceUptake.setTbSuspectedTransgender(data[62] != null ? (Integer) data[62] : null);
				    serviceUptake.setTbSuspectedTotal(data[63] != null ? (Integer) data[63] : null);
				    serviceUptake.setTbTestedMale(data[64] != null ? (Integer) data[64] : null);
				    serviceUptake.setTbTestedFemale(data[65] != null ? (Integer) data[65] : null);
				    serviceUptake.setTbTestedTransgender(data[66] != null ? (Integer) data[66] : null);
				    serviceUptake.setTbTestedTotal(data[67] != null ? (Integer) data[67] : null);
				    serviceUptake.setTbPositiveMale(data[68] != null ? (Integer) data[68] : null);
				    serviceUptake.setTbPositiveFemale(data[69] != null ? (Integer) data[69] : null);
				    serviceUptake.setTbPositiveTransgender(data[70] != null ? (Integer) data[70] : null);
				    serviceUptake.setTbPositiveTotal(data[71] != null ? (Integer) data[71] : null);
				    serviceUptake.setTbPositivePutOnDotsMale(data[72] != null ? (Integer) data[72] : null);
				    serviceUptake.setTbPositivePutOnDotsFemale(data[73] != null ? (Integer) data[73] : null);
				    serviceUptake.setTbPositivePutOnDotsTransgender(data[74] != null ? (Integer) data[74] : null);
				    serviceUptake.setTbPositivePutOnDotsTotal(data[75] != null ? (Integer) data[75] : null);
				    serviceUptake.setScreenedForHepBMale(data[76] != null ? (Integer) data[76] : null);
				    serviceUptake.setScreenedForHepBFemale(data[77] != null ? (Integer) data[77] : null);
				    serviceUptake.setScreenedForHepBTransgender(data[78] != null ? (Integer) data[78] : null);
				    serviceUptake.setScreenedForHepBTotal(data[79] != null ? (Integer) data[79] : null);
				    serviceUptake.setHepBReactiveMale(data[80] != null ? (Integer) data[80] : null);
				    serviceUptake.setHepBReactiveFemale(data[81] != null ? (Integer) data[81] : null);
				    serviceUptake.setHepBReactiveTransgender(data[82] != null ? (Integer) data[82] : null);
				    serviceUptake.setHepBReactiveTotal(data[83] != null ? (Integer) data[83] : null);
				    serviceUptake.setHepBReactiveLinkedForTreatmentMale(data[84] != null ? (Integer) data[84] : null);
				    serviceUptake.setHepBReactiveLinkedForTreatmentFemale(data[85] != null ? (Integer) data[85] : null);
				    serviceUptake.setHepBReactiveLinkedForTreatmentTransgender(data[86] != null ? (Integer) data[86] : null);
				    serviceUptake.setHepBReactiveLinkedForTreatmentTotal(data[87] != null ? (Integer) data[87] : null);
				    serviceUptake.setHepBPositivePutOnTreatmentMale(data[88] != null ? (Integer) data[88] : null);
				    serviceUptake.setHepBPositivePutOnTreatmentFemale(data[89] != null ? (Integer) data[89] : null);
				    serviceUptake.setHepBPositivePutOnTreatmentTransgender(data[90] != null ? (Integer) data[90] : null);
				    serviceUptake.setHepBPositivePutOnTreatmentTotal(data[91] != null ? (Integer) data[91] : null);
				    serviceUptake.setScreenedForHepCMale(data[92] != null ? (Integer) data[92] : null);
				    serviceUptake.setScreenedForHepCFemale(data[93] != null ? (Integer) data[93] : null);
				    serviceUptake.setScreenedForHepCTransgender(data[94] != null ? (Integer) data[94] : null);
				    serviceUptake.setScreenedForHepCTotal(data[95] != null ? (Integer) data[95] : null);
				    serviceUptake.setHepCReactiveMale(data[96] != null ? (Integer) data[96] : null);
				    serviceUptake.setHepCReactiveFemale(data[97] != null ? (Integer) data[97] : null);
				    serviceUptake.setHepCReactiveTransgender(data[98] != null ? (Integer) data[98] : null);
				    serviceUptake.setHepCReactiveTotal(data[99] != null ? (Integer) data[99] : null);
				    serviceUptake.setHepCReactiveLinkedForTreatmentMale(data[100] != null ? (Integer) data[100] : null);
				    serviceUptake.setHepCReactiveLinkedForTreatmentFemale(data[101] != null ? (Integer) data[101] : null);
				    serviceUptake.setHepCReactiveLinkedForTreatmentTransgender(data[102] != null ? (Integer) data[102] : null);
				    serviceUptake.setHepCReactiveLinkedForTreatmentTotal(data[103] != null ? (Integer) data[103] : null);
				    serviceUptake.setHepCPositivePutOnTreatmentMale(data[104] != null ? (Integer) data[104] : null);
				    serviceUptake.setHepCPositivePutOnTreatmentFemale(data[105] != null ? (Integer) data[105] : null);
				    serviceUptake.setHepCPositivePutOnTreatmentTransgender(data[106] != null ? (Integer) data[106] : null);
				    serviceUptake.setHepCPositivePutOnTreatmentTotal(data[107] != null ? (Integer) data[107] : null);
				    
				    
				    NewSTISyndromeDTO stiSyndrome = new NewSTISyndromeDTO();
				    stiSyndrome.setVcdFemale(data[108] != null ? ((Integer) data[108]).intValue() : null);
				    stiSyndrome.setVcdTotal(data[109] != null ? ((Integer) data[109]).intValue() : null);
				    stiSyndrome.setVcdTreated(data[110] != null ? ((Integer) data[110]).intValue() : null);
				    stiSyndrome.setGudNonHerpeticMale(data[111] != null ? ((Integer) data[111]).intValue() : null);
				    stiSyndrome.setGudNonHerpeticFemale(data[112] != null ? ((Integer) data[112]).intValue() : null);
				    stiSyndrome.setGudNonHerpeticTGTS(data[113] != null ? ((Integer) data[113]).intValue() : null);
				    stiSyndrome.setGudNonHerpeticTotal(data[114] != null ? ((Integer) data[114]).intValue() : null);
				    stiSyndrome.setGudNonHerpeticTreated(data[115] != null ? ((Integer) data[115]).intValue() : null);
				    stiSyndrome.setGudHerpeticMale(data[116] != null ? ((Integer) data[116]).intValue() : null);
				    stiSyndrome.setGudHerpeticFemale(data[117] != null ? ((Integer) data[117]).intValue() : null);
				    stiSyndrome.setGudHerpeticTGTS(data[118] != null ? ((Integer) data[118]).intValue() : null);
				    stiSyndrome.setGudHerpeticTotal(data[119] != null ? ((Integer) data[119]).intValue() : null);
				    stiSyndrome.setGudHerpeticTreated(data[120] != null ? ((Integer) data[120]).intValue() : null);
				    stiSyndrome.setLapFemale(data[121] != null ? ((Integer) data[121]).intValue() : null);
				    stiSyndrome.setLapTotal(data[122] != null ? ((Integer) data[122]).intValue() : null);
				    stiSyndrome.setLapTreated(data[123] != null ? ((Integer) data[123]).intValue() : null);
				    stiSyndrome.setUdMale(data[124] != null ? ((Integer) data[124]).intValue() : null);
				    stiSyndrome.setUdTGTS(data[125] != null ? ((Integer) data[125]).intValue() : null);
				    stiSyndrome.setUdTotal(data[126] != null ? ((Integer) data[126]).intValue() : null);
				    stiSyndrome.setUdTreated(data[127] != null ? ((Integer) data[127]).intValue() : null);
				    stiSyndrome.setArdMale(data[128] != null ? ((Integer) data[128]).intValue() : null);
				    stiSyndrome.setArdFemale(data[129] != null ? ((Integer) data[129]).intValue() : null);
				    stiSyndrome.setArdTGTS(data[130] != null ? ((Integer) data[130]).intValue() : null);
				    stiSyndrome.setArdTotal(data[131] != null ? ((Integer) data[131]).intValue() : null);
				    stiSyndrome.setArdTreated(data[132] != null ? ((Integer) data[132]).intValue() : null);    
				    stiSyndrome.setIbMale(data[133] != null ? ((Integer) data[133]).intValue() : null);
				    stiSyndrome.setIbFemale(data[134] != null ? ((Integer) data[134]).intValue() : null);
				    stiSyndrome.setIbTGTS(data[135] != null ? ((Integer) data[135]).intValue() : null);
				    stiSyndrome.setIbTotal(data[136] != null ? ((Integer) data[136]).intValue() : null);
				    stiSyndrome.setIbTreated(data[137] != null ? ((Integer) data[137]).intValue() : null);
				    stiSyndrome.setSsMale(data[138] != null ? ((Integer) data[138]).intValue() : null);
				    stiSyndrome.setSsTGTS(data[139] != null ? ((Integer) data[139]).intValue() : null);
				    stiSyndrome.setSsTotal(data[140] != null ? ((Integer) data[140]).intValue() : null);
				    stiSyndrome.setSsTreated(data[141] != null ? ((Integer) data[141]).intValue() : null);
				    stiSyndrome.setGenitalWartsMale(data[142] != null ? ((Integer) data[142]).intValue() : null);
				    stiSyndrome.setGenitalWartsFemale(data[143] != null ? ((Integer) data[143]).intValue() : null);
				    stiSyndrome.setGenitalWartsTGTS(data[144] != null ? ((Integer) data[144]).intValue() : null);
				    stiSyndrome.setGenitalWartsTotal(data[145] != null ? ((Integer) data[145]).intValue() : null);
				    stiSyndrome.setGenitalWartsTreated(data[146] != null ? ((Integer) data[146]).intValue() : null);
				    stiSyndrome.setOtherSTIsMale(data[147] != null ? ((Integer) data[147]).intValue() : null);
				    stiSyndrome.setOtherSTIsFemale(data[148] != null ? ((Integer) data[148]).intValue() : null);
				    stiSyndrome.setOtherSTIsTGTS(data[149] != null ? ((Integer) data[149]).intValue() : null);
				    stiSyndrome.setOtherSTIsTotal(data[150] != null ? ((Integer) data[150]).intValue() : null);
				    stiSyndrome.setOtherSTIsTreated(data[151] != null ? ((Integer) data[151]).intValue() : null);
				    stiSyndrome.setOtherInformation(data[152] != null ? (String) data[152] : null);

				    NewHealthCamp healthCamp = new NewHealthCamp(campData,serviceUptake,stiSyndrome);
				    healthCamp.setCampData(campData);
		            healthCamp.setNewserviceUptake(serviceUptake);
		            healthCamp.setNewstiSyndrome(stiSyndrome);

		            healthCamps.add(healthCamp);
		        }

		        return healthCamps;
		    }
	    
//	    private CampData parseJsonToCampData(JsonObject data) {
//	    	CampData campData = new CampData();
//	    	logger.info(""+data);
//	        JsonObject campDataObject = data.get("campData").getAsJsonObject();
//	        campData.setStateName(campDataObject.get("stateName").getAsString());
//	        campData.setDistrictName(campDataObject.get("districtName").getAsString());
//	        campData.setPocType(campDataObject.get("pocType").getAsString());
//	        campData.setCampsiteName(campDataObject.get("campsiteName").getAsString());
//	        campData.setContactNumber(campDataObject.get("contactNumber").getAsString());
//
//	        // Parse campDate as Date object
//	        String campDateString = campDataObject.get("campDate").getAsString();
//	        try {
//	            Date campDate = new SimpleDateFormat("yyyy-MM-dd").parse(campDateString);
//	            campData.setCampDate(campDate);
//	        } catch (ParseException e) {
//	            // Handle parsing exception if needed
//	        }
//	        // Parse reportDate as Date object
//	        String reportDateString = campDataObject.get("reportDate").getAsString();
//	        try {
//	            Date reportDate = new SimpleDateFormat("yyyy-MM-dd").parse(reportDateString);
//	            campData.setReportDate(reportDate);
//	        } catch (ParseException e) {
//	            // Handle parsing exception if needed
//	        }
//	        String generatedDateString = campDataObject.get("generatedDate").getAsString();
//	        try {
//	            Date generateDate = new SimpleDateFormat("yyyy-MM-dd").parse(generatedDateString);
//	            campData.setGeneratedDate(generateDate);
//	        } catch (ParseException e) {
//	            // Handle parsing exception if needed
//	        }
//
//	        // Set other fields accordingly
//
//	        return campData;
//	    }
//	    
	    
	    

}
