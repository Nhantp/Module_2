package Case_Study.Repository.impl;

import Case_Study.Repository.IEmployeeRepository;
import Case_Study.models.Employee;
import Case_Study.util.ReadAndWriteEmployee;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    ReadAndWriteEmployee readAndWriteEmployee=new ReadAndWriteEmployee();
    List<Employee> employeeList=readAndWriteEmployee.readEmployee(FILE_NAME);

    @Override
    public void add(Employee employee) {
    employeeList.add(employee);
    readAndWriteEmployee.writeEmployee(employeeList,FILE_NAME);
    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {
        readAndWriteEmployee.writeEmployee(employeeList,FILE_NAME);
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }


}
