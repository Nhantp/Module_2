package Case_Study.Service;

public interface ICustomerService extends IService{
    @Override
    void add();

    @Override
    void display();

    void edit(int id);
}

