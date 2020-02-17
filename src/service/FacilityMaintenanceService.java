package service;

import facilitymgmt.FacilityMaintenance;

import java.util.List;

public interface FacilityMaintenanceService {
    void scheduleMaint(FacilityMaintenance maint);
    List<FacilityMaintenance> listMaintenance();
}
