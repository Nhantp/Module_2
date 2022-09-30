package Case_Study.Service;

public interface IEmployeeService extends IService{
    @Override
    void add();

    @Override
    void display();
    void edit(String id);
}
