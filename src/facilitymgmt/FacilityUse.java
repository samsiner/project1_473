package facilitymgmt;

import facility.Facility;
import util.Schedule;

public class FacilityUse {

    private Facility facility;
    private Schedule schedule;

    public FacilityUse(Facility facility, Schedule schedule) {
        this.facility = facility;
        this.schedule = schedule;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }





}
