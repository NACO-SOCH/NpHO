package gov.naco.soch.npho;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CampDataRepository extends JpaRepository {
    // Custom query methods can be defined here if needed
	
	@Query(nativeQuery = true,value="INSERT INTO campData (stateName, districtName, pocType, campsiteName, districtNodalOfficerName, contactNumber, campDate, reportDate)\r\n"
			+ "VALUES (:stateName, :districtName, :pocType, :campsiteName, :districtNodalOfficerName, :contactNumber, :campDate, :reportDate)" )
	void saveCampData(@Param("stateName") String stateName, @Param("districtName") String districtName,
            @Param("pocType") String pocType, @Param("campsiteName") String campsiteName,
            @Param("contactNumber") String contactNumber, @Param("campDate") Date campDate,
            @Param("reportDate") Date reportDate);
}