package gov.naco.soch.npho.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CHDintData {
      private String state;
      private LocalDate date;
      private int testing;
      private int plhiv;
      private int viralLoad;
      private int stateCode;
      
      
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
    public int getTesting() {
        return testing;
    }
    public void setTesting(int testing) {
        this.testing = testing;
    }
    public int getPlhiv() {
        return plhiv;
    }
    public void setPlhiv(int plhiv) {
        this.plhiv = plhiv;
    }
    public int getViralLoad() {
        return viralLoad;
    }
    public void setViralLoad(int viralLoad) {
        this.viralLoad = viralLoad;
    }
    public int getStateCode() {
        return stateCode;
    }
    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }
      
    
}