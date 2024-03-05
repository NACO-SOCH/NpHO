package gov.naco.soch.npho;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
public class NPHOData {
    @JsonProperty("Table")
    private String table;

    @JsonProperty("state")
    private String state;

    private LocalDate year;
    
    @JsonProperty("stateCode")
    private String stateCode;

	@JsonProperty("gender")
    private String gender;

    @JsonProperty("estimationMin")
    private int estimationMin;

    @JsonProperty("estimation")
    private int estimation;

    @JsonProperty("estimationMax")
    private int estimationMax;

    public NPHOData() {
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	@JsonFormat(pattern = "yyyy-MM-dd")
    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEstimationMin() {
        return estimationMin;
    }

    public void setEstimationMin(int estimationMin) {
        this.estimationMin = estimationMin;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }

    public int getEstimationMax() {
        return estimationMax;
    }

    public void setEstimationMax(int estimationMax) {
        this.estimationMax = estimationMax;
    }


}




