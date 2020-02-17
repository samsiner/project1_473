package service;

import facility.FacilityDetail;

public interface FacilityInformationService {
    FacilityDetail getFacilityInformation(Long id);
    void addFacilityDetail(Long id, FacilityDetail detail);
    int requestAvailableCapacity(Long id);
}
