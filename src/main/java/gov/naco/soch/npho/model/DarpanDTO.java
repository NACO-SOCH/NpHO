package gov.naco.soch.npho.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties("state")
public class DarpanDTO {

	private String testing;
	private String plhiv;
	private String viralLoad;
	private String stateCode;
	private LocalDate date;
	
	private static Integer Instance_Code = 1;
	private static Integer Sec_Code = 17;
	private static Integer Ministry_Code = 20;
	private static Integer Dept_Code = 24;
	private static Integer Project_Code = 100531;
	private static Integer Frequency_Id = 1;
	private static Integer Atmpt = 0;
	
	
	private  String Lvl_Code =  "Lvl1_code";


	private  String KPI_Data = "KPI1_data";
	
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	
	public String getLvl_Code() {
		return Lvl_Code;
	}
	public void setLvl_Code(String lvl_Code) {
		Lvl_Code = lvl_Code;
	}
	public String getKPI_Data() {
		return KPI_Data;
	}
	public void setKPI_Data(String kPI_Data) {
		KPI_Data = kPI_Data;
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
	public Integer getInstance_Code() {
		return Instance_Code;
	}
	public void setInstance_Code(Integer instance_Code) {
		Instance_Code = instance_Code;
	}
	public Integer getSec_Code() {
		return Sec_Code;
	}
	public void setSec_Code(Integer sec_Code) {
		Sec_Code = sec_Code;
	}
	public Integer getMinistry_Code() {
		return Ministry_Code;
	}
	public void setMinistry_Code(Integer ministry_Code) {
		Ministry_Code = ministry_Code;
	}
	public Integer getDept_Code() {
		return Dept_Code;
	}
	public void setDept_Code(Integer dept_Code) {
		Dept_Code = dept_Code;
	}
	public Integer getProject_Code() {
		return Project_Code;
	}
	public void setProject_Code(Integer project_Code) {
		Project_Code = project_Code;
	}
	public Integer getFrequency_Id() {
		return Frequency_Id;
	}
	public void setFrequency_Id(Integer frequency_Id) {
		Frequency_Id = frequency_Id;
	}

	public Integer getAtmpt() {
		return Atmpt;
	}
	public void setAtmpt(Integer atmpt) {
		Atmpt = atmpt;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	


}
