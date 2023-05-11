package gov.naco.soch.npho;

public class TrendsData {
	

	private String stateName;
    private double minEstimation;
    private double avgEstimation;
    private double maxEstimation;
    private String tableName;
    private String year;
    private String stateCode;
    
	public TrendsData(String stateName, double minEstimation, double avgEstimation, double maxEstimation,String tableName, String year, String stateCode) {
		this.stateName = stateName;
		this.minEstimation = minEstimation;
		this.avgEstimation = avgEstimation;
		this.maxEstimation = maxEstimation;
		this.tableName = tableName;
		this.year = year;
		this.stateCode = stateCode;
	}
    
    public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public double getMinEstimation() {
		return minEstimation;
	}
	public void setMinEstimation(double minEstimation) {
		this.minEstimation = minEstimation;
	}
	public double getAvgEstimation() {
		return avgEstimation;
	}
	public void setAvgEstimation(double avgEstimation) {
		this.avgEstimation = avgEstimation;
	}
	public double getMaxEstimation() {
		return maxEstimation;
	}
	public void setMaxEstimation(double maxEstimation) {
		this.maxEstimation = maxEstimation;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}


}
