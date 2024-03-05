package gov.naco.soch.npho;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class TRENDSData {
	

	 @JsonProperty("Table")
	    private String table;

	    @JsonProperty("state")
	    private String state;

	    private Integer year;
	    
	    @JsonProperty("stateCode")
	    private String stateCode;

	    @JsonProperty("estimationMin")
	    private int estimationMin;

	    @JsonProperty("estimation")
	    private int estimation;

	    @JsonProperty("estimationMax")
	    private int estimationMax;

	    public TRENDSData() {
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
//		@JsonFormat(pattern = "yyyy-MM-dd")
	    public Integer getYear() {
	        return year;
	    }

	    public void setYear(Integer year) {
	        this.year = year;
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
	    

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof TRENDSData)) return false;
	        TRENDSData myClass = (TRENDSData) o;
	        return estimationMin == myClass.estimationMin &&
	                estimation == myClass.estimation &&
	                estimationMax == myClass.estimationMax &&
	                Objects.equals(table, myClass.table) &&
	                Objects.equals(state, myClass.state) &&
	                Objects.equals(year, myClass.year) &&
	                Objects.equals(stateCode, myClass.stateCode);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(table, state, year, stateCode, estimationMin, estimation, estimationMax);
	    }
	    



}
