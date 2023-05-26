package gov.naco.soch.npho.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewHealthCamp {

		private CampData campData;
	    private NewServiceUptake serviceUptake;
	    private NewSTISyndromeDTO stiSyndrome ;
	  
	    
	    
	    public NewServiceUptake getNewserviceUptake() {
			return serviceUptake;
		}
	    
		public void setNewserviceUptake(NewServiceUptake serviceUptake) {
			this.serviceUptake = serviceUptake;
		}
		
		public NewSTISyndromeDTO getNewstiSyndrome() {
			return stiSyndrome;
		}
		
		
		public void setNewstiSyndrome(NewSTISyndromeDTO stiSyndrome) {
			this.stiSyndrome = stiSyndrome;
		}
		
		public CampData getCampData() {
			return campData;
		}
		public void setCampData(CampData campData) {
			this.campData = campData;
		}


		@JsonCreator
		public NewHealthCamp(
				@JsonProperty("campData") CampData campData,
				@JsonProperty("serviceUptake") NewServiceUptake serviceUptake,
		        @JsonProperty("stiSyndrome") NewSTISyndromeDTO stiSyndrome) 
		{
			this.stiSyndrome = stiSyndrome;
			this.campData = campData;
		    this.serviceUptake = serviceUptake;
//		    this.newstiSyndrome = newstiSyndrome;
		}
		
}
