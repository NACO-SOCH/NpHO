package gov.naco.soch.npho.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FinanceDataDto {
    private String state;
    private Integer stateCode;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private Float Budget_Allocation;
    private Float GIA_released_to_CNAs;
    private String Percentage_Expenditure;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Integer getStateCode() {
        return stateCode;
    }
    public void setStateCode(Integer stateCode) {
        this.stateCode = stateCode;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Float getBudget_Allocation() {
        return Budget_Allocation;
    }
    public void setBudget_Allocation(Float budget_Allocation) {
        Budget_Allocation = budget_Allocation;
    }
    public Float getGIA_released_to_CNAs() {
        return GIA_released_to_CNAs;
    }
    public void setGIA_released_to_CNAs(Float gIA_released_to_CNAs) {
        GIA_released_to_CNAs = gIA_released_to_CNAs;
    }
    public String getPercentage_Expenditure() {
        return Percentage_Expenditure;
    }
    public void setPercentage_Expenditure(String percentage_Expenditure) {
        Percentage_Expenditure = percentage_Expenditure;
    }
    
    
}