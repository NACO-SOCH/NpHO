
package gov.naco.soch.npho.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class STISyndrome {
    //private String vcdMale;
    private String vcdFemale;
    //private String vcdTGTS;
    private String vcdTotal;
    private String vcdTreated;

    private String gudNonHerpeticMale;
    private String gudNonHerpeticFemale;
    private String gudNonHerpeticTGTS;
    private String gudNonHerpeticTotal;
    private String gudNonHerpeticTreated;

    private String gudHerpeticMale;
    private String gudHerpeticFemale;
    private String gudHerpeticTGTS;
    private String gudHerpeticTotal;
    private String gudHerpeticTreated;

    //private String lapMale;
    private String lapFemale;
    //private String lapTGTS;
    private String lapTotal;
    private String lapTreated;

    private String udMale;
    //private String udFemale;
    private String udTGTS;
    private String udTotal;
    private String udTreated;

    private String ardMale;
    private String ardFemale;
    private String ardTGTS;
    private String ardTotal;
    private String ardTreated;

    private String ibMale;
    private String ibFemale;
    private String ibTGTS;
    private String ibTotal;
    private String ibTreated;

    private String ssMale;
    //private String ssFemale;
    private String ssTGTS;
    private String ssTotal;
    private String ssTreated;

    private String genitalWartsMale;
    private String genitalWartsFemale;
    private String genitalWartsTGTS;
    private String genitalWartsTotal;
    private String genitalWartsTreated;

    private String otherSTIsMale;
    private String otherSTIsFemale;
    private String otherSTIsTGTS;
    private String otherSTIsTotal;
    private String otherSTIsTreated;


	private Integer campDataId;
	
	private Long serviceExt;
//    private String totalMale;
//    private String totalFemale;
//    private String totalTGTS;
//    private String grandTotal;
//    private String totalTreated;
	
    
    
//    public String getVcdMale() {
//		return vcdMale;
//	}
//	public void setVcdMale(String vcdMale) {
//		this.vcdMale = vcdMale;
//	}
	
	

    public Integer getCampDataId() {
		return campDataId;
	}
	public Long getServiceExt() {
		return serviceExt;
	}
	public void setServiceExt(Long serviceExt) {
		this.serviceExt = serviceExt;
	}
	public void setCampDataId(Integer campDataId) {
		this.campDataId = campDataId;
	}
	public String getVcdFemale() {
		return vcdFemale;
	}
	public void setVcdFemale(String vcdFemale) {
		this.vcdFemale = vcdFemale;
	}
//	public String getVcdTGTS() {
//		return vcdTGTS;
//	}
//	public void setVcdTGTS(String vcdTGTS) {
//		this.vcdTGTS = vcdTGTS;
//	}
	public String getVcdTotal() {
		return vcdTotal;
	}
	public void setVcdTotal(String vcdTotal) {
		this.vcdTotal = vcdTotal;
	}
	public String getVcdTreated() {
		return vcdTreated;
	}
	public void setVcdTreated(String vcdTreated) {
		this.vcdTreated = vcdTreated;
	}
	public String getGudNonHerpeticMale() {
		return gudNonHerpeticMale;
	}
	public void setGudNonHerpeticMale(String gudNonHerpeticMale) {
		this.gudNonHerpeticMale = gudNonHerpeticMale;
	}
	public String getGudNonHerpeticFemale() {
		return gudNonHerpeticFemale;
	}
	public void setGudNonHerpeticFemale(String gudNonHerpeticFemale) {
		this.gudNonHerpeticFemale = gudNonHerpeticFemale;
	}
	public String getGudNonHerpeticTGTS() {
		return gudNonHerpeticTGTS;
	}
	public void setGudNonHerpeticTGTS(String gudNonHerpeticTGTS) {
		this.gudNonHerpeticTGTS = gudNonHerpeticTGTS;
	}
	public String getGudNonHerpeticTotal() {
		return gudNonHerpeticTotal;
	}
	public void setGudNonHerpeticTotal(String gudNonHerpeticTotal) {
		this.gudNonHerpeticTotal = gudNonHerpeticTotal;
	}
	public String getGudNonHerpeticTreated() {
		return gudNonHerpeticTreated;
	}
	public void setGudNonHerpeticTreated(String gudNonHerpeticTreated) {
		this.gudNonHerpeticTreated = gudNonHerpeticTreated;
	}
	public String getGudHerpeticMale() {
		return gudHerpeticMale;
	}
	public void setGudHerpeticMale(String gudHerpeticMale) {
		this.gudHerpeticMale = gudHerpeticMale;
	}
	public String getGudHerpeticFemale() {
		return gudHerpeticFemale;
	}
	public void setGudHerpeticFemale(String gudHerpeticFemale) {
		this.gudHerpeticFemale = gudHerpeticFemale;
	}
	public String getGudHerpeticTGTS() {
		return gudHerpeticTGTS;
	}
	public void setGudHerpeticTGTS(String gudHerpeticTGTS) {
		this.gudHerpeticTGTS = gudHerpeticTGTS;
	}
	public String getGudHerpeticTotal() {
		return gudHerpeticTotal;
	}
	public void setGudHerpeticTotal(String gudHerpeticTotal) {
		this.gudHerpeticTotal = gudHerpeticTotal;
	}
	public String getGudHerpeticTreated() {
		return gudHerpeticTreated;
	}
	public void setGudHerpeticTreated(String gudHerpeticTreated) {
		this.gudHerpeticTreated = gudHerpeticTreated;
	}
//	public String getLapMale() {
//		return lapMale;
//	}
//	public void setLapMale(String lapMale) {
//		this.lapMale = lapMale;
//	}
	public String getLapFemale() {
		return lapFemale;
	}
	public void setLapFemale(String lapFemale) {
		this.lapFemale = lapFemale;
	}
//	public String getLapTGTS() {
//		return lapTGTS;
//	}
//	public void setLapTGTS(String lapTGTS) {
//		this.lapTGTS = lapTGTS;
//	}
	public String getLapTotal() {
		return lapTotal;
	}
	public void setLapTotal(String lapTotal) {
		this.lapTotal = lapTotal;
	}
	public String getLapTreated() {
		return lapTreated;
	}
	public void setLapTreated(String lapTreated) {
		this.lapTreated = lapTreated;
	}
	public String getUdMale() {
		return udMale;
	}
	public void setUdMale(String udMale) {
		this.udMale = udMale;
	}
//	public String getUdFemale() {
//		return udFemale;
//	}
//	public void setUdFemale(String udFemale) {
//		this.udFemale = udFemale;
//	}
	public String getUdTGTS() {
		return udTGTS;
	}
	public void setUdTGTS(String udTGTS) {
		this.udTGTS = udTGTS;
	}
	public String getUdTotal() {
		return udTotal;
	}
	public void setUdTotal(String udTotal) {
		this.udTotal = udTotal;
	}
	public String getUdTreated() {
		return udTreated;
	}
	public void setUdTreated(String udTreated) {
		this.udTreated = udTreated;
	}
	public String getArdMale() {
		return ardMale;
	}
	public void setArdMale(String ardMale) {
		this.ardMale = ardMale;
	}
	public String getArdFemale() {
		return ardFemale;
	}
	public void setArdFemale(String ardFemale) {
		this.ardFemale = ardFemale;
	}
	public String getArdTGTS() {
		return ardTGTS;
	}
	public void setArdTGTS(String ardTGTS) {
		this.ardTGTS = ardTGTS;
	}
	public String getArdTotal() {
		return ardTotal;
	}
	public void setArdTotal(String ardTotal) {
		this.ardTotal = ardTotal;
	}
	public String getArdTreated() {
		return ardTreated;
	}
	public void setArdTreated(String ardTreated) {
		this.ardTreated = ardTreated;
	}
	public String getIbMale() {
		return ibMale;
	}
	public void setIbMale(String ibMale) {
		this.ibMale = ibMale;
	}
	public String getIbFemale() {
		return ibFemale;
	}
	public void setIbFemale(String ibFemale) {
		this.ibFemale = ibFemale;
	}
	public String getIbTGTS() {
		return ibTGTS;
	}
	public void setIbTGTS(String ibTGTS) {
		this.ibTGTS = ibTGTS;
	}
	public String getIbTotal() {
		return ibTotal;
	}
	public void setIbTotal(String ibTotal) {
		this.ibTotal = ibTotal;
	}
	public String getIbTreated() {
		return ibTreated;
	}
	public void setIbTreated(String ibTreated) {
		this.ibTreated = ibTreated;
	}
	public String getSsMale() {
		return ssMale;
	}
	public void setSsMale(String ssMale) {
		this.ssMale = ssMale;
	}
//	public String getSsFemale() {
//		return ssFemale;
//	}
//	public void setSsFemale(String ssFemale) {
//		this.ssFemale = ssFemale;
//	}
	public String getSsTGTS() {
		return ssTGTS;
	}
	public void setSsTGTS(String ssTGTS) {
		this.ssTGTS = ssTGTS;
	}
	public String getSsTotal() {
		return ssTotal;
	}
	public void setSsTotal(String ssTotal) {
		this.ssTotal = ssTotal;
	}
	public String getSsTreated() {
		return ssTreated;
	}
	public void setSsTreated(String ssTreated) {
		this.ssTreated = ssTreated;
	}
	public String getGenitalWartsMale() {
		return genitalWartsMale;
	}
	public void setGenitalWartsMale(String genitalWartsMale) {
		this.genitalWartsMale = genitalWartsMale;
	}
	public String getGenitalWartsFemale() {
		return genitalWartsFemale;
	}
	public void setGenitalWartsFemale(String genitalWartsFemale) {
		this.genitalWartsFemale = genitalWartsFemale;
	}
	public String getGenitalWartsTGTS() {
		return genitalWartsTGTS;
	}
	public void setGenitalWartsTGTS(String genitalWartsTGTS) {
		this.genitalWartsTGTS = genitalWartsTGTS;
	}
	public String getGenitalWartsTotal() {
		return genitalWartsTotal;
	}
	public void setGenitalWartsTotal(String genitalWartsTotal) {
		this.genitalWartsTotal = genitalWartsTotal;
	}
	public String getGenitalWartsTreated() {
		return genitalWartsTreated;
	}
	public void setGenitalWartsTreated(String genitalWartsTreated) {
		this.genitalWartsTreated = genitalWartsTreated;
	}
	public String getOtherSTIsMale() {
		return otherSTIsMale;
	}
	public void setOtherSTIsMale(String otherSTIsMale) {
		this.otherSTIsMale = otherSTIsMale;
	}
	public String getOtherSTIsFemale() {
		return otherSTIsFemale;
	}
	public void setOtherSTIsFemale(String otherSTIsFemale) {
		this.otherSTIsFemale = otherSTIsFemale;
	}
	public String getOtherSTIsTGTS() {
		return otherSTIsTGTS;
	}
	public void setOtherSTIsTGTS(String otherSTIsTGTS) {
		this.otherSTIsTGTS = otherSTIsTGTS;
	}
	public String getOtherSTIsTotal() {
		return otherSTIsTotal;
	}
	public void setOtherSTIsTotal(String otherSTIsTotal) {
		this.otherSTIsTotal = otherSTIsTotal;
	}
	public String getOtherSTIsTreated() {
		return otherSTIsTreated;
	}
	public void setOtherSTIsTreated(String otherSTIsTreated) {
		this.otherSTIsTreated = otherSTIsTreated;
	}
//	public String getTotalMale() {
//		return totalMale;
//	}
//	public void setTotalMale(String totalMale) {
//		this.totalMale = totalMale;
//	}
//	public String getTotalFemale() {
//		return totalFemale;
//	}
//	public void setTotalFemale(String totalFemale) {
//		this.totalFemale = totalFemale;
//	}
//	public String getTotalTGTS() {
//		return totalTGTS;
//	}
//	public void setTotalTGTS(String totalTGTS) {
//		this.totalTGTS = totalTGTS;
//	}
//	public String getGrandTotal() {
//		return grandTotal;
//	}
//	public void setGrandTotal(String grandTotal) {
//		this.grandTotal = grandTotal;
//	}
//	public String getTotalTreated() {
//		return totalTreated;
//	}
//	public void setTotalTreated(String totalTreated) {
//		this.totalTreated = totalTreated;
//	}
//	@JsonCreator
//	public STISyndrome(String vcdMale, String vcdFemale, String vcdTGTS, String vcdTotal, String vcdTreated, String gudNonHerpeticMale,
//			String gudNonHerpeticFemale, String gudNonHerpeticTGTS, String gudNonHerpeticTotal, String gudNonHerpeticTreated,
//			String gudHerpeticMale, String gudHerpeticFemale, String gudHerpeticTGTS, String gudHerpeticTotal,
//			String gudHerpeticTreated, String lapMale, String lapFemale, String lapTGTS, String lapTotal, String lapTreated, String udMale,
//			String udFemale, String udTGTS, String udTotal, String udTreated, String ardMale, String ardFemale, String ardTGTS, String ardTotal,
//			String ardTreated, String ibMale, String ibFemale, String ibTGTS, String ibTotal, String ibTreated, String ssMale, String ssFemale,
//			String ssTGTS, String ssTotal, String ssTreated, String genitalWartsMale, String genitalWartsFemale, String genitalWartsTGTS,
//			String genitalWartsTotal, String genitalWartsTreated, String otherSTIsMale, String otherSTIsFemale, String otherSTIsTGTS,
//			String otherSTIsTotal, String otherSTIsTreated, String totalMale, String totalFemale, String totalTGTS, String grandTotal,
//			String totalTreated) 
	@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
	public STISyndrome(
	        //@JsonProperty("vcdMale") String vcdMale,
	        @JsonProperty("vcdFemale") String vcdFemale,
	        //@JsonProperty("vcdTGTS") String vcdTGTS,
	        @JsonProperty("vcdTotal") String vcdTotal,
	        @JsonProperty("vcdTreated") String vcdTreated,
	        @JsonProperty("gudNonHerpeticMale") String gudNonHerpeticMale,
	        @JsonProperty("gudNonHerpeticFemale") String gudNonHerpeticFemale,
	        @JsonProperty("gudNonHerpeticTGTS") String gudNonHerpeticTGTS,
	        @JsonProperty("gudNonHerpeticTotal") String gudNonHerpeticTotal,
	        @JsonProperty("gudNonHerpeticTreated") String gudNonHerpeticTreated,
	        @JsonProperty("gudHerpeticMale") String gudHerpeticMale,
	        @JsonProperty("gudHerpeticFemale") String gudHerpeticFemale,
	        @JsonProperty("gudHerpeticTGTS") String gudHerpeticTGTS,
	        @JsonProperty("gudHerpeticTotal") String gudHerpeticTotal,
	        @JsonProperty("gudHerpeticTreated") String gudHerpeticTreated,
	        //@JsonProperty("lapMale") String lapMale,
	        @JsonProperty("lapFemale") String lapFemale,
	        //@JsonProperty("lapTGTS") String lapTGTS,
	        @JsonProperty("lapTotal") String lapTotal,
	        @JsonProperty("lapTreated") String lapTreated,
	        @JsonProperty("udMale") String udMale,
	        //@JsonProperty("udFemale") String udFemale,
	        @JsonProperty("udTGTS") String udTGTS,
	        @JsonProperty("udTotal") String udTotal,
	        @JsonProperty("udTreated") String udTreated,
	        @JsonProperty("ardMale") String ardMale,
	        @JsonProperty("ardFemale") String ardFemale,
	        @JsonProperty("ardTGTS") String ardTGTS,
	        @JsonProperty("ardTotal") String ardTotal,
	        @JsonProperty("ardTreated") String ardTreated,
	        @JsonProperty("ibMale") String ibMale,
	        @JsonProperty("ibFemale") String ibFemale,
	        @JsonProperty("ibTGTS") String ibTGTS,
	        @JsonProperty("ibTotal") String ibTotal,
	        @JsonProperty("ibTreated") String ibTreated,
	        @JsonProperty("ssMale") String ssMale,
	        //@JsonProperty("ssFemale") String ssFemale,
	        @JsonProperty("ssTGTS") String ssTGTS,
	        @JsonProperty("ssTotal") String ssTotal,
	        @JsonProperty("ssTreated") String ssTreated,
	        @JsonProperty("genitalWartsMale") String genitalWartsMale,
	        @JsonProperty("genitalWartsFemale") String genitalWartsFemale,
	        @JsonProperty("genitalWartsTGTS") String genitalWartsTGTS,
	        @JsonProperty("genitalWartsTotal") String genitalWartsTotal,
	        @JsonProperty("genitalWartsTreated") String genitalWartsTreated,
	        @JsonProperty("otherSTIsMale") String otherSTIsMale,
	        @JsonProperty("otherSTIsFemale") String otherSTIsFemale,
	        @JsonProperty("otherSTIsTGTS") String otherSTIsTGTS,
	        @JsonProperty("otherSTIsTotal") String otherSTIsTotal,
	        @JsonProperty("otherSTIsTreated") String otherSTIsTreated)
	
	        
{
		super();
		//this.vcdMale = vcdMale;
		this.vcdFemale = vcdFemale;
		//this.vcdTGTS = vcdTGTS;
		this.vcdTotal = vcdTotal;
		this.vcdTreated = vcdTreated;
		this.gudNonHerpeticMale = gudNonHerpeticMale;
		this.gudNonHerpeticFemale = gudNonHerpeticFemale;
		this.gudNonHerpeticTGTS = gudNonHerpeticTGTS;
		this.gudNonHerpeticTotal = gudNonHerpeticTotal;
		this.gudNonHerpeticTreated = gudNonHerpeticTreated;
		this.gudHerpeticMale = gudHerpeticMale;
		this.gudHerpeticFemale = gudHerpeticFemale;
		this.gudHerpeticTGTS = gudHerpeticTGTS;
		this.gudHerpeticTotal = gudHerpeticTotal;
		this.gudHerpeticTreated = gudHerpeticTreated;
		//this.lapMale = lapMale;
		this.lapFemale = lapFemale;
		//this.lapTGTS = lapTGTS;
		this.lapTotal = lapTotal;
		this.lapTreated = lapTreated;
		this.udMale = udMale;
		//this.udFemale = udFemale;
		this.udTGTS = udTGTS;
		this.udTotal = udTotal;
		this.udTreated = udTreated;
		this.ardMale = ardMale;
		this.ardFemale = ardFemale;
		this.ardTGTS = ardTGTS;
		this.ardTotal = ardTotal;
		this.ardTreated = ardTreated;
		this.ibMale = ibMale;
		this.ibFemale = ibFemale;
		this.ibTGTS = ibTGTS;
		this.ibTotal = ibTotal;
		this.ibTreated = ibTreated;
		this.ssMale = ssMale;
		//this.ssFemale = ssFemale;
		this.ssTGTS = ssTGTS;
		this.ssTotal = ssTotal;
		this.ssTreated = ssTreated;
		this.genitalWartsMale = genitalWartsMale;
		this.genitalWartsFemale = genitalWartsFemale;
		this.genitalWartsTGTS = genitalWartsTGTS;
		this.genitalWartsTotal = genitalWartsTotal;
		this.genitalWartsTreated = genitalWartsTreated;
		this.otherSTIsMale = otherSTIsMale;
		this.otherSTIsFemale = otherSTIsFemale;
		this.otherSTIsTGTS = otherSTIsTGTS;
		this.otherSTIsTotal = otherSTIsTotal;
		this.otherSTIsTreated = otherSTIsTreated;
//		this.totalMale = totalMale;
//		this.totalFemale = totalFemale;
//		this.totalTGTS = totalTGTS;
//		this.grandTotal = grandTotal;
//		this.totalTreated = totalTreated;
	}
	
}