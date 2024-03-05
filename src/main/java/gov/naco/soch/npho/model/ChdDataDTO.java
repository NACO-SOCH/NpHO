package gov.naco.soch.npho.model;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ChdDataDTO {

    private String state;
    private Integer stateCode;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private Integer hivTestingMale;
    private Integer hivTestingFemale;
    private Integer hivTestingTstg;
    private Integer hivTestingTotal;
    private Integer onArtMale;
    private Integer onArtFemale;
    private Integer onArtTstg;
    private Integer onArtTotal;
    private Integer viralLoadTesting;

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
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Integer getHivTestingMale() {
        return hivTestingMale;
    }
    public void setHivTestingMale(Integer hivTestingMale) {
        this.hivTestingMale = hivTestingMale;
    }
    public Integer getHivTestingFemale() {
        return hivTestingFemale;
    }
    public void setHivTestingFemale(Integer hivTestingFemale) {
        this.hivTestingFemale = hivTestingFemale;
    }
    public Integer getHivTestingTstg() {
        return hivTestingTstg;
    }
    public void setHivTestingTstg(Integer hivTestingTstg) {
        this.hivTestingTstg = hivTestingTstg;
    }
    public Integer getHivTestingTotal() {
        return hivTestingTotal;
    }
    public void setHivTestingTotal(Integer hivTestingTotal) {
        this.hivTestingTotal = hivTestingTotal;
    }
    public Integer getOnArtMale() {
        return onArtMale;
    }
    public void setOnArtMale(Integer onArtMale) {
        this.onArtMale = onArtMale;
    }
    public Integer getOnArtFemale() {
        return onArtFemale;
    }
    public void setOnArtFemale(Integer onArtFemale) {
        this.onArtFemale = onArtFemale;
    }
    public Integer getOnArtTstg() {
        return onArtTstg;
    }
    public void setOnArtTstg(Integer onArtTstg) {
        this.onArtTstg = onArtTstg;
    }
    public Integer getOnArtTotal() {
        return onArtTotal;
    }
    public void setOnArtTotal(Integer onArtTotal) {
        this.onArtTotal = onArtTotal;
    }
    public Integer getViralLoadTesting() {
        return viralLoadTesting;
    }
    public void setViralLoadTesting(Integer viralLoadTesting) {
        this.viralLoadTesting = viralLoadTesting;
    }

}