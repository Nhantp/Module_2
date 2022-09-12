package Case_Study.Service;

public interface ICustomerService extends IService {
    @Override
    default void display() {
        IService.super.display();
    }

    @Override
    default void add() {
        IService.super.add();
    }

    @Override
    default void edit() {
        IService.super.edit();
    }
}
