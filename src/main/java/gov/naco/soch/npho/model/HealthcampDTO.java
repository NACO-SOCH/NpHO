package gov.naco.soch.npho.model;

import java.util.Date;

public class HealthcampDTO {

class Campdata{
	
	private Long id;
    private String stateName;
    private String districtName;   
    private String pocType;
    private String campsiteName;
    private Long contactNumber;
    private Date campDate;
    private Date reportDate;
    private Date generatedDate;	
    private String districtNodalOfficerName;
    private String userId;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getPocType() {
		return pocType;
	}
	public void setPocType(String pocType) {
		this.pocType = pocType;
	}
	public String getCampsiteName() {
		return campsiteName;
	}
	public void setCampsiteName(String campsiteName) {
		this.campsiteName = campsiteName;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Date getCampDate() {
		return campDate;
	}
	public void setCampDate(Date campDate) {
		this.campDate = campDate;
	}
	public Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	public Date getGeneratedDate() {
		return generatedDate;
	}
	public void setGeneratedDate(Date generatedDate) {
		this.generatedDate = generatedDate;
	}
	public String getDistrictNodalOfficerName() {
		return districtNodalOfficerName;
	}
	public void setDistrictNodalOfficerName(String districtNodalOfficerName) {
		this.districtNodalOfficerName = districtNodalOfficerName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	} 
    
    
    
}

 class ServiceUptake{   
    private int generalHealthCheckupMale;
    private int generalHealthCheckupFemale;
    private int generalHealthCheckupTransgender;
    private int generalHealthCheckupTotal;
    private int antenatalCheckupFemale;
    private int antenatalCheckupTotal;
    private int stiCheckupMale;
    private int stiCheckupFemale;
    private int stiCheckupTransgender;
    private int stiCheckupTotal;
    private int stiDiagnosedMale;
    private int stiDiagnosedFemale;
    private int stiDiagnosedTransgender;
    private int stiDiagnosedTotal;
    private int stiTreatedMale;
    private int stiTreatedFemale;
    private int stiTreatedTransgender;
    private int stiTreatedTotal;
    private int hivScreenedMale;
    private int hivScreenedFemale;
    private int hivScreenedTransgender;
    private int hivScreenedTotal;
    private int hivReactiveMale;
    private int hivReactiveFemale;
    private int hivReactiveTransgender;
    private int hivReactiveTotal;
    private int hivConfirmedPositiveMale;
    private int hivConfirmedPositiveFemale;
    private int hivConfirmedPositiveTransgender;
    private int hivConfirmedPositiveTotal;
    private int hivPositiveLinkedToArtMale;
    private int hivPositiveLinkedToArtFemale;
    private int hivPositiveLinkedToArtTransgender;
    private int hivPositiveLinkedToArtTotal;
    private int syphilisScreenedMale;
    private int syphilisScreenedFemale;
    private int syphilisScreenedTransgender;
    private int syphilisScreenedTotal;
    private int syphilisReactiveMale;
    private int syphilisReactiveFemale;
    private int syphilisReactiveTransgender;
    private int syphilisReactiveTotal;
    private int syphilisTreatedMale;
    private int syphilisTreatedFemale;
    private int syphilisTreatedTransgender;
    private int syphilisTreatedTotal;
    private int tbScreenedMale;
    private int tbScreenedFemale;
    private int tbScreenedTransgender;
    private int tbScreenedTotal;
    private int tbSuspectedMale;
    private int tbSuspectedFemale;
    private int tbSuspectedTransgender;
    private int tbSuspectedTotal;
    private int tbTestedMale;
    private int tbTestedFemale;
    private int tbTestedTransgender;
    private int tbTestedTotal;
    private int tbPositiveMale;
    private int tbPositiveFemale;
    private int tbPositiveTransgender;
    private int tbPositiveTotal;
    private int tbPositivePutOnDotsMale;
    private int tbPositivePutOnDotsFemale;
    private int tbPositivePutOnDotsTransgender;
    private int tbPositivePutOnDotsTotal;
    private int screenedForHepBMale;
    private int screenedForHepBFemale;
    private int screenedForHepBTransgender;
    private int screenedForHepBTotal;
    private int hepBReactiveMale;
    private int hepBReactiveFemale;
    private int hepBReactiveTransgender;
    private int hepBReactiveTotal;
    private int hepBReactiveLinkedForTreatmentMale;
    private int hepBReactiveLinkedForTreatmentFemale;
    private int hepBReactiveLinkedForTreatmentTransgender;
    private int hepBReactiveLinkedForTreatmentTotal;
    private int hepBPositivePutOnTreatmentMale;        //new added
    private int hepBPositivePutOnTreatmentFemale;      //new added
    private int hepBPositivePutOnTreatmentTransgender; //new added
    private int hepBPositivePutOnTreatmentTotal;       //new added
    private int screenedForHepCMale;
    private int screenedForHepCFemale;
    private int screenedForHepCTransgender;
    private int screenedForHepCTotal;
    private int hepCReactiveMale;
    private int hepCReactiveFemale;
    private int hepCReactiveTransgender;
    private int hepCReactiveTotal;
    private int hepCReactiveLinkedForTreatmentMale;
    private int hepCReactiveLinkedForTreatmentFemale;
    private int hepCReactiveLinkedForTreatmentTransgender;
    private int hepCReactiveLinkedForTreatmentTotal;
    private int hepCPositivePutOnTreatmentMale;      //new added
    private int hepCPositivePutOnTreatmentFemale;    //new added
    private int hepCPositivePutOnTreatmentTransgender;  //new added
    private int hepCPositivePutOnTreatmentTotal;        //new added
    
	public int getGeneralHealthCheckupMale() {
		return generalHealthCheckupMale;
	}
	public void setGeneralHealthCheckupMale(int generalHealthCheckupMale) {
		this.generalHealthCheckupMale = generalHealthCheckupMale;
	}
	public int getGeneralHealthCheckupFemale() {
		return generalHealthCheckupFemale;
	}
	public void setGeneralHealthCheckupFemale(int generalHealthCheckupFemale) {
		this.generalHealthCheckupFemale = generalHealthCheckupFemale;
	}
	public int getGeneralHealthCheckupTransgender() {
		return generalHealthCheckupTransgender;
	}
	public void setGeneralHealthCheckupTransgender(int generalHealthCheckupTransgender) {
		this.generalHealthCheckupTransgender = generalHealthCheckupTransgender;
	}
	public int getGeneralHealthCheckupTotal() {
		return generalHealthCheckupTotal;
	}
	public void setGeneralHealthCheckupTotal(int generalHealthCheckupTotal) {
		this.generalHealthCheckupTotal = generalHealthCheckupTotal;
	}
	public int getAntenatalCheckupFemale() {
		return antenatalCheckupFemale;
	}
	public void setAntenatalCheckupFemale(int antenatalCheckupFemale) {
		this.antenatalCheckupFemale = antenatalCheckupFemale;
	}
	public int getAntenatalCheckupTotal() {
		return antenatalCheckupTotal;
	}
	public void setAntenatalCheckupTotal(int antenatalCheckupTotal) {
		this.antenatalCheckupTotal = antenatalCheckupTotal;
	}
	public int getStiCheckupMale() {
		return stiCheckupMale;
	}
	public void setStiCheckupMale(int stiCheckupMale) {
		this.stiCheckupMale = stiCheckupMale;
	}
	public int getStiCheckupFemale() {
		return stiCheckupFemale;
	}
	public void setStiCheckupFemale(int stiCheckupFemale) {
		this.stiCheckupFemale = stiCheckupFemale;
	}
	public int getStiCheckupTransgender() {
		return stiCheckupTransgender;
	}
	public void setStiCheckupTransgender(int stiCheckupTransgender) {
		this.stiCheckupTransgender = stiCheckupTransgender;
	}
	public int getStiCheckupTotal() {
		return stiCheckupTotal;
	}
	public void setStiCheckupTotal(int stiCheckupTotal) {
		this.stiCheckupTotal = stiCheckupTotal;
	}
	public int getStiDiagnosedMale() {
		return stiDiagnosedMale;
	}
	public void setStiDiagnosedMale(int stiDiagnosedMale) {
		this.stiDiagnosedMale = stiDiagnosedMale;
	}
	public int getStiDiagnosedFemale() {
		return stiDiagnosedFemale;
	}
	public void setStiDiagnosedFemale(int stiDiagnosedFemale) {
		this.stiDiagnosedFemale = stiDiagnosedFemale;
	}
	public int getStiDiagnosedTransgender() {
		return stiDiagnosedTransgender;
	}
	public void setStiDiagnosedTransgender(int stiDiagnosedTransgender) {
		this.stiDiagnosedTransgender = stiDiagnosedTransgender;
	}
	public int getStiDiagnosedTotal() {
		return stiDiagnosedTotal;
	}
	public void setStiDiagnosedTotal(int stiDiagnosedTotal) {
		this.stiDiagnosedTotal = stiDiagnosedTotal;
	}
	public int getStiTreatedMale() {
		return stiTreatedMale;
	}
	public void setStiTreatedMale(int stiTreatedMale) {
		this.stiTreatedMale = stiTreatedMale;
	}
	public int getStiTreatedFemale() {
		return stiTreatedFemale;
	}
	public void setStiTreatedFemale(int stiTreatedFemale) {
		this.stiTreatedFemale = stiTreatedFemale;
	}
	public int getStiTreatedTransgender() {
		return stiTreatedTransgender;
	}
	public void setStiTreatedTransgender(int stiTreatedTransgender) {
		this.stiTreatedTransgender = stiTreatedTransgender;
	}
	public int getStiTreatedTotal() {
		return stiTreatedTotal;
	}
	public void setStiTreatedTotal(int stiTreatedTotal) {
		this.stiTreatedTotal = stiTreatedTotal;
	}
	public int getHivScreenedMale() {
		return hivScreenedMale;
	}
	public void setHivScreenedMale(int hivScreenedMale) {
		this.hivScreenedMale = hivScreenedMale;
	}
	public int getHivScreenedFemale() {
		return hivScreenedFemale;
	}
	public void setHivScreenedFemale(int hivScreenedFemale) {
		this.hivScreenedFemale = hivScreenedFemale;
	}
	public int getHivScreenedTransgender() {
		return hivScreenedTransgender;
	}
	public void setHivScreenedTransgender(int hivScreenedTransgender) {
		this.hivScreenedTransgender = hivScreenedTransgender;
	}
	public int getHivScreenedTotal() {
		return hivScreenedTotal;
	}
	public void setHivScreenedTotal(int hivScreenedTotal) {
		this.hivScreenedTotal = hivScreenedTotal;
	}
	public int getHivReactiveMale() {
		return hivReactiveMale;
	}
	public void setHivReactiveMale(int hivReactiveMale) {
		this.hivReactiveMale = hivReactiveMale;
	}
	public int getHivReactiveFemale() {
		return hivReactiveFemale;
	}
	public void setHivReactiveFemale(int hivReactiveFemale) {
		this.hivReactiveFemale = hivReactiveFemale;
	}
	public int getHivReactiveTransgender() {
		return hivReactiveTransgender;
	}
	public void setHivReactiveTransgender(int hivReactiveTransgender) {
		this.hivReactiveTransgender = hivReactiveTransgender;
	}
	public int getHivReactiveTotal() {
		return hivReactiveTotal;
	}
	public void setHivReactiveTotal(int hivReactiveTotal) {
		this.hivReactiveTotal = hivReactiveTotal;
	}
	public int getHivConfirmedPositiveMale() {
		return hivConfirmedPositiveMale;
	}
	public void setHivConfirmedPositiveMale(int hivConfirmedPositiveMale) {
		this.hivConfirmedPositiveMale = hivConfirmedPositiveMale;
	}
	public int getHivConfirmedPositiveFemale() {
		return hivConfirmedPositiveFemale;
	}
	public void setHivConfirmedPositiveFemale(int hivConfirmedPositiveFemale) {
		this.hivConfirmedPositiveFemale = hivConfirmedPositiveFemale;
	}
	public int getHivConfirmedPositiveTransgender() {
		return hivConfirmedPositiveTransgender;
	}
	public void setHivConfirmedPositiveTransgender(int hivConfirmedPositiveTransgender) {
		this.hivConfirmedPositiveTransgender = hivConfirmedPositiveTransgender;
	}
	public int getHivConfirmedPositiveTotal() {
		return hivConfirmedPositiveTotal;
	}
	public void setHivConfirmedPositiveTotal(int hivConfirmedPositiveTotal) {
		this.hivConfirmedPositiveTotal = hivConfirmedPositiveTotal;
	}
	public int getHivPositiveLinkedToArtMale() {
		return hivPositiveLinkedToArtMale;
	}
	public void setHivPositiveLinkedToArtMale(int hivPositiveLinkedToArtMale) {
		this.hivPositiveLinkedToArtMale = hivPositiveLinkedToArtMale;
	}
	public int getHivPositiveLinkedToArtFemale() {
		return hivPositiveLinkedToArtFemale;
	}
	public void setHivPositiveLinkedToArtFemale(int hivPositiveLinkedToArtFemale) {
		this.hivPositiveLinkedToArtFemale = hivPositiveLinkedToArtFemale;
	}
	public int getHivPositiveLinkedToArtTransgender() {
		return hivPositiveLinkedToArtTransgender;
	}
	public void setHivPositiveLinkedToArtTransgender(int hivPositiveLinkedToArtTransgender) {
		this.hivPositiveLinkedToArtTransgender = hivPositiveLinkedToArtTransgender;
	}
	public int getHivPositiveLinkedToArtTotal() {
		return hivPositiveLinkedToArtTotal;
	}
	public void setHivPositiveLinkedToArtTotal(int hivPositiveLinkedToArtTotal) {
		this.hivPositiveLinkedToArtTotal = hivPositiveLinkedToArtTotal;
	}
	public int getSyphilisScreenedMale() {
		return syphilisScreenedMale;
	}
	public void setSyphilisScreenedMale(int syphilisScreenedMale) {
		this.syphilisScreenedMale = syphilisScreenedMale;
	}
	public int getSyphilisScreenedFemale() {
		return syphilisScreenedFemale;
	}
	public void setSyphilisScreenedFemale(int syphilisScreenedFemale) {
		this.syphilisScreenedFemale = syphilisScreenedFemale;
	}
	public int getSyphilisScreenedTransgender() {
		return syphilisScreenedTransgender;
	}
	public void setSyphilisScreenedTransgender(int syphilisScreenedTransgender) {
		this.syphilisScreenedTransgender = syphilisScreenedTransgender;
	}
	public int getSyphilisScreenedTotal() {
		return syphilisScreenedTotal;
	}
	public void setSyphilisScreenedTotal(int syphilisScreenedTotal) {
		this.syphilisScreenedTotal = syphilisScreenedTotal;
	}
	public int getSyphilisReactiveMale() {
		return syphilisReactiveMale;
	}
	public void setSyphilisReactiveMale(int syphilisReactiveMale) {
		this.syphilisReactiveMale = syphilisReactiveMale;
	}
	public int getSyphilisReactiveFemale() {
		return syphilisReactiveFemale;
	}
	public void setSyphilisReactiveFemale(int syphilisReactiveFemale) {
		this.syphilisReactiveFemale = syphilisReactiveFemale;
	}
	public int getSyphilisReactiveTransgender() {
		return syphilisReactiveTransgender;
	}
	public void setSyphilisReactiveTransgender(int syphilisReactiveTransgender) {
		this.syphilisReactiveTransgender = syphilisReactiveTransgender;
	}
	public int getSyphilisReactiveTotal() {
		return syphilisReactiveTotal;
	}
	public void setSyphilisReactiveTotal(int syphilisReactiveTotal) {
		this.syphilisReactiveTotal = syphilisReactiveTotal;
	}
	public int getSyphilisTreatedMale() {
		return syphilisTreatedMale;
	}
	public void setSyphilisTreatedMale(int syphilisTreatedMale) {
		this.syphilisTreatedMale = syphilisTreatedMale;
	}
	public int getSyphilisTreatedFemale() {
		return syphilisTreatedFemale;
	}
	public void setSyphilisTreatedFemale(int syphilisTreatedFemale) {
		this.syphilisTreatedFemale = syphilisTreatedFemale;
	}
	public int getSyphilisTreatedTransgender() {
		return syphilisTreatedTransgender;
	}
	public void setSyphilisTreatedTransgender(int syphilisTreatedTransgender) {
		this.syphilisTreatedTransgender = syphilisTreatedTransgender;
	}
	public int getSyphilisTreatedTotal() {
		return syphilisTreatedTotal;
	}
	public void setSyphilisTreatedTotal(int syphilisTreatedTotal) {
		this.syphilisTreatedTotal = syphilisTreatedTotal;
	}
	public int getTbScreenedMale() {
		return tbScreenedMale;
	}
	public void setTbScreenedMale(int tbScreenedMale) {
		this.tbScreenedMale = tbScreenedMale;
	}
	public int getTbScreenedFemale() {
		return tbScreenedFemale;
	}
	public void setTbScreenedFemale(int tbScreenedFemale) {
		this.tbScreenedFemale = tbScreenedFemale;
	}
	public int getTbScreenedTransgender() {
		return tbScreenedTransgender;
	}
	public void setTbScreenedTransgender(int tbScreenedTransgender) {
		this.tbScreenedTransgender = tbScreenedTransgender;
	}
	public int getTbScreenedTotal() {
		return tbScreenedTotal;
	}
	public void setTbScreenedTotal(int tbScreenedTotal) {
		this.tbScreenedTotal = tbScreenedTotal;
	}
	public int getTbSuspectedMale() {
		return tbSuspectedMale;
	}
	public void setTbSuspectedMale(int tbSuspectedMale) {
		this.tbSuspectedMale = tbSuspectedMale;
	}
	public int getTbSuspectedFemale() {
		return tbSuspectedFemale;
	}
	public void setTbSuspectedFemale(int tbSuspectedFemale) {
		this.tbSuspectedFemale = tbSuspectedFemale;
	}
	public int getTbSuspectedTransgender() {
		return tbSuspectedTransgender;
	}
	public void setTbSuspectedTransgender(int tbSuspectedTransgender) {
		this.tbSuspectedTransgender = tbSuspectedTransgender;
	}
	public int getTbSuspectedTotal() {
		return tbSuspectedTotal;
	}
	public void setTbSuspectedTotal(int tbSuspectedTotal) {
		this.tbSuspectedTotal = tbSuspectedTotal;
	}
	public int getTbTestedMale() {
		return tbTestedMale;
	}
	public void setTbTestedMale(int tbTestedMale) {
		this.tbTestedMale = tbTestedMale;
	}
	public int getTbTestedFemale() {
		return tbTestedFemale;
	}
	public void setTbTestedFemale(int tbTestedFemale) {
		this.tbTestedFemale = tbTestedFemale;
	}
	public int getTbTestedTransgender() {
		return tbTestedTransgender;
	}
	public void setTbTestedTransgender(int tbTestedTransgender) {
		this.tbTestedTransgender = tbTestedTransgender;
	}
	public int getTbTestedTotal() {
		return tbTestedTotal;
	}
	public void setTbTestedTotal(int tbTestedTotal) {
		this.tbTestedTotal = tbTestedTotal;
	}
	public int getTbPositiveMale() {
		return tbPositiveMale;
	}
	public void setTbPositiveMale(int tbPositiveMale) {
		this.tbPositiveMale = tbPositiveMale;
	}
	public int getTbPositiveFemale() {
		return tbPositiveFemale;
	}
	public void setTbPositiveFemale(int tbPositiveFemale) {
		this.tbPositiveFemale = tbPositiveFemale;
	}
	public int getTbPositiveTransgender() {
		return tbPositiveTransgender;
	}
	public void setTbPositiveTransgender(int tbPositiveTransgender) {
		this.tbPositiveTransgender = tbPositiveTransgender;
	}
	public int getTbPositiveTotal() {
		return tbPositiveTotal;
	}
	public void setTbPositiveTotal(int tbPositiveTotal) {
		this.tbPositiveTotal = tbPositiveTotal;
	}
	public int getTbPositivePutOnDotsMale() {
		return tbPositivePutOnDotsMale;
	}
	public void setTbPositivePutOnDotsMale(int tbPositivePutOnDotsMale) {
		this.tbPositivePutOnDotsMale = tbPositivePutOnDotsMale;
	}
	public int getTbPositivePutOnDotsFemale() {
		return tbPositivePutOnDotsFemale;
	}
	public void setTbPositivePutOnDotsFemale(int tbPositivePutOnDotsFemale) {
		this.tbPositivePutOnDotsFemale = tbPositivePutOnDotsFemale;
	}
	public int getTbPositivePutOnDotsTransgender() {
		return tbPositivePutOnDotsTransgender;
	}
	public void setTbPositivePutOnDotsTransgender(int tbPositivePutOnDotsTransgender) {
		this.tbPositivePutOnDotsTransgender = tbPositivePutOnDotsTransgender;
	}
	public int getTbPositivePutOnDotsTotal() {
		return tbPositivePutOnDotsTotal;
	}
	public void setTbPositivePutOnDotsTotal(int tbPositivePutOnDotsTotal) {
		this.tbPositivePutOnDotsTotal = tbPositivePutOnDotsTotal;
	}
	public int getScreenedForHepBMale() {
		return screenedForHepBMale;
	}
	public void setScreenedForHepBMale(int screenedForHepBMale) {
		this.screenedForHepBMale = screenedForHepBMale;
	}
	public int getScreenedForHepBFemale() {
		return screenedForHepBFemale;
	}
	public void setScreenedForHepBFemale(int screenedForHepBFemale) {
		this.screenedForHepBFemale = screenedForHepBFemale;
	}
	public int getScreenedForHepBTransgender() {
		return screenedForHepBTransgender;
	}
	public void setScreenedForHepBTransgender(int screenedForHepBTransgender) {
		this.screenedForHepBTransgender = screenedForHepBTransgender;
	}
	public int getScreenedForHepBTotal() {
		return screenedForHepBTotal;
	}
	public void setScreenedForHepBTotal(int screenedForHepBTotal) {
		this.screenedForHepBTotal = screenedForHepBTotal;
	}
	public int getHepBReactiveMale() {
		return hepBReactiveMale;
	}
	public void setHepBReactiveMale(int hepBReactiveMale) {
		this.hepBReactiveMale = hepBReactiveMale;
	}
	public int getHepBReactiveFemale() {
		return hepBReactiveFemale;
	}
	public void setHepBReactiveFemale(int hepBReactiveFemale) {
		this.hepBReactiveFemale = hepBReactiveFemale;
	}
	public int getHepBReactiveTransgender() {
		return hepBReactiveTransgender;
	}
	public void setHepBReactiveTransgender(int hepBReactiveTransgender) {
		this.hepBReactiveTransgender = hepBReactiveTransgender;
	}
	public int getHepBReactiveTotal() {
		return hepBReactiveTotal;
	}
	public void setHepBReactiveTotal(int hepBReactiveTotal) {
		this.hepBReactiveTotal = hepBReactiveTotal;
	}
	public int getHepBReactiveLinkedForTreatmentMale() {
		return hepBReactiveLinkedForTreatmentMale;
	}
	public void setHepBReactiveLinkedForTreatmentMale(int hepBReactiveLinkedForTreatmentMale) {
		this.hepBReactiveLinkedForTreatmentMale = hepBReactiveLinkedForTreatmentMale;
	}
	public int getHepBReactiveLinkedForTreatmentFemale() {
		return hepBReactiveLinkedForTreatmentFemale;
	}
	public void setHepBReactiveLinkedForTreatmentFemale(int hepBReactiveLinkedForTreatmentFemale) {
		this.hepBReactiveLinkedForTreatmentFemale = hepBReactiveLinkedForTreatmentFemale;
	}
	public int getHepBReactiveLinkedForTreatmentTransgender() {
		return hepBReactiveLinkedForTreatmentTransgender;
	}
	public void setHepBReactiveLinkedForTreatmentTransgender(int hepBReactiveLinkedForTreatmentTransgender) {
		this.hepBReactiveLinkedForTreatmentTransgender = hepBReactiveLinkedForTreatmentTransgender;
	}
	public int getHepBReactiveLinkedForTreatmentTotal() {
		return hepBReactiveLinkedForTreatmentTotal;
	}
	public void setHepBReactiveLinkedForTreatmentTotal(int hepBReactiveLinkedForTreatmentTotal) {
		this.hepBReactiveLinkedForTreatmentTotal = hepBReactiveLinkedForTreatmentTotal;
	}
	public int getHepBPositivePutOnTreatmentMale() {
		return hepBPositivePutOnTreatmentMale;
	}
	public void setHepBPositivePutOnTreatmentMale(int hepBPositivePutOnTreatmentMale) {
		this.hepBPositivePutOnTreatmentMale = hepBPositivePutOnTreatmentMale;
	}
	public int getHepBPositivePutOnTreatmentFemale() {
		return hepBPositivePutOnTreatmentFemale;
	}
	public void setHepBPositivePutOnTreatmentFemale(int hepBPositivePutOnTreatmentFemale) {
		this.hepBPositivePutOnTreatmentFemale = hepBPositivePutOnTreatmentFemale;
	}
	public int getHepBPositivePutOnTreatmentTransgender() {
		return hepBPositivePutOnTreatmentTransgender;
	}
	public void setHepBPositivePutOnTreatmentTransgender(int hepBPositivePutOnTreatmentTransgender) {
		this.hepBPositivePutOnTreatmentTransgender = hepBPositivePutOnTreatmentTransgender;
	}
	public int getHepBPositivePutOnTreatmentTotal() {
		return hepBPositivePutOnTreatmentTotal;
	}
	public void setHepBPositivePutOnTreatmentTotal(int hepBPositivePutOnTreatmentTotal) {
		this.hepBPositivePutOnTreatmentTotal = hepBPositivePutOnTreatmentTotal;
	}
	public int getScreenedForHepCMale() {
		return screenedForHepCMale;
	}
	public void setScreenedForHepCMale(int screenedForHepCMale) {
		this.screenedForHepCMale = screenedForHepCMale;
	}
	public int getScreenedForHepCFemale() {
		return screenedForHepCFemale;
	}
	public void setScreenedForHepCFemale(int screenedForHepCFemale) {
		this.screenedForHepCFemale = screenedForHepCFemale;
	}
	public int getScreenedForHepCTransgender() {
		return screenedForHepCTransgender;
	}
	public void setScreenedForHepCTransgender(int screenedForHepCTransgender) {
		this.screenedForHepCTransgender = screenedForHepCTransgender;
	}
	public int getScreenedForHepCTotal() {
		return screenedForHepCTotal;
	}
	public void setScreenedForHepCTotal(int screenedForHepCTotal) {
		this.screenedForHepCTotal = screenedForHepCTotal;
	}
	public int getHepCReactiveMale() {
		return hepCReactiveMale;
	}
	public void setHepCReactiveMale(int hepCReactiveMale) {
		this.hepCReactiveMale = hepCReactiveMale;
	}
	public int getHepCReactiveFemale() {
		return hepCReactiveFemale;
	}
	public void setHepCReactiveFemale(int hepCReactiveFemale) {
		this.hepCReactiveFemale = hepCReactiveFemale;
	}
	public int getHepCReactiveTransgender() {
		return hepCReactiveTransgender;
	}
	public void setHepCReactiveTransgender(int hepCReactiveTransgender) {
		this.hepCReactiveTransgender = hepCReactiveTransgender;
	}
	public int getHepCReactiveTotal() {
		return hepCReactiveTotal;
	}
	public void setHepCReactiveTotal(int hepCReactiveTotal) {
		this.hepCReactiveTotal = hepCReactiveTotal;
	}
	public int getHepCReactiveLinkedForTreatmentMale() {
		return hepCReactiveLinkedForTreatmentMale;
	}
	public void setHepCReactiveLinkedForTreatmentMale(int hepCReactiveLinkedForTreatmentMale) {
		this.hepCReactiveLinkedForTreatmentMale = hepCReactiveLinkedForTreatmentMale;
	}
	public int getHepCReactiveLinkedForTreatmentFemale() {
		return hepCReactiveLinkedForTreatmentFemale;
	}
	public void setHepCReactiveLinkedForTreatmentFemale(int hepCReactiveLinkedForTreatmentFemale) {
		this.hepCReactiveLinkedForTreatmentFemale = hepCReactiveLinkedForTreatmentFemale;
	}
	public int getHepCReactiveLinkedForTreatmentTransgender() {
		return hepCReactiveLinkedForTreatmentTransgender;
	}
	public void setHepCReactiveLinkedForTreatmentTransgender(int hepCReactiveLinkedForTreatmentTransgender) {
		this.hepCReactiveLinkedForTreatmentTransgender = hepCReactiveLinkedForTreatmentTransgender;
	}
	public int getHepCReactiveLinkedForTreatmentTotal() {
		return hepCReactiveLinkedForTreatmentTotal;
	}
	public void setHepCReactiveLinkedForTreatmentTotal(int hepCReactiveLinkedForTreatmentTotal) {
		this.hepCReactiveLinkedForTreatmentTotal = hepCReactiveLinkedForTreatmentTotal;
	}
	public int getHepCPositivePutOnTreatmentMale() {
		return hepCPositivePutOnTreatmentMale;
	}
	public void setHepCPositivePutOnTreatmentMale(int hepCPositivePutOnTreatmentMale) {
		this.hepCPositivePutOnTreatmentMale = hepCPositivePutOnTreatmentMale;
	}
	public int getHepCPositivePutOnTreatmentFemale() {
		return hepCPositivePutOnTreatmentFemale;
	}
	public void setHepCPositivePutOnTreatmentFemale(int hepCPositivePutOnTreatmentFemale) {
		this.hepCPositivePutOnTreatmentFemale = hepCPositivePutOnTreatmentFemale;
	}
	public int getHepCPositivePutOnTreatmentTransgender() {
		return hepCPositivePutOnTreatmentTransgender;
	}
	public void setHepCPositivePutOnTreatmentTransgender(int hepCPositivePutOnTreatmentTransgender) {
		this.hepCPositivePutOnTreatmentTransgender = hepCPositivePutOnTreatmentTransgender;
	}
	public int getHepCPositivePutOnTreatmentTotal() {
		return hepCPositivePutOnTreatmentTotal;
	}
	public void setHepCPositivePutOnTreatmentTotal(int hepCPositivePutOnTreatmentTotal) {
		this.hepCPositivePutOnTreatmentTotal = hepCPositivePutOnTreatmentTotal;
	}
    
    
    
    
}
   
 // :: STI Syndrome ::  //
  class STISyndrome{
    private int vcdFemale;
    private int vcdTotal;
    private int vcdTreated;
    private int gudNonHerpeticMale;
    private int gudNonHerpeticFemale;
    private int gudNonHerpeticTGTS;
    private int gudNonHerpeticTotal;
    private int gudNonHerpeticTreated;
    private int gudHerpeticMale;
    private int gudHerpeticFemale;
    private int gudHerpeticTGTS;
    private int gudHerpeticTotal;
    private int gudHerpeticTreated;
    private int lapFemale;
    private int lapTotal;
    private int lapTreated;
    private int udMale;
    private int udTGTS;
    private int udTotal;
    private int udTreated;
    private int ardMale;
    private int ardFemale;
    private int ardTGTS;
    private int ardTotal;
    private int ardTreated;
    private int ibMale;
    private int ibFemale;
    private int ibTGTS;
    private int ibTotal;
    private int ibTreated;
    private int ssMale;
    private int ssTGTS;
    private int ssTotal;
    private int ssTreated;
    private int genitalWartsMale;
    private int genitalWartsFemale;
    private int genitalWartsTGTS;
    private int genitalWartsTotal;
    private int genitalWartsTreated;
    private int otherSTIsMale;
    private int otherSTIsFemale;
    private int otherSTIsTGTS;
    private int otherSTIsTotal;
    private int otherSTIsTreated;
    private String otherInformationOfHeathCamp;
    
	public int getVcdFemale() {
		return vcdFemale;
	}
	public void setVcdFemale(int vcdFemale) {
		this.vcdFemale = vcdFemale;
	}
	public int getVcdTotal() {
		return vcdTotal;
	}
	public void setVcdTotal(int vcdTotal) {
		this.vcdTotal = vcdTotal;
	}
	public int getVcdTreated() {
		return vcdTreated;
	}
	public void setVcdTreated(int vcdTreated) {
		this.vcdTreated = vcdTreated;
	}
	public int getGudNonHerpeticMale() {
		return gudNonHerpeticMale;
	}
	public void setGudNonHerpeticMale(int gudNonHerpeticMale) {
		this.gudNonHerpeticMale = gudNonHerpeticMale;
	}
	public int getGudNonHerpeticFemale() {
		return gudNonHerpeticFemale;
	}
	public void setGudNonHerpeticFemale(int gudNonHerpeticFemale) {
		this.gudNonHerpeticFemale = gudNonHerpeticFemale;
	}
	public int getGudNonHerpeticTGTS() {
		return gudNonHerpeticTGTS;
	}
	public void setGudNonHerpeticTGTS(int gudNonHerpeticTGTS) {
		this.gudNonHerpeticTGTS = gudNonHerpeticTGTS;
	}
	public int getGudNonHerpeticTotal() {
		return gudNonHerpeticTotal;
	}
	public void setGudNonHerpeticTotal(int gudNonHerpeticTotal) {
		this.gudNonHerpeticTotal = gudNonHerpeticTotal;
	}
	public int getGudNonHerpeticTreated() {
		return gudNonHerpeticTreated;
	}
	public void setGudNonHerpeticTreated(int gudNonHerpeticTreated) {
		this.gudNonHerpeticTreated = gudNonHerpeticTreated;
	}
	public int getGudHerpeticMale() {
		return gudHerpeticMale;
	}
	public void setGudHerpeticMale(int gudHerpeticMale) {
		this.gudHerpeticMale = gudHerpeticMale;
	}
	public int getGudHerpeticFemale() {
		return gudHerpeticFemale;
	}
	public void setGudHerpeticFemale(int gudHerpeticFemale) {
		this.gudHerpeticFemale = gudHerpeticFemale;
	}
	public int getGudHerpeticTGTS() {
		return gudHerpeticTGTS;
	}
	public void setGudHerpeticTGTS(int gudHerpeticTGTS) {
		this.gudHerpeticTGTS = gudHerpeticTGTS;
	}
	public int getGudHerpeticTotal() {
		return gudHerpeticTotal;
	}
	public void setGudHerpeticTotal(int gudHerpeticTotal) {
		this.gudHerpeticTotal = gudHerpeticTotal;
	}
	public int getGudHerpeticTreated() {
		return gudHerpeticTreated;
	}
	public void setGudHerpeticTreated(int gudHerpeticTreated) {
		this.gudHerpeticTreated = gudHerpeticTreated;
	}
	public int getLapFemale() {
		return lapFemale;
	}
	public void setLapFemale(int lapFemale) {
		this.lapFemale = lapFemale;
	}
	public int getLapTotal() {
		return lapTotal;
	}
	public void setLapTotal(int lapTotal) {
		this.lapTotal = lapTotal;
	}
	public int getLapTreated() {
		return lapTreated;
	}
	public void setLapTreated(int lapTreated) {
		this.lapTreated = lapTreated;
	}
	public int getUdMale() {
		return udMale;
	}
	public void setUdMale(int udMale) {
		this.udMale = udMale;
	}
	public int getUdTGTS() {
		return udTGTS;
	}
	public void setUdTGTS(int udTGTS) {
		this.udTGTS = udTGTS;
	}
	public int getUdTotal() {
		return udTotal;
	}
	public void setUdTotal(int udTotal) {
		this.udTotal = udTotal;
	}
	public int getUdTreated() {
		return udTreated;
	}
	public void setUdTreated(int udTreated) {
		this.udTreated = udTreated;
	}
	public int getArdMale() {
		return ardMale;
	}
	public void setArdMale(int ardMale) {
		this.ardMale = ardMale;
	}
	public int getArdFemale() {
		return ardFemale;
	}
	public void setArdFemale(int ardFemale) {
		this.ardFemale = ardFemale;
	}
	public int getArdTGTS() {
		return ardTGTS;
	}
	public void setArdTGTS(int ardTGTS) {
		this.ardTGTS = ardTGTS;
	}
	public int getArdTotal() {
		return ardTotal;
	}
	public void setArdTotal(int ardTotal) {
		this.ardTotal = ardTotal;
	}
	public int getArdTreated() {
		return ardTreated;
	}
	public void setArdTreated(int ardTreated) {
		this.ardTreated = ardTreated;
	}
	public int getIbMale() {
		return ibMale;
	}
	public void setIbMale(int ibMale) {
		this.ibMale = ibMale;
	}
	public int getIbFemale() {
		return ibFemale;
	}
	public void setIbFemale(int ibFemale) {
		this.ibFemale = ibFemale;
	}
	public int getIbTGTS() {
		return ibTGTS;
	}
	public void setIbTGTS(int ibTGTS) {
		this.ibTGTS = ibTGTS;
	}
	public int getIbTotal() {
		return ibTotal;
	}
	public void setIbTotal(int ibTotal) {
		this.ibTotal = ibTotal;
	}
	public int getIbTreated() {
		return ibTreated;
	}
	public void setIbTreated(int ibTreated) {
		this.ibTreated = ibTreated;
	}
	public int getSsMale() {
		return ssMale;
	}
	public void setSsMale(int ssMale) {
		this.ssMale = ssMale;
	}
	public int getSsTGTS() {
		return ssTGTS;
	}
	public void setSsTGTS(int ssTGTS) {
		this.ssTGTS = ssTGTS;
	}
	public int getSsTotal() {
		return ssTotal;
	}
	public void setSsTotal(int ssTotal) {
		this.ssTotal = ssTotal;
	}
	public int getSsTreated() {
		return ssTreated;
	}
	public void setSsTreated(int ssTreated) {
		this.ssTreated = ssTreated;
	}
	public int getGenitalWartsMale() {
		return genitalWartsMale;
	}
	public void setGenitalWartsMale(int genitalWartsMale) {
		this.genitalWartsMale = genitalWartsMale;
	}
	public int getGenitalWartsFemale() {
		return genitalWartsFemale;
	}
	public void setGenitalWartsFemale(int genitalWartsFemale) {
		this.genitalWartsFemale = genitalWartsFemale;
	}
	public int getGenitalWartsTGTS() {
		return genitalWartsTGTS;
	}
	public void setGenitalWartsTGTS(int genitalWartsTGTS) {
		this.genitalWartsTGTS = genitalWartsTGTS;
	}
	public int getGenitalWartsTotal() {
		return genitalWartsTotal;
	}
	public void setGenitalWartsTotal(int genitalWartsTotal) {
		this.genitalWartsTotal = genitalWartsTotal;
	}
	public int getGenitalWartsTreated() {
		return genitalWartsTreated;
	}
	public void setGenitalWartsTreated(int genitalWartsTreated) {
		this.genitalWartsTreated = genitalWartsTreated;
	}
	public int getOtherSTIsMale() {
		return otherSTIsMale;
	}
	public void setOtherSTIsMale(int otherSTIsMale) {
		this.otherSTIsMale = otherSTIsMale;
	}
	public int getOtherSTIsFemale() {
		return otherSTIsFemale;
	}
	public void setOtherSTIsFemale(int otherSTIsFemale) {
		this.otherSTIsFemale = otherSTIsFemale;
	}
	public int getOtherSTIsTGTS() {
		return otherSTIsTGTS;
	}
	public void setOtherSTIsTGTS(int otherSTIsTGTS) {
		this.otherSTIsTGTS = otherSTIsTGTS;
	}
	public int getOtherSTIsTotal() {
		return otherSTIsTotal;
	}
	public void setOtherSTIsTotal(int otherSTIsTotal) {
		this.otherSTIsTotal = otherSTIsTotal;
	}
	public int getOtherSTIsTreated() {
		return otherSTIsTreated;
	}
	public void setOtherSTIsTreated(int otherSTIsTreated) {
		this.otherSTIsTreated = otherSTIsTreated;
	}
	public String getOtherInformationOfHeathCamp() {
		return otherInformationOfHeathCamp;
	}
	public void setOtherInformationOfHeathCamp(String otherInformationOfHeathCamp) {
		this.otherInformationOfHeathCamp = otherInformationOfHeathCamp;
	}
    
    
    
  }

}
