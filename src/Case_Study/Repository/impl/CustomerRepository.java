package Case_Study.Repository.impl;

import Case_Study.Repository.ICustomerRepository;
import Case_Study.models.Customer;
import Case_Study.util.ReadAndWriteCustomer;
import java.util.LinkedList;
public class CustomerRepository implements ICustomerRepository {
    ReadAndWriteCustomer readAndWriteCustomer = new ReadAndWriteCustomer();
    LinkedList<Customer> customerLinkedList = readAndWriteCustomer.readCustomer(FILE_NAME);

    @Override
    public void add(Customer customer) {
        customerLinkedList.add(customer);
        readAndWriteCustomer.writeCustomer(customerLinkedList, FILE_NAME);
    }

    @Override
    public void display() {
    }

    public void edit() {

    }

    @Override
    public LinkedList<Customer> findAll() {
        return customerLinkedList;
    }

}

