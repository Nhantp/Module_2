package Case_Study.Service;

public interface IFacilityService extends IService{
    void addHouse();
    void addRoom();
    void addVilla();
    @Override
    void display();
    void displayMaintenance();
}
