package gov.naco.soch.npho;

import org.springframework.stereotype.Repository;

import  gov.naco.soch.npho.model.HealthCamp;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HealthCampRepository {

    private List<HealthCamp> healthCamps = new ArrayList<>();

    public List<HealthCamp> findAll() {
        return healthCamps;
    }

    public HealthCamp save(HealthCamp healthCamp) {
        healthCamps.add(healthCamp);
        return healthCamp;
    }
}
