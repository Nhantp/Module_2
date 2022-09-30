package Case_Study.util;

import Case_Study.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    List<Employee> employeeList=new ArrayList<>();
    public List<Employee>readEmployee(String filePath){
        try {
            FileInputStream fis=new FileInputStream(filePath);
            ObjectInputStream ois=new ObjectInputStream(fis);
            employeeList= (List<Employee>) ois.readObject();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }
    public void writeEmployee(List<Employee>employeeList,String filePath){
        try {
            FileOutputStream fos=new FileOutputStream(filePath);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(employeeList);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
