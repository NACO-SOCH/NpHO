package gov.naco.soch.npho.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "camp_data")
public class CampData {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "state_name")
	    private String stateName;

	    @Column(name = "district_name")
	    private String districtName;          

	    @Column(name = "poc_type")
	    private String pocType;

	    @Column(name = "campsite_name")
	    private String campsiteName;

	    @Column(name = "contact_number")
	    private String contactNumber;

	    @Column(name = "camp_date")
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date campDate;

	    @Column(name = "report_date")
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date reportDate;
	    
	    @Column(name = "generated_date")
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date generatedDate;	
	    
	    private String districtNodalOfficerName;
	    
	    private String userId; 
	    
		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getDistrictNodalOfficerName() {
			return districtNodalOfficerName;
		}

		public void setDistrictNodalOfficerName(String districtNodalOfficerName) {
			this.districtNodalOfficerName = districtNodalOfficerName;
		}

		// Constructor
	    public CampData() {
	    }
	    // Getters and setters for all fields

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
	    public Date getGeneratedDate() {
				return generatedDate;
		}

		public void setGeneratedDate(Date generatedDate) {
				this.generatedDate = generatedDate;
		}
	}

//	private String stateName;
//    private String districtName;
//    private String pocType;
//    private String campsiteName;
//    private String districtNodalOfficerName;
//    private String contactNumber;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
//    private Date campDate;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
//    private Date reportDate;
//	
//    
//    public String getStateName() {
//		return stateName;
//	}
//	public void setStateName(String stateName) {
//		this.stateName = stateName;
//	}
//	public String getDistrictName() {
//		return districtName;
//	}
//	public void setDistrictName(String districtName) {
//		this.districtName = districtName;
//	}
//	public String getPocType() {
//		return pocType;
//	}
//	public void setPocType(String pocType) {
//		this.pocType = pocType;
//	}
//	public String getCampsiteName() {
//		return campsiteName;
//	}
//	public void setCampsiteName(String campsiteName) {
//		this.campsiteName = campsiteName;
//	}
//	public String getDistrictNodalOfficerName() {
//		return districtNodalOfficerName;
//	}
//	public void setDistrictNodalOfficerName(String districtNodalOfficerName) {
//		this.districtNodalOfficerName = districtNodalOfficerName;
//	}
//	public String getContactNumber() {
//		return contactNumber;
//	}
//	public void setContactNumber(String contactNumber) {
//		this.contactNumber = contactNumber;
//	}
//	public Date getCampDate() {
//		return campDate;
//	}
//	public void setCampDate(Date campDate) {
//		this.campDate = campDate;
//	}
//	public Date getReportDate() {
//		return reportDate;
//	}
//	public void setReportDate(Date reportDate) {
//		this.reportDate = reportDate;
//	}
//	
//	
//	public CampData(String stateName, String districtName, String pocType, String campsiteName,
//		String districtNodalOfficerName, String contactNumber, Date campDate, Date reportDate) {
//	super();
//	this.stateName = stateName;
//	this.districtName = districtName;
//	this.pocType = pocType;
//	this.campsiteName = campsiteName;
//	this.districtNodalOfficerName = districtNodalOfficerName;
//	this.contactNumber = contactNumber;
//	this.campDate = campDate;
//	this.reportDate = reportDate;
//	
//}
//	
//@JsonCreator
//public CampData(@JsonProperty("stateName") String stateName,
//                  @JsonProperty("districtName") String districtName,
//                  @JsonProperty("pocType") String pocType,
//                  @JsonProperty("campsiteName") String campsiteName,
//                  @JsonProperty("districtNodalOfficerName") String districtNodalOfficerName,
//                  @JsonProperty("contactNumber") String contactNumber,
//                  @JsonProperty("campDate") Date campDate,
//                  @JsonProperty("reportDate") Date reportDate,
//                  @JsonProperty("serviceUptake") ServiceUptake serviceUptake,
//                  @JsonProperty("stiSyndrome") STISyndrome stiSyndrome) {
//    this.stateName = stateName;
//    this.districtName = districtName;
//    this.pocType = pocType;
//    this.campsiteName = campsiteName;
//    this.districtNodalOfficerName = districtNodalOfficerName;
//    this.contactNumber = contactNumber;
//    this.campDate = campDate;
//    this.reportDate = reportDate;
//    
//}

    
    
