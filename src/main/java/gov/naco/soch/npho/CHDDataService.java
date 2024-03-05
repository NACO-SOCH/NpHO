package gov.naco.soch.npho;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gov.naco.soch.npho.model.ChdDataDTO;
import gov.naco.soch.repository.NphoRepository;
import gov.naco.soch.npho.model.Edarpan;
import gov.naco.soch.npho.model.FinanceDataDto;
import gov.naco.soch.npho.model.NphoDataEstimation;
@Service
public class CHDDataService {
    @Autowired
    private NphoRepository nphoRepository;
    private static final Logger logger = Logger.getLogger(CHDDataService.class.getName());
 
    public List<ChdDataDTO> getnewCHDData(LocalDate date) {
    	logger.info("dddddddd");
    	logger.info("date "+date.toString());
        List<Object[]> dataList = nphoRepository.getnewCHDData(date);
        List<ChdDataDTO> ChdDataList = new ArrayList<>();
        logger.info("dddddddd");
    	logger.info("date 2 "+date.toString());
        for (Object[] data : dataList) {
            ChdDataDTO dto = new ChdDataDTO();
            dto.setState((String) data[0]); 
            dto.setStateCode((Integer) data[1]); 
            //dto.setDate((LocalDate) data[2]); 
            dto.setDate(((java.sql.Date) data[2]).toLocalDate());
            dto.setHivTestingMale((Integer) data[3]); 
            dto.setHivTestingFemale((Integer) data[4]); 
            dto.setHivTestingTstg((Integer) data[5]); 
            dto.setHivTestingTotal((Integer) data[6]); 
            dto.setOnArtMale((Integer) data[7]); 
            dto.setOnArtFemale((Integer) data[8]); 
            dto.setOnArtTstg((Integer) data[9]); 
            dto.setOnArtTotal((Integer) data[10]); 
            dto.setViralLoadTesting((Integer) data[11]); 

            ChdDataList.add(dto);
        }

        return ChdDataList;
    }
    
    public List<Edarpan> getCHDData(LocalDate date) {
        List<Object[]> dataList = nphoRepository.getCHDData(date);
        List<Edarpan> edarpanList = new ArrayList<>();

        for (Object[] data : dataList) {
            Edarpan dto = new Edarpan();
            dto.setState((String) data[0]); 
            dto.setStateCode((Integer) data[1]); 
            //dto.setDate((LocalDate) data[2]); 
            dto.setDate(((java.sql.Date) data[2]).toLocalDate());
            dto.setTesting((Integer) data[3]); 
            dto.setPlhiv((Integer) data[4]); 
            dto.setViralLoad((Integer) data[5]); 

            edarpanList.add(dto);
        }

        return edarpanList;
    }
    
    
    public List<NphoDataEstimation> getNphoData(Integer year) {
        List<Object[]> dataList = nphoRepository.getNphoData(year);
        List<NphoDataEstimation> nphoList = new ArrayList<>();

        for (Object[] data : dataList) {
            NphoDataEstimation dto = new NphoDataEstimation();
            dto.setYear((Integer) data[0]);
            dto.setState((String) data[1]);
            dto.setStateCode((Integer) data[2]);
            dto.setEstimated_PLHIV_Male((Integer) data[3]);
            dto.setEstimated_PLHIV_Female((Integer) data[4]);
            dto.setEstimated_PLHIV_Total((Integer) data[5]);
            dto.setAnnual_New_Infection_Male((Integer) data[6]);
            dto.setAnnual_New_Infection_Female((Integer) data[7]);
            dto.setAnnual_New_Infection_Total((Integer) data[8]);
            dto.setAnnual_Aids_Death_Male((Integer) data[9]);
            dto.setAnnual_Aids_Death_Female((Integer) data[10]);
            dto.setAnnual_Aids_Death_Total((Integer) data[11]);
            nphoList.add(dto);
        }

        return nphoList;
    }
    
    
    public List<FinanceDataDto> getFinanceData(LocalDate date) {
        List<Object[]> dataList = nphoRepository.getFinanceData(date);
        List<FinanceDataDto> financeList = new ArrayList<>();

        for (Object[] data : dataList) {
            FinanceDataDto dto = new FinanceDataDto();
            dto.setState((String) data[0]); 
            dto.setStateCode((Integer) data[1]); 
            dto.setDate((java.sql.Date) data[2]); 
            dto.setBudget_Allocation((Float) data[3]); 
            dto.setGIA_released_to_CNAs((Float) data[4]); 
            dto.setPercentage_Expenditure((String) data[5]); 
            financeList.add(dto);
        }

        return financeList;
    }
    
}