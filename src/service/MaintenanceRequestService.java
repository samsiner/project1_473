package service;

import facilitymgmt.FacilityMaintenanceRequest;
import util.Problem;

import java.util.List;

public interface MaintenanceRequestService {
    FacilityMaintenanceRequest makeFacilityMaintenanceReq(Problem problem, long id);
    List<FacilityMaintenanceRequest> listMaintReq();
}
