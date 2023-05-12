package gov.naco.soch.npho.model;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HealthCamp {
	private CampData campData;
    private ServiceUptake serviceUptake;
    private STISyndrome stiSyndrome;

    public CampData getCampData() {
		return campData;
	}
	public void setCampData(CampData campData) {
		this.campData = campData;
	}
	public ServiceUptake getServiceUptake() {
		return serviceUptake;
	}
	
	public void setServiceUptake(ServiceUptake serviceUptake) {
		this.serviceUptake = serviceUptake;
	}
	public STISyndrome getStiSyndrome() {
		return stiSyndrome;
	}
	public void setStiSyndrome(STISyndrome stiSyndrome) {
		this.stiSyndrome = stiSyndrome;
	}
//	public HealthCamp(CampData campData, ServiceUptake serviceUptake, STISyndrome stiSyndrome) {
//		super();
//		this.campData = campData;
//		this.serviceUptake = serviceUptake;
//		this.stiSyndrome = stiSyndrome;
//	}
	@JsonCreator
	public HealthCamp(
			@JsonProperty("campData") CampData campData,
			@JsonProperty("serviceUptake") ServiceUptake serviceUptake,
	        @JsonProperty("stiSyndrome") STISyndrome stiSyndrome) {
	   
		this.campData = campData;
	    this.serviceUptake = serviceUptake;
	    this.stiSyndrome = stiSyndrome;
	}
	

   
}

