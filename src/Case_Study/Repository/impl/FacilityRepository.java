package Case_Study.Repository.impl;

import Case_Study.Repository.IFacilityRepository;
import Case_Study.models.Facility;
import Case_Study.util.ReadAndWriteFacility;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    ReadAndWriteFacility readAndWriteFacility=new ReadAndWriteFacility();
    Map<Facility,Integer> linkedHashMap=readAndWriteFacility.readFacility(FILE_NAME);
    @Override
    public void add(Facility facility) {
        linkedHashMap.put(facility,0);
        readAndWriteFacility.writeFacility(linkedHashMap,FILE_NAME);
    }

    @Override
    public void display() {

    }


    @Override
    public void displayMaintenance() {

    }

    @Override
    public Map<Facility, Integer> findAll() {
        return linkedHashMap;
    }
}
