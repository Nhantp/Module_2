package Case_Study.Repository.impl;

import Case_Study.models.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository {
    @Override
    void add();

    @Override
    void display();

    @Override
    void edit();

    @Override
    List<Employee> getAll();
}
