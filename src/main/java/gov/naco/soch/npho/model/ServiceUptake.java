package gov.naco.soch.npho.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceUptake {
    private String generalHealthCheckupMale;
    private String generalHealthCheckupFemale;
    private String generalHealthCheckupTransgender;
    private String generalHealthCheckupTotal;
    
    //private String antenatalCheckupMale;
    private String antenatalCheckupFemale;
    //private String antenatalCheckupTransgender;
    private String antenatalCheckupTotal;
    
    private String stiCheckupMale;
    private String stiCheckupFemale;
    private String stiCheckupTransgender;
    private String stiCheckupTotal;
    
    private String stiDiagnosedMale;
    private String stiDiagnosedFemale;
    private String stiDiagnosedTransgender;
    private String stiDiagnosedTotal;
    
    private String stiTreatedMale;
    private String stiTreatedFemale;
    private String stiTreatedTransgender;
    private String stiTreatedTotal;
    
    private String hivScreenedMale;
    private String hivScreenedFemale;
    private String hivScreenedTransgender;
    private String hivScreenedTotal;
    
    private String hivReactiveMale;
    private String hivReactiveFemale;
    private String hivReactiveTransgender;
    private String hivReactiveTotal;
    
    private String hivConfirmedPositiveMale;
    private String hivConfirmedPositiveFemale;
    private String hivConfirmedPositiveTransgender;
    private String hivConfirmedPositiveTotal;
    
    private String hivPositiveLinkedToArtMale;
    private String hivPositiveLinkedToArtFemale;
    private String hivPositiveLinkedToArtTransgender;
    private String hivPositiveLinkedToArtTotal;
    
    private String syphilisScreenedMale;
    private String syphilisScreenedFemale;
    private String syphilisScreenedTransgender;
    private String syphilisScreenedTotal;
    
    private String syphilisReactiveMale;
    private String syphilisReactiveFemale;
    private String syphilisReactiveTransgender;
    private String syphilisReactiveTotal;
    
    private String syphilisTreatedMale;
    private String syphilisTreatedFemale;
    private String syphilisTreatedTransgender;
    private String syphilisTreatedTotal;
    
    private String tbScreenedMale;
    private String tbScreenedFemale;
    private String tbScreenedTransgender;
    private String tbScreenedTotal;
    
    private String tbSuspectedMale;
    private String tbSuspectedFemale;
    private String tbSuspectedTransgender;
    private String tbSuspectedTotal;
    
    private String tbTestedMale;
    private String tbTestedFemale;
    private String tbTestedTransgender;
    private String tbTestedTotal;
    
    private String tbPositiveMale;
    private String tbPositiveFemale;
    private String tbPositiveTransgender;
    private String tbPositiveTotal;
    
    private String tbPositivePutOnDotsMale;
    private String tbPositivePutOnDotsFemale;
    private String tbPositivePutOnDotsTransgender;
    private String tbPositivePutOnDotsTotal;
    
    private String screenedForHepBMale;
    private String screenedForHepBFemale;
    private String screenedForHepBTransgender;
    private String screenedForHepBTotal;
    
    private String hepBReactiveMale;
    private String hepBReactiveFemale;
    private String hepBReactiveTransgender;
    private String hepBReactiveTotal;
    private String hepBReactiveLinkedForTreatmentMale;
    private String hepBReactiveLinkedForTreatmentFemale;
    private String hepBReactiveLinkedForTreatmentTransgender;
    private String hepBReactiveLinkedForTreatmentTotal;
    private String screenedForHepCMale;
    private String screenedForHepCFemale;
    private String screenedForHepCTransgender;
    private String screenedForHepCTotal;
    private String hepCReactiveMale;
    private String hepCReactiveFemale;
    private String hepCReactiveTransgender;
    private String hepCReactiveTotal;
    private String hepCReactiveLinkedForTreatmentMale;
    private String hepCReactiveLinkedForTreatmentFemale;
    private String hepCReactiveLinkedForTreatmentTransgender;
    private String hepCReactiveLinkedForTreatmentTotal;
    
    private byte campDataId;
    
	public byte getCampDataId() {
		return campDataId;
	}
	public void setCampDataId(byte campDataId) {
		this.campDataId = campDataId;
	}
	
	public String getGeneralHealthCheckupMale() {
		return generalHealthCheckupMale;
	}
	public void setGeneralHealthCheckupMale(String generalHealthCheckupMale) {
		this.generalHealthCheckupMale = generalHealthCheckupMale;
	}
	public String getGeneralHealthCheckupFemale() {
		return generalHealthCheckupFemale;
	}
	public void setGeneralHealthCheckupFemale(String generalHealthCheckupFemale) {
		this.generalHealthCheckupFemale = generalHealthCheckupFemale;
	}
	public String getGeneralHealthCheckupTransgender() {
		return generalHealthCheckupTransgender;
	}
	public void setGeneralHealthCheckupTransgender(String generalHealthCheckupTransgender) {
		this.generalHealthCheckupTransgender = generalHealthCheckupTransgender;
	}
	public String getGeneralHealthCheckupTotal() {
		return generalHealthCheckupTotal;
	}
	public void setGeneralHealthCheckupTotal(String generalHealthCheckupTotal) {
		this.generalHealthCheckupTotal = generalHealthCheckupTotal;
	}
//	public String getAntenatalCheckupMale() {
//		return antenatalCheckupMale;
//	}
//	public void setAntenatalCheckupMale(String antenatalCheckupMale) {
//		this.antenatalCheckupMale = antenatalCheckupMale;
//	}
	public String getAntenatalCheckupFemale() {
		return antenatalCheckupFemale;
	}
	public void setAntenatalCheckupFemale(String antenatalCheckupFemale) {
		this.antenatalCheckupFemale = antenatalCheckupFemale;
	}
//	public String getAntenatalCheckupTransgender() {
//		return antenatalCheckupTransgender;
//	}
//	public void setAntenatalCheckupTransgender(String antenatalCheckupTransgender) {
//		this.antenatalCheckupTransgender = antenatalCheckupTransgender;
//	}
	public String getAntenatalCheckupTotal() {
		return antenatalCheckupTotal;
	}
	public void setAntenatalCheckupTotal(String antenatalCheckupTotal) {
		this.antenatalCheckupTotal = antenatalCheckupTotal;
	}
	public String getStiCheckupMale() {
		return stiCheckupMale;
	}
	public void setStiCheckupMale(String stiCheckupMale) {
		this.stiCheckupMale = stiCheckupMale;
	}
	public String getStiCheckupFemale() {
		return stiCheckupFemale;
	}
	public void setStiCheckupFemale(String stiCheckupFemale) {
		this.stiCheckupFemale = stiCheckupFemale;
	}
	public String getStiCheckupTransgender() {
		return stiCheckupTransgender;
	}
	public void setStiCheckupTransgender(String stiCheckupTransgender) {
		this.stiCheckupTransgender = stiCheckupTransgender;
	}
	public String getStiCheckupTotal() {
		return stiCheckupTotal;
	}
	public void setStiCheckupTotal(String stiCheckupTotal) {
		this.stiCheckupTotal = stiCheckupTotal;
	}
	public String getStiDiagnosedMale() {
		return stiDiagnosedMale;
	}
	public void setStiDiagnosedMale(String stiDiagnosedMale) {
		this.stiDiagnosedMale = stiDiagnosedMale;
	}
	public String getStiDiagnosedFemale() {
		return stiDiagnosedFemale;
	}
	public void setStiDiagnosedFemale(String stiDiagnosedFemale) {
		this.stiDiagnosedFemale = stiDiagnosedFemale;
	}
	public String getStiDiagnosedTransgender() {
		return stiDiagnosedTransgender;
	}
	public void setStiDiagnosedTransgender(String stiDiagnosedTransgender) {
		this.stiDiagnosedTransgender = stiDiagnosedTransgender;
	}
	public String getStiDiagnosedTotal() {
		return stiDiagnosedTotal;
	}
	public void setStiDiagnosedTotal(String stiDiagnosedTotal) {
		this.stiDiagnosedTotal = stiDiagnosedTotal;
	}
	public String getStiTreatedMale() {
		return stiTreatedMale;
	}
	public void setStiTreatedMale(String stiTreatedMale) {
		this.stiTreatedMale = stiTreatedMale;
	}
	public String getStiTreatedFemale() {
		return stiTreatedFemale;
	}
	public void setStiTreatedFemale(String stiTreatedFemale) {
		this.stiTreatedFemale = stiTreatedFemale;
	}
	public String getStiTreatedTransgender() {
		return stiTreatedTransgender;
	}
	public void setStiTreatedTransgender(String stiTreatedTransgender) {
		this.stiTreatedTransgender = stiTreatedTransgender;
	}
	public String getStiTreatedTotal() {
		return stiTreatedTotal;
	}
	public void setStiTreatedTotal(String stiTreatedTotal) {
		this.stiTreatedTotal = stiTreatedTotal;
	}
	public String getHivScreenedMale() {
		return hivScreenedMale;
	}
	public void setHivScreenedMale(String hivScreenedMale) {
		this.hivScreenedMale = hivScreenedMale;
	}
	public String getHivScreenedFemale() {
		return hivScreenedFemale;
	}
	public void setHivScreenedFemale(String hivScreenedFemale) {
		this.hivScreenedFemale = hivScreenedFemale;
	}
	public String getHivScreenedTransgender() {
		return hivScreenedTransgender;
	}
	public void setHivScreenedTransgender(String hivScreenedTransgender) {
		this.hivScreenedTransgender = hivScreenedTransgender;
	}
	public String getHivScreenedTotal() {
		return hivScreenedTotal;
	}
	public void setHivScreenedTotal(String hivScreenedTotal) {
		this.hivScreenedTotal = hivScreenedTotal;
	}
	public String getHivReactiveMale() {
		return hivReactiveMale;
	}
	public void setHivReactiveMale(String hivReactiveMale) {
		this.hivReactiveMale = hivReactiveMale;
	}
	public String getHivReactiveFemale() {
		return hivReactiveFemale;
	}
	public void setHivReactiveFemale(String hivReactiveFemale) {
		this.hivReactiveFemale = hivReactiveFemale;
	}
	public String getHivReactiveTransgender() {
		return hivReactiveTransgender;
	}
	public void setHivReactiveTransgender(String hivReactiveTransgender) {
		this.hivReactiveTransgender = hivReactiveTransgender;
	}
	public String getHivReactiveTotal() {
		return hivReactiveTotal;
	}
	public void setHivReactiveTotal(String hivReactiveTotal) {
		this.hivReactiveTotal = hivReactiveTotal;
	}
	public String getHivConfirmedPositiveMale() {
		return hivConfirmedPositiveMale;
	}
	public void setHivConfirmedPositiveMale(String hivConfirmedPositiveMale) {
		this.hivConfirmedPositiveMale = hivConfirmedPositiveMale;
	}
	public String getHivConfirmedPositiveFemale() {
		return hivConfirmedPositiveFemale;
	}
	public void setHivConfirmedPositiveFemale(String hivConfirmedPositiveFemale) {
		this.hivConfirmedPositiveFemale = hivConfirmedPositiveFemale;
	}
	public String getHivConfirmedPositiveTransgender() {
		return hivConfirmedPositiveTransgender;
	}
	public void setHivConfirmedPositiveTransgender(String hivConfirmedPositiveTransgender) {
		this.hivConfirmedPositiveTransgender = hivConfirmedPositiveTransgender;
	}
	public String getHivConfirmedPositiveTotal() {
		return hivConfirmedPositiveTotal;
	}
	public void setHivConfirmedPositiveTotal(String hivConfirmedPositiveTotal) {
		this.hivConfirmedPositiveTotal = hivConfirmedPositiveTotal;
	}
	public String getHivPositiveLinkedToArtMale() {
		return hivPositiveLinkedToArtMale;
	}
	public void setHivPositiveLinkedToArtMale(String hivPositiveLinkedToArtMale) {
		this.hivPositiveLinkedToArtMale = hivPositiveLinkedToArtMale;
	}
	public String getHivPositiveLinkedToArtFemale() {
		return hivPositiveLinkedToArtFemale;
	}
	public void setHivPositiveLinkedToArtFemale(String hivPositiveLinkedToArtFemale) {
		this.hivPositiveLinkedToArtFemale = hivPositiveLinkedToArtFemale;
	}
	public String getHivPositiveLinkedToArtTransgender() {
		return hivPositiveLinkedToArtTransgender;
	}
	public void setHivPositiveLinkedToArtTransgender(String hivPositiveLinkedToArtTransgender) {
		this.hivPositiveLinkedToArtTransgender = hivPositiveLinkedToArtTransgender;
	}
	public String getHivPositiveLinkedToArtTotal() {
		return hivPositiveLinkedToArtTotal;
	}
	public void setHivPositiveLinkedToArtTotal(String hivPositiveLinkedToArtTotal) {
		this.hivPositiveLinkedToArtTotal = hivPositiveLinkedToArtTotal;
	}
	public String getSyphilisScreenedMale() {
		return syphilisScreenedMale;
	}
	public void setSyphilisScreenedMale(String syphilisScreenedMale) {
		this.syphilisScreenedMale = syphilisScreenedMale;
	}
	public String getSyphilisScreenedFemale() {
		return syphilisScreenedFemale;
	}
	public void setSyphilisScreenedFemale(String syphilisScreenedFemale) {
		this.syphilisScreenedFemale = syphilisScreenedFemale;
	}
	public String getSyphilisScreenedTransgender() {
		return syphilisScreenedTransgender;
	}
	public void setSyphilisScreenedTransgender(String syphilisScreenedTransgender) {
		this.syphilisScreenedTransgender = syphilisScreenedTransgender;
	}
	public String getSyphilisScreenedTotal() {
		return syphilisScreenedTotal;
	}
	public void setSyphilisScreenedTotal(String syphilisScreenedTotal) {
		this.syphilisScreenedTotal = syphilisScreenedTotal;
	}
	public String getSyphilisReactiveMale() {
		return syphilisReactiveMale;
	}
	public void setSyphilisReactiveMale(String syphilisReactiveMale) {
		this.syphilisReactiveMale = syphilisReactiveMale;
	}
	public String getSyphilisReactiveFemale() {
		return syphilisReactiveFemale;
	}
	public void setSyphilisReactiveFemale(String syphilisReactiveFemale) {
		this.syphilisReactiveFemale = syphilisReactiveFemale;
	}
	public String getSyphilisReactiveTransgender() {
		return syphilisReactiveTransgender;
	}
	public void setSyphilisReactiveTransgender(String syphilisReactiveTransgender) {
		this.syphilisReactiveTransgender = syphilisReactiveTransgender;
	}
	public String getSyphilisReactiveTotal() {
		return syphilisReactiveTotal;
	}
	public void setSyphilisReactiveTotal(String syphilisReactiveTotal) {
		this.syphilisReactiveTotal = syphilisReactiveTotal;
	}
	public String getSyphilisTreatedMale() {
		return syphilisTreatedMale;
	}
	public void setSyphilisTreatedMale(String syphilisTreatedMale) {
		this.syphilisTreatedMale = syphilisTreatedMale;
	}
	public String getSyphilisTreatedFemale() {
		return syphilisTreatedFemale;
	}
	public void setSyphilisTreatedFemale(String syphilisTreatedFemale) {
		this.syphilisTreatedFemale = syphilisTreatedFemale;
	}
	public String getSyphilisTreatedTransgender() {
		return syphilisTreatedTransgender;
	}
	public void setSyphilisTreatedTransgender(String syphilisTreatedTransgender) {
		this.syphilisTreatedTransgender = syphilisTreatedTransgender;
	}
	public String getSyphilisTreatedTotal() {
		return syphilisTreatedTotal;
	}
	public void setSyphilisTreatedTotal(String syphilisTreatedTotal) {
		this.syphilisTreatedTotal = syphilisTreatedTotal;
	}
	public String getTbScreenedMale() {
		return tbScreenedMale;
	}
	public void setTbScreenedMale(String tbScreenedMale) {
		this.tbScreenedMale = tbScreenedMale;
	}
	public String getTbScreenedFemale() {
		return tbScreenedFemale;
	}
	public void setTbScreenedFemale(String tbScreenedFemale) {
		this.tbScreenedFemale = tbScreenedFemale;
	}
	public String getTbScreenedTransgender() {
		return tbScreenedTransgender;
	}
	public void setTbScreenedTransgender(String tbScreenedTransgender) {
		this.tbScreenedTransgender = tbScreenedTransgender;
	}
	public String getTbScreenedTotal() {
		return tbScreenedTotal;
	}
	public void setTbScreenedTotal(String tbScreenedTotal) {
		this.tbScreenedTotal = tbScreenedTotal;
	}
	public String getTbSuspectedMale() {
		return tbSuspectedMale;
	}
	public void setTbSuspectedMale(String tbSuspectedMale) {
		this.tbSuspectedMale = tbSuspectedMale;
	}
	public String getTbSuspectedFemale() {
		return tbSuspectedFemale;
	}
	public void setTbSuspectedFemale(String tbSuspectedFemale) {
		this.tbSuspectedFemale = tbSuspectedFemale;
	}
	public String getTbSuspectedTransgender() {
		return tbSuspectedTransgender;
	}
	public void setTbSuspectedTransgender(String tbSuspectedTransgender) {
		this.tbSuspectedTransgender = tbSuspectedTransgender;
	}
	public String getTbSuspectedTotal() {
		return tbSuspectedTotal;
	}
	public void setTbSuspectedTotal(String tbSuspectedTotal) {
		this.tbSuspectedTotal = tbSuspectedTotal;
	}
	public String getTbTestedMale() {
		return tbTestedMale;
	}
	public void setTbTestedMale(String tbTestedMale) {
		this.tbTestedMale = tbTestedMale;
	}
	public String getTbTestedFemale() {
		return tbTestedFemale;
	}
	public void setTbTestedFemale(String tbTestedFemale) {
		this.tbTestedFemale = tbTestedFemale;
	}
	public String getTbTestedTransgender() {
		return tbTestedTransgender;
	}
	public void setTbTestedTransgender(String tbTestedTransgender) {
		this.tbTestedTransgender = tbTestedTransgender;
	}
	public String getTbTestedTotal() {
		return tbTestedTotal;
	}
	public void setTbTestedTotal(String tbTestedTotal) {
		this.tbTestedTotal = tbTestedTotal;
	}
	public String getTbPositiveMale() {
		return tbPositiveMale;
	}
	public void setTbPositiveMale(String tbPositiveMale) {
		this.tbPositiveMale = tbPositiveMale;
	}
	public String getTbPositiveFemale() {
		return tbPositiveFemale;
	}
	public void setTbPositiveFemale(String tbPositiveFemale) {
		this.tbPositiveFemale = tbPositiveFemale;
	}
	public String getTbPositiveTransgender() {
		return tbPositiveTransgender;
	}
	public void setTbPositiveTransgender(String tbPositiveTransgender) {
		this.tbPositiveTransgender = tbPositiveTransgender;
	}
	public String getTbPositiveTotal() {
		return tbPositiveTotal;
	}
	public void setTbPositiveTotal(String tbPositiveTotal) {
		this.tbPositiveTotal = tbPositiveTotal;
	}
	public String getTbPositivePutOnDotsMale() {
		return tbPositivePutOnDotsMale;
	}
	public void setTbPositivePutOnDotsMale(String tbPositivePutOnDotsMale) {
		this.tbPositivePutOnDotsMale = tbPositivePutOnDotsMale;
	}
	public String getTbPositivePutOnDotsFemale() {
		return tbPositivePutOnDotsFemale;
	}
	public void setTbPositivePutOnDotsFemale(String tbPositivePutOnDotsFemale) {
		this.tbPositivePutOnDotsFemale = tbPositivePutOnDotsFemale;
	}
	public String getTbPositivePutOnDotsTransgender() {
		return tbPositivePutOnDotsTransgender;
	}
	public void setTbPositivePutOnDotsTransgender(String tbPositivePutOnDotsTransgender) {
		this.tbPositivePutOnDotsTransgender = tbPositivePutOnDotsTransgender;
	}
	public String getTbPositivePutOnDotsTotal() {
		return tbPositivePutOnDotsTotal;
	}
	public void setTbPositivePutOnDotsTotal(String tbPositivePutOnDotsTotal) {
		this.tbPositivePutOnDotsTotal = tbPositivePutOnDotsTotal;
	}
	public String getScreenedForHepBMale() {
		return screenedForHepBMale;
	}
	public void setScreenedForHepBMale(String screenedForHepBMale) {
		this.screenedForHepBMale = screenedForHepBMale;
	}
	public String getScreenedForHepBFemale() {
		return screenedForHepBFemale;
	}
	public void setScreenedForHepBFemale(String screenedForHepBFemale) {
		this.screenedForHepBFemale = screenedForHepBFemale;
	}
	public String getScreenedForHepBTransgender() {
		return screenedForHepBTransgender;
	}
	public void setScreenedForHepBTransgender(String screenedForHepBTransgender) {
		this.screenedForHepBTransgender = screenedForHepBTransgender;
	}
	public String getScreenedForHepBTotal() {
		return screenedForHepBTotal;
	}
	public void setScreenedForHepBTotal(String screenedForHepBTotal) {
		this.screenedForHepBTotal = screenedForHepBTotal;
	}
	public String getHepBReactiveMale() {
		return hepBReactiveMale;
	}
	public void setHepBReactiveMale(String hepBReactiveMale) {
		this.hepBReactiveMale = hepBReactiveMale;
	}
	public String getHepBReactiveFemale() {
		return hepBReactiveFemale;
	}
	public void setHepBReactiveFemale(String hepBReactiveFemale) {
		this.hepBReactiveFemale = hepBReactiveFemale;
	}
	public String getHepBReactiveTransgender() {
		return hepBReactiveTransgender;
	}
	public void setHepBReactiveTransgender(String hepBReactiveTransgender) {
		this.hepBReactiveTransgender = hepBReactiveTransgender;
	}
	public String getHepBReactiveTotal() {
		return hepBReactiveTotal;
	}
	public void setHepBReactiveTotal(String hepBReactiveTotal) {
		this.hepBReactiveTotal = hepBReactiveTotal;
	}
	public String getHepBReactiveLinkedForTreatmentMale() {
		return hepBReactiveLinkedForTreatmentMale;
	}
	public void setHepBReactiveLinkedForTreatmentMale(String hepBReactiveLinkedForTreatmentMale) {
		this.hepBReactiveLinkedForTreatmentMale = hepBReactiveLinkedForTreatmentMale;
	}
	public String getHepBReactiveLinkedForTreatmentFemale() {
		return hepBReactiveLinkedForTreatmentFemale;
	}
	public void setHepBReactiveLinkedForTreatmentFemale(String hepBReactiveLinkedForTreatmentFemale) {
		this.hepBReactiveLinkedForTreatmentFemale = hepBReactiveLinkedForTreatmentFemale;
	}
	public String getHepBReactiveLinkedForTreatmentTransgender() {
		return hepBReactiveLinkedForTreatmentTransgender;
	}
	public void setHepBReactiveLinkedForTreatmentTransgender(String hepBReactiveLinkedForTreatmentTransgender) {
		this.hepBReactiveLinkedForTreatmentTransgender = hepBReactiveLinkedForTreatmentTransgender;
	}
	public String getHepBReactiveLinkedForTreatmentTotal() {
		return hepBReactiveLinkedForTreatmentTotal;
	}
	public void setHepBReactiveLinkedForTreatmentTotal(String hepBReactiveLinkedForTreatmentTotal) {
		this.hepBReactiveLinkedForTreatmentTotal = hepBReactiveLinkedForTreatmentTotal;
	}
	public String getScreenedForHepCMale() {
		return screenedForHepCMale;
	}
	public void setScreenedForHepCMale(String screenedForHepCMale) {
		this.screenedForHepCMale = screenedForHepCMale;
	}
	public String getScreenedForHepCFemale() {
		return screenedForHepCFemale;
	}
	public void setScreenedForHepCFemale(String screenedForHepCFemale) {
		this.screenedForHepCFemale = screenedForHepCFemale;
	}
	public String getScreenedForHepCTransgender() {
		return screenedForHepCTransgender;
	}
	public void setScreenedForHepCTransgender(String screenedForHepCTransgender) {
		this.screenedForHepCTransgender = screenedForHepCTransgender;
	}
	public String getScreenedForHepCTotal() {
		return screenedForHepCTotal;
	}
	public void setScreenedForHepCTotal(String screenedForHepCTotal) {
		this.screenedForHepCTotal = screenedForHepCTotal;
	}
	public String getHepCReactiveMale() {
		return hepCReactiveMale;
	}
	public void setHepCReactiveMale(String hepCReactiveMale) {
		this.hepCReactiveMale = hepCReactiveMale;
	}
	public String getHepCReactiveFemale() {
		return hepCReactiveFemale;
	}
	public void setHepCReactiveFemale(String hepCReactiveFemale) {
		this.hepCReactiveFemale = hepCReactiveFemale;
	}
	public String getHepCReactiveTransgender() {
		return hepCReactiveTransgender;
	}
	public void setHepCReactiveTransgender(String hepCReactiveTransgender) {
		this.hepCReactiveTransgender = hepCReactiveTransgender;
	}
	public String getHepCReactiveTotal() {
		return hepCReactiveTotal;
	}
	public void setHepCReactiveTotal(String hepCReactiveTotal) {
		this.hepCReactiveTotal = hepCReactiveTotal;
	}
	public String getHepCReactiveLinkedForTreatmentMale() {
		return hepCReactiveLinkedForTreatmentMale;
	}
	public void setHepCReactiveLinkedForTreatmentMale(String hepCReactiveLinkedForTreatmentMale) {
		this.hepCReactiveLinkedForTreatmentMale = hepCReactiveLinkedForTreatmentMale;
	}
	public String getHepCReactiveLinkedForTreatmentFemale() {
		return hepCReactiveLinkedForTreatmentFemale;
	}
	public void setHepCReactiveLinkedForTreatmentFemale(String hepCReactiveLinkedForTreatmentFemale) {
		this.hepCReactiveLinkedForTreatmentFemale = hepCReactiveLinkedForTreatmentFemale;
	}
	public String getHepCReactiveLinkedForTreatmentTransgender() {
		return hepCReactiveLinkedForTreatmentTransgender;
	}
	public void setHepCReactiveLinkedForTreatmentTransgender(String hepCReactiveLinkedForTreatmentTransgender) {
		this.hepCReactiveLinkedForTreatmentTransgender = hepCReactiveLinkedForTreatmentTransgender;
	}
	public String getHepCReactiveLinkedForTreatmentTotal() {
		return hepCReactiveLinkedForTreatmentTotal;
	}
	public void setHepCReactiveLinkedForTreatmentTotal(String hepCReactiveLinkedForTreatmentTotal) {
		this.hepCReactiveLinkedForTreatmentTotal = hepCReactiveLinkedForTreatmentTotal;
	}
//	@JsonCreator
//	public ServiceUptake(String generalHealthCheckupMale, String generalHealthCheckupFemale,
//			String generalHealthCheckupTransgender, String generalHealthCheckupTotal, String antenatalCheckupMale,
//			String antenatalCheckupFemale, String antenatalCheckupTransgender, String antenatalCheckupTotal,
//			String stiCheckupMale, String stiCheckupFemale, String stiCheckupTransgender, String stiCheckupTotal,
//			String stiDiagnosedMale, String stiDiagnosedFemale, String stiDiagnosedTransgender,
//			String stiDiagnosedTotal, String stiTreatedMale, String stiTreatedFemale, String stiTreatedTransgender,
//			String stiTreatedTotal, String hivScreenedMale, String hivScreenedFemale, String hivScreenedTransgender,
//			String hivScreenedTotal, String hivReactiveMale, String hivReactiveFemale, String hivReactiveTransgender,
//			String hivReactiveTotal, String hivConfirmedPositiveMale, String hivConfirmedPositiveFemale,
//			String hivConfirmedPositiveTransgender, String hivConfirmedPositiveTotal, String hivPositiveLinkedToArtMale,
//			String hivPositiveLinkedToArtFemale, String hivPositiveLinkedToArtTransgender,
//			String hivPositiveLinkedToArtTotal, String syphilisScreenedMale, String syphilisScreenedFemale,
//			String syphilisScreenedTransgender, String syphilisScreenedTotal, String syphilisReactiveMale,
//			String syphilisReactiveFemale, String syphilisReactiveTransgender, String syphilisReactiveTotal,
//			String syphilisTreatedMale, String syphilisTreatedFemale, String syphilisTreatedTransgender,
//			String syphilisTreatedTotal, String tbScreenedMale, String tbScreenedFemale, String tbScreenedTransgender,
//			String tbScreenedTotal, String tbSuspectedMale, String tbSuspectedFemale, String tbSuspectedTransgender,
//			String tbSuspectedTotal, String tbTestedMale, String tbTestedFemale, String tbTestedTransgender,
//			String tbTestedTotal, String tbPositiveMale, String tbPositiveFemale, String tbPositiveTransgender,
//			String tbPositiveTotal, String tbPositivePutOnDotsMale, String tbPositivePutOnDotsFemale,
//			String tbPositivePutOnDotsTransgender, String tbPositivePutOnDotsTotal, String screenedForHepBMale,
//			String screenedForHepBFemale, String screenedForHepBTransgender, String screenedForHepBTotal,
//			String hepBReactiveMale, String hepBReactiveFemale, String hepBReactiveTransgender,
//			String hepBReactiveTotal, String hepBReactiveLinkedForTreatmentMale,
//			String hepBReactiveLinkedForTreatmentFemale, String hepBReactiveLinkedForTreatmentTransgender,
//			String hepBReactiveLinkedForTreatmentTotal, String screenedForHepCMale, String screenedForHepCFemale,
//			String screenedForHepCTransgender, String screenedForHepCTotal, String hepCReactiveMale,
//			String hepCReactiveFemale, String hepCReactiveTransgender, String hepCReactiveTotal,
//			String hepCReactiveLinkedForTreatmentMale, String hepCReactiveLinkedForTreatmentFemale,
//			String hepCReactiveLinkedForTreatmentTransgender, String hepCReactiveLinkedForTreatmentTotal) 
	@JsonCreator
	public ServiceUptake(@JsonProperty("generalHealthCheckupMale") String generalHealthCheckupMale,
	                     @JsonProperty("generalHealthCheckupFemale") String generalHealthCheckupFemale,
	                     @JsonProperty("generalHealthCheckupTransgender") String generalHealthCheckupTransgender,
	                     @JsonProperty("generalHealthCheckupTotal") String generalHealthCheckupTotal,
	                     @JsonProperty("antenatalCheckupMale") String antenatalCheckupMale,
	                     @JsonProperty("antenatalCheckupFemale") String antenatalCheckupFemale,
	                     @JsonProperty("antenatalCheckupTransgender") String antenatalCheckupTransgender,
	                     @JsonProperty("antenatalCheckupTotal") String antenatalCheckupTotal,
	                     @JsonProperty("stiCheckupMale") String stiCheckupMale,
	                     @JsonProperty("stiCheckupFemale") String stiCheckupFemale,
	                     @JsonProperty("stiCheckupTransgender") String stiCheckupTransgender,
	                     @JsonProperty("stiCheckupTotal") String stiCheckupTotal,
	                     @JsonProperty("stiDiagnosedMale") String stiDiagnosedMale,
	                     @JsonProperty("stiDiagnosedFemale") String stiDiagnosedFemale,
	                     @JsonProperty("stiDiagnosedTransgender") String stiDiagnosedTransgender,
	                     @JsonProperty("stiDiagnosedTotal") String stiDiagnosedTotal,
	                     @JsonProperty("stiTreatedMale") String stiTreatedMale,
	                     @JsonProperty("stiTreatedFemale") String stiTreatedFemale,
	                     @JsonProperty("stiTreatedTransgender") String stiTreatedTransgender,
	                     @JsonProperty("stiTreatedTotal") String stiTreatedTotal,
	                     @JsonProperty("hivScreenedMale") String hivScreenedMale,
	                     @JsonProperty("hivScreenedFemale") String hivScreenedFemale,
	                     @JsonProperty("hivScreenedTransgender") String hivScreenedTransgender,
	                     @JsonProperty("hivScreenedTotal") String hivScreenedTotal,
	                     @JsonProperty("hivReactiveMale") String hivReactiveMale,
	                     @JsonProperty("hivReactiveFemale") String hivReactiveFemale,
	                     @JsonProperty("hivReactiveTransgender") String hivReactiveTransgender,
	                     @JsonProperty("hivReactiveTotal") String hivReactiveTotal,
	                     @JsonProperty("hivConfirmedPositiveMale") String hivConfirmedPositiveMale,
	                     @JsonProperty("hivConfirmedPositiveFemale") String hivConfirmedPositiveFemale,
	                     @JsonProperty("hivConfirmedPositiveTransgender") String hivConfirmedPositiveTransgender,
	                     @JsonProperty("hivConfirmedPositiveTotal") String hivConfirmedPositiveTotal,
	                     @JsonProperty("hivPositiveLinkedToArtMale") String hivPositiveLinkedToArtMale,
	                     @JsonProperty("hivPositiveLinkedToArtFemale") String hivPositiveLinkedToArtFemale,
	                     @JsonProperty("hivPositiveLinkedToArtTransgender") String hivPositiveLinkedToArtTransgender,
	                     @JsonProperty("hivPositiveLinkedToArtTotal") String hivPositiveLinkedToArtTotal,
	                     @JsonProperty("syphilisScreenedMale") String syphilisScreenedMale,
	                     @JsonProperty("syphilisScreenedFemale") String syphilisScreenedFemale,
	                     @JsonProperty("syphilisScreenedTransgender") String syphilisScreenedTransgender,
	                     @JsonProperty("syphilisScreenedTotal") String syphilisScreenedTotal,
	                     @JsonProperty("syphilisReactiveMale") String syphilisReactiveMale,
	                     @JsonProperty("syphilisReactiveFemale") 
	                     String syphilisReactiveFemale,

	                     @JsonProperty("syphilisReactiveTransgender") 
	                     String syphilisReactiveTransgender,

	                     @JsonProperty("syphilisReactiveTotal") 
	                     String syphilisReactiveTotal,

	                     @JsonProperty("syphilisTreatedMale") 
	                     String syphilisTreatedMale,

	                     @JsonProperty("syphilisTreatedFemale") 
	                     String syphilisTreatedFemale,

	                     @JsonProperty("syphilisTreatedTransgender") 
	                     String syphilisTreatedTransgender,

	                     @JsonProperty("syphilisTreatedTotal") 
	                     String syphilisTreatedTotal,

	                     @JsonProperty("tbScreenedMale") 
	                     String tbScreenedMale,

	                     @JsonProperty("tbScreenedFemale") 
	                     String tbScreenedFemale,

	                     @JsonProperty("tbScreenedTransgender") 
	                     String tbScreenedTransgender,

	                     @JsonProperty("tbScreenedTotal") 
	                     String tbScreenedTotal,

	                     @JsonProperty("tbSuspectedMale") 
	                     String tbSuspectedMale,

	                     @JsonProperty("tbSuspectedFemale") 
	                     String tbSuspectedFemale,

	                     @JsonProperty("tbSuspectedTransgender") 
	                     String tbSuspectedTransgender,

	                     @JsonProperty("tbSuspectedTotal") 
	                     String tbSuspectedTotal,

	                     @JsonProperty("tbTestedMale") 
	                     String tbTestedMale,

	                     @JsonProperty("tbTestedFemale") 
	                     String tbTestedFemale,

	                     @JsonProperty("tbTestedTransgender") 
	                     String tbTestedTransgender,

	                     @JsonProperty("tbTestedTotal") 
	                     String tbTestedTotal,

	                     @JsonProperty("tbPositiveMale") 
	                     String tbPositiveMale,

	                     @JsonProperty("tbPositiveFemale") 
	                     String tbPositiveFemale,

	                     @JsonProperty("tbPositiveTransgender") 
	                     String tbPositiveTransgender,

	                     @JsonProperty("tbPositiveTotal") 
	                     String tbPositiveTotal,

	                     @JsonProperty("tbPositivePutOnDotsMale") 
	                     String tbPositivePutOnDotsMale,

	                     @JsonProperty("tbPositivePutOnDotsFemale") 
	                     String tbPositivePutOnDotsFemale,

	                     @JsonProperty("tbPositivePutOnDotsTransgender") 
	                     String tbPositivePutOnDotsTransgender,

	                     @JsonProperty("tbPositivePutOnDotsTotal") 
	                     String tbPositivePutOnDotsTotal,

	                     @JsonProperty("screenedForHepBMale") 
	                     String screenedForHepBMale,

	                     @JsonProperty("screenedForHepBFemale") 
	                     String screenedForHepBFemale,

	                     @JsonProperty("screenedForHepBTransgender") 
	                     String screenedForHepBTransgender,

	                     @JsonProperty("screenedForHepBTotal") 
	                     String screenedForHepBTotal,

	                     @JsonProperty("hepBReactiveMale") 
	                     String hepBReactiveMale,

	                     @JsonProperty("hepBReactiveFemale") 
	                     String hepBReactiveFemale,

	                     @JsonProperty("hepBReactiveTransgender") 
	                     String hepBReactiveTransgender,

	                     @JsonProperty("hepBReactiveTotal") 
	                     String hepBReactiveTotal,

	                     @JsonProperty("hepBReactiveLinkedForTreatmentMale") 
	                     String hepBReactiveLinkedForTreatmentMale,

	                     @JsonProperty("hepBReactiveLinkedForTreatmentFemale") 
	                     String hepBReactiveLinkedForTreatmentFemale,

	                     @JsonProperty("hepBReactiveLinkedForTreatmentTransgender") 
	                     String hepBReactiveLinkedForTreatmentTransgender,

	                     @JsonProperty("hepBReactiveLinkedForTreatmentTotal") 
	                     String hepBReactiveLinkedForTreatmentTotal,

	                     @JsonProperty("screenedForHepCMale") 
	                     String screenedForHepCMale,

	                     @JsonProperty("screenedForHepCFemale") 
	                     String screenedForHepCFemale,

	                     @JsonProperty("screenedForHepCTransgender") 
	                     String screenedForHepCTransgender,

	                     @JsonProperty("screenedForHepCTotal") 
							String screenedForHepCTotal,
							@JsonProperty("hepCReactiveMale") 
							String hepCReactiveMale,
							@JsonProperty("hepCReactiveFemale") 
							String hepCReactiveFemale,
							@JsonProperty("hepCReactiveTransgender") 
							String hepCReactiveTransgender,
							@JsonProperty("hepCReactiveTotal") 
							String hepCReactiveTotal,
							@JsonProperty("hepCReactiveLinkedForTreatmentMale") 
							String hepCReactiveLinkedForTreatmentMale,
							@JsonProperty("hepCReactiveLinkedForTreatmentFemale") 
							String hepCReactiveLinkedForTreatmentFemale,
							@JsonProperty("hepCReactiveLinkedForTreatmentTransgender") 
							String hepCReactiveLinkedForTreatmentTransgender,
							@JsonProperty("hepCReactiveLinkedForTreatmentTotal") 
							String hepCReactiveLinkedForTreatmentTotal){
		super();
		this.generalHealthCheckupMale = generalHealthCheckupMale;
		this.generalHealthCheckupFemale = generalHealthCheckupFemale;
		this.generalHealthCheckupTransgender = generalHealthCheckupTransgender;
		this.generalHealthCheckupTotal = generalHealthCheckupTotal;
		//this.antenatalCheckupMale = antenatalCheckupMale;
		this.antenatalCheckupFemale = antenatalCheckupFemale;
		//this.antenatalCheckupTransgender = antenatalCheckupTransgender;
		this.antenatalCheckupTotal = antenatalCheckupTotal;
		this.stiCheckupMale = stiCheckupMale;
		this.stiCheckupFemale = stiCheckupFemale;
		this.stiCheckupTransgender = stiCheckupTransgender;
		this.stiCheckupTotal = stiCheckupTotal;
		this.stiDiagnosedMale = stiDiagnosedMale;
		this.stiDiagnosedFemale = stiDiagnosedFemale;
		this.stiDiagnosedTransgender = stiDiagnosedTransgender;
		this.stiDiagnosedTotal = stiDiagnosedTotal;
		this.stiTreatedMale = stiTreatedMale;
		this.stiTreatedFemale = stiTreatedFemale;
		this.stiTreatedTransgender = stiTreatedTransgender;
		this.stiTreatedTotal = stiTreatedTotal;
		this.hivScreenedMale = hivScreenedMale;
		this.hivScreenedFemale = hivScreenedFemale;
		this.hivScreenedTransgender = hivScreenedTransgender;
		this.hivScreenedTotal = hivScreenedTotal;
		this.hivReactiveMale = hivReactiveMale;
		this.hivReactiveFemale = hivReactiveFemale;
		this.hivReactiveTransgender = hivReactiveTransgender;
		this.hivReactiveTotal = hivReactiveTotal;
		this.hivConfirmedPositiveMale = hivConfirmedPositiveMale;
		this.hivConfirmedPositiveFemale = hivConfirmedPositiveFemale;
		this.hivConfirmedPositiveTransgender = hivConfirmedPositiveTransgender;
		this.hivConfirmedPositiveTotal = hivConfirmedPositiveTotal;
		this.hivPositiveLinkedToArtMale = hivPositiveLinkedToArtMale;
		this.hivPositiveLinkedToArtFemale = hivPositiveLinkedToArtFemale;
		this.hivPositiveLinkedToArtTransgender = hivPositiveLinkedToArtTransgender;
		this.hivPositiveLinkedToArtTotal = hivPositiveLinkedToArtTotal;
		this.syphilisScreenedMale = syphilisScreenedMale;
		this.syphilisScreenedFemale = syphilisScreenedFemale;
		this.syphilisScreenedTransgender = syphilisScreenedTransgender;
		this.syphilisScreenedTotal = syphilisScreenedTotal;
		this.syphilisReactiveMale = syphilisReactiveMale;
		this.syphilisReactiveFemale = syphilisReactiveFemale;
		this.syphilisReactiveTransgender = syphilisReactiveTransgender;
		this.syphilisReactiveTotal = syphilisReactiveTotal;
		this.syphilisTreatedMale = syphilisTreatedMale;
		this.syphilisTreatedFemale = syphilisTreatedFemale;
		this.syphilisTreatedTransgender = syphilisTreatedTransgender;
		this.syphilisTreatedTotal = syphilisTreatedTotal;
		this.tbScreenedMale = tbScreenedMale;
		this.tbScreenedFemale = tbScreenedFemale;
		this.tbScreenedTransgender = tbScreenedTransgender;
		this.tbScreenedTotal = tbScreenedTotal;
		this.tbSuspectedMale = tbSuspectedMale;
		this.tbSuspectedFemale = tbSuspectedFemale;
		this.tbSuspectedTransgender = tbSuspectedTransgender;
		this.tbSuspectedTotal = tbSuspectedTotal;
		this.tbTestedMale = tbTestedMale;
		this.tbTestedFemale = tbTestedFemale;
		this.tbTestedTransgender = tbTestedTransgender;
		this.tbTestedTotal = tbTestedTotal;
		this.tbPositiveMale = tbPositiveMale;
		this.tbPositiveFemale = tbPositiveFemale;
		this.tbPositiveTransgender = tbPositiveTransgender;
		this.tbPositiveTotal = tbPositiveTotal;
		this.tbPositivePutOnDotsMale = tbPositivePutOnDotsMale;
		this.tbPositivePutOnDotsFemale = tbPositivePutOnDotsFemale;
		this.tbPositivePutOnDotsTransgender = tbPositivePutOnDotsTransgender;
		this.tbPositivePutOnDotsTotal = tbPositivePutOnDotsTotal;
		this.screenedForHepBMale = screenedForHepBMale;
		this.screenedForHepBFemale = screenedForHepBFemale;
		this.screenedForHepBTransgender = screenedForHepBTransgender;
		this.screenedForHepBTotal = screenedForHepBTotal;
		this.hepBReactiveMale = hepBReactiveMale;
		this.hepBReactiveFemale = hepBReactiveFemale;
		this.hepBReactiveTransgender = hepBReactiveTransgender;
		this.hepBReactiveTotal = hepBReactiveTotal;
		this.hepBReactiveLinkedForTreatmentMale = hepBReactiveLinkedForTreatmentMale;
		this.hepBReactiveLinkedForTreatmentFemale = hepBReactiveLinkedForTreatmentFemale;
		this.hepBReactiveLinkedForTreatmentTransgender = hepBReactiveLinkedForTreatmentTransgender;
		this.hepBReactiveLinkedForTreatmentTotal = hepBReactiveLinkedForTreatmentTotal;
		this.screenedForHepCMale = screenedForHepCMale;
		this.screenedForHepCFemale = screenedForHepCFemale;
		this.screenedForHepCTransgender = screenedForHepCTransgender;
		this.screenedForHepCTotal = screenedForHepCTotal;
		this.hepCReactiveMale = hepCReactiveMale;
		this.hepCReactiveFemale = hepCReactiveFemale;
		this.hepCReactiveTransgender = hepCReactiveTransgender;
		this.hepCReactiveTotal = hepCReactiveTotal;
		this.hepCReactiveLinkedForTreatmentMale = hepCReactiveLinkedForTreatmentMale;
		this.hepCReactiveLinkedForTreatmentFemale = hepCReactiveLinkedForTreatmentFemale;
		this.hepCReactiveLinkedForTreatmentTransgender = hepCReactiveLinkedForTreatmentTransgender;
		this.hepCReactiveLinkedForTreatmentTotal = hepCReactiveLinkedForTreatmentTotal;
	}   
}
