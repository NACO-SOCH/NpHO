package gov.naco.soch.npho.model;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Edarpan {

        private String state;
        private Integer stateCode;
        @JsonFormat(pattern = "yyyy-MM-dd")
        private LocalDate date;
        private Integer testing;
        private Integer plhiv;
        private Integer viralLoad;
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
        public Integer getTesting() {
            return testing;
        }
        public void setTesting(Integer testing) {
            this.testing = testing;
        }
        public Integer getPlhiv() {
            return plhiv;
        }
        public void setPlhiv(Integer plhiv) {
            this.plhiv = plhiv;
        }
        public Integer getViralLoad() {
            return viralLoad;
        }
        public void setViralLoad(Integer viralLoad) {
            this.viralLoad = viralLoad;
        }

        
}