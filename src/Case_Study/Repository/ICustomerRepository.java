package Case_Study.Repository;

import Case_Study.models.Customer;

import java.util.LinkedList;

public interface ICustomerRepository extends IRepository<Customer>{
    String FILE_NAME="D:\\Codegym\\A05\\Module_2\\src\\Case_Study\\Data\\customer.dat";

    @Override
    void add(Customer customer);

    @Override
    void display();

    LinkedList<Customer>findAll();
}
