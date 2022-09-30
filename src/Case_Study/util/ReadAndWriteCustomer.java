package Case_Study.util;

import Case_Study.models.Customer;

import java.io.*;
import java.util.LinkedList;

public class ReadAndWriteCustomer {
    LinkedList<Customer> customerLinkedList=new LinkedList<>();
    public LinkedList<Customer> readCustomer(String filePath){
        try {
            FileInputStream fis=new FileInputStream(filePath);
            ObjectInputStream ois=new ObjectInputStream(fis);
            customerLinkedList= (LinkedList<Customer>) ois.readObject();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return customerLinkedList;
    }
    public void writeCustomer(LinkedList<Customer>customerLinkedList,String filePath){
        try {
            FileOutputStream fos=new FileOutputStream(filePath);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(customerLinkedList);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
