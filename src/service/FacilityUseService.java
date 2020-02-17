package service;

import facility.Facility;
import facilitymgmt.FacilityUse;
import util.Schedule;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface FacilityUseService {
    boolean isInUseDuringInterval(long id, Date start, Date end);
    FacilityUse assignFacilityToUse(long id, Schedule s);
    boolean vacateFacility(long id);
    List<FacilityUse> listActualUsage();
    BigDecimal calcUsageRate(FacilityUse use);
}
