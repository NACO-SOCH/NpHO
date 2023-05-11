package gov.naco.soch.npho;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;

public class CHDData {
	  private String state;
	  private LocalDate date;
	  private String testing;
	  private String plhiv;
	  private String viralLoad;
	  private String stateCode;
	  
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@JsonFormat(pattern = "yyyy-MM-dd")
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getTesting() {
		return testing;
	}
	public void setTesting(String testing) {
		this.testing = testing;
	}
	public String getPlhiv() {
		return plhiv;
	}
	public void setPlhiv(String plhiv) {
		this.plhiv = plhiv;
	}
	public String getViralLoad() {
		return viralLoad;
	}
	public void setViralLoad(String viralLoad) {
		this.viralLoad = viralLoad;
	}

}
