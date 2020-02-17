package service;

import facility.Facility;

import java.util.List;

public interface FacilityInventoryService {
    List<Facility> listFacilities();
    void addNewFacility(Facility facility);
    boolean removeFacility(Long id);
}
