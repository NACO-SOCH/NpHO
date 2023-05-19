package gov.naco.soch.npho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;

import gov.naco.soch.npho.model.CampData;
import gov.naco.soch.npho.model.HealthCamp;
import gov.naco.soch.npho.model.STISyndrome;
import gov.naco.soch.npho.model.ServiceUptake;
import gov.naco.soch.npho.model.UserDTO;
import gov.naco.soch.repository.OfflineRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Transactional
@Service
public class CampDataService {
	
	@Autowired
	 private final OfflineRepository campDataRepository;
	
	 private static final Logger logger = LoggerFactory.getLogger(CampDataService.class);

	 
	 public CampDataService(OfflineRepository campDataRepository) {
	        this.campDataRepository = campDataRepository;
	    }
	 
	 
	 
	 
	 public UserDTO loginService(String username , String password) {
		 logger.info(username+" "+password);
		 String result =campDataRepository.login(username, password);
		 logger.info(campDataRepository.login(username, password));
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
		 return campDataRepository.resetPassword(username, password,newPassword);
	 }
	 
	  public void saveCampData(HealthCamp healthCamp) {
	        CampData campData = healthCamp.getCampData();
	        logger.info(campData.getDistrictName()+"");
	         campDataRepository.insertCampData(
	            campData.getStateName(),
	            campData.getDistrictName(),
	            campData.getPocType(),
	            campData.getCampsiteName(),
	            campData.getDistrictNodalOfficerName(),
	            campData.getContactNumber(),
	            campData.getCampDate(),
	            campData.getReportDate(),
	            campData.getUserId()
	        ); 
	         
//	         Long lastInsertedId = campDataRepository.getLastInsertedId();
//	         logger.info(lastInsertedId+"");
	    }
	    
	    Long lastInsertedId() {
	    	return campDataRepository.getLastInsertedId();
	    }
	    
	    public void saveServiceUptake(HealthCamp healthCamp, Long lastInsertedId) {
	        logger.info("inside save Services");
	    	 ServiceUptake serviceUptake = healthCamp.getServiceUptake();
	    	 campDataRepository.insertServiceUptake(
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
	    			    serviceUptake.getHepBReactiveLinkedForTreatmentMale(),
	    			    serviceUptake.getHepBReactiveLinkedForTreatmentFemale(),
	    			    serviceUptake.getHepBReactiveLinkedForTreatmentTransgender(),
	    			    serviceUptake.getHepBReactiveLinkedForTreatmentTotal(),
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
	    			    lastInsertedId
	    			);
	    }

	    Long getServiceExtId() {
		    	return campDataRepository.getServiceExtId();
	    }
	    
	    public void stiSyndrome(HealthCamp healthCamp, Long lastInsertedId, Long serviceExtId) {
	        STISyndrome campData = healthCamp.getStiSyndrome();
	       
	        campDataRepository.insertSTISyndrome(
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
	        		    lastInsertedId,
	        		    serviceExtId
	        ); 
	    }
	    
	    
	    private CampData parseJsonToCampData(JsonObject data) {
	    	CampData campData = new CampData();
	    	logger.info(""+data);
	        JsonObject campDataObject = data.get("campData").getAsJsonObject();
	        campData.setStateName(campDataObject.get("stateName").getAsString());
	        campData.setDistrictName(campDataObject.get("districtName").getAsString());
	        campData.setPocType(campDataObject.get("pocType").getAsString());
	        campData.setCampsiteName(campDataObject.get("campsiteName").getAsString());
	        campData.setContactNumber(campDataObject.get("contactNumber").getAsString());

	        // Parse campDate as Date object
	        String campDateString = campDataObject.get("campDate").getAsString();
	        try {
	            Date campDate = new SimpleDateFormat("yyyy-MM-dd").parse(campDateString);
	            campData.setCampDate(campDate);
	        } catch (ParseException e) {
	            // Handle parsing exception if needed
	        }
	        // Parse reportDate as Date object
	        String reportDateString = campDataObject.get("reportDate").getAsString();
	        try {
	            Date reportDate = new SimpleDateFormat("yyyy-MM-dd").parse(reportDateString);
	            campData.setReportDate(reportDate);
	        } catch (ParseException e) {
	            // Handle parsing exception if needed
	        }
	        String generatedDateString = campDataObject.get("generatedDate").getAsString();
	        try {
	            Date generateDate = new SimpleDateFormat("yyyy-MM-dd").parse(generatedDateString);
	            campData.setGeneratedDate(generateDate);
	        } catch (ParseException e) {
	            // Handle parsing exception if needed
	        }

	        // Set other fields accordingly

	        return campData;
	    }
	    
	    
	    

}
