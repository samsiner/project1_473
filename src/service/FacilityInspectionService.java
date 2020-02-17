package service;

import facilitymgmt.FacilityInspection;

import java.util.List;

public interface FacilityInspectionService {
    List<FacilityInspection> listInspection(long id);
    void addInspection(FacilityInspection inspection);
}
