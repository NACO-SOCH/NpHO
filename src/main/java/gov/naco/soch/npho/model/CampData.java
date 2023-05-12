package gov.naco.soch.npho.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CampData {
	private String stateName;
    private String districtName;
    private String pocType;
    private String campsiteName;
    private String districtNodalOfficerName;
    private String contactNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date campDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date reportDate;
	
    
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
	public String getDistrictNodalOfficerName() {
		return districtNodalOfficerName;
	}
	public void setDistrictNodalOfficerName(String districtNodalOfficerName) {
		this.districtNodalOfficerName = districtNodalOfficerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
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
	
	
	public CampData(String stateName, String districtName, String pocType, String campsiteName,
		String districtNodalOfficerName, String contactNumber, Date campDate, Date reportDate) {
	super();
	this.stateName = stateName;
	this.districtName = districtName;
	this.pocType = pocType;
	this.campsiteName = campsiteName;
	this.districtNodalOfficerName = districtNodalOfficerName;
	this.contactNumber = contactNumber;
	this.campDate = campDate;
	this.reportDate = reportDate;
	
}
@JsonCreator
public CampData(@JsonProperty("stateName") String stateName,
                  @JsonProperty("districtName") String districtName,
                  @JsonProperty("pocType") String pocType,
                  @JsonProperty("campsiteName") String campsiteName,
                  @JsonProperty("districtNodalOfficerName") String districtNodalOfficerName,
                  @JsonProperty("contactNumber") String contactNumber,
                  @JsonProperty("campDate") Date campDate,
                  @JsonProperty("reportDate") Date reportDate,
                  @JsonProperty("serviceUptake") ServiceUptake serviceUptake,
                  @JsonProperty("stiSyndrome") STISyndrome stiSyndrome) {
    this.stateName = stateName;
    this.districtName = districtName;
    this.pocType = pocType;
    this.campsiteName = campsiteName;
    this.districtNodalOfficerName = districtNodalOfficerName;
    this.contactNumber = contactNumber;
    this.campDate = campDate;
    this.reportDate = reportDate;
    
}

    
    
}
