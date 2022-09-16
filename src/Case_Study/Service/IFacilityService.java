package Case_Study.Service;

public interface IFacilityService extends IService{
    @Override
    default void display() {
        IService.super.display();
    }

    @Override
    default void add() {
        IService.super.add();
    }
     default void displayMaintenance(){
    }
}
