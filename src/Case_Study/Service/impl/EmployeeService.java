package Case_Study.Service.impl;

import Case_Study.Repository.IEmployeeRepository;
import Case_Study.Repository.impl.EmployeeRepository;
import Case_Study.Service.IEmployeeService;
import Case_Study.models.Employee;

import java.util.List;
import java.util.Scanner;
public class EmployeeService implements IEmployeeService {
    Scanner scanner=new Scanner(System.in);
    IEmployeeRepository iEmployeeRepository=new EmployeeRepository();

    @Override
    public void add() {
     Employee employee=new Employee();
     employee.infoEmployee();
     iEmployeeRepository.add(employee);
    }

    @Override
    public void display() {
        List<Employee>employeeList=iEmployeeRepository.findAll();
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    public void edit(int id) {
        List<Employee> employeeList=iEmployeeRepository.findAll();
        for(Employee employee:employeeList){
            if(employee.getIdCode()==(id)){
                do{
                    System.out.println("1.Sua id.");
                    System.out.println("2.Sua ten.");
                    System.out.println("3.Sua ngay sinh.");
                    System.out.println("4.Sua gioi tinh.");
                    System.out.println("5.Sua so dien thoai.");
                    System.out.println("6.Sua so email.");
                    System.out.println("7.Sua trinh do.");
                    System.out.println("8.Sua vi tri.");
                    System.out.println("9.Sua luong.");
                    System.out.println("10.Quay lai:");
                    System.out.println("Nhap vao lua chon:");
                    int choice=Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:{
                            System.out.println("Nhap vao id:");
                            int idCode=Integer.parseInt(scanner.nextLine());
                            employee.setIdCode(idCode);
                            iEmployeeRepository.edit();
                            break;
                        }
                        case 2:{
                            System.out.println("Nhap vao ten:");
                            String name=scanner.nextLine();
                            employee.setName(name);
                            iEmployeeRepository.edit();
                            break;
                        }
                        case 3:{
                            System.out.println("Nhap vao ngay sinh:");
                            int dayOfBirth=Integer.parseInt(scanner.nextLine());
                            employee.setDateOfBirth(dayOfBirth);
                            iEmployeeRepository.edit();
                            break;
                        }
                        case 4:{
                            System.out.println("Nhap vao gioi tinh:");
                            boolean gender=scanner.nextLine().isEmpty();
                            employee.setGender(gender);
                            iEmployeeRepository.edit();
                            break;
                        }
                        case 5:{
                            System.out.println("Nhap vao so dien thoai:");
                            int phoneNumber=Integer.parseInt(scanner.nextLine());
                            employee.setPhoneNumber(phoneNumber);
                            iEmployeeRepository.edit();
                            break;
                        }
                        case 6:{
                            System.out.println("Nhap vao email:");
                            String email=scanner.nextLine();
                            employee.setEmail(email);
                            iEmployeeRepository.edit();
                            break;
                        }
                        case 7:{
                            System.out.println("Nhap vao trinh do:");
                            String level=scanner.nextLine();
                            employee.setLevel(level);
                            iEmployeeRepository.edit();
                            break;
                        }
                        case 8:{
                            System.out.println("Nhap vao vi tri:");
                            String location=scanner.nextLine();
                            employee.setLocation(location);
                            iEmployeeRepository.edit();
                            break;
                        }
                        case 9:{
                            System.out.println("Nhap vao luong:");
                            double salary=Double.parseDouble(scanner.nextLine());
                            employee.setSalary(salary);
                            iEmployeeRepository.edit();
                            break;
                        }
                        case 10:{
                            return;
                        }
                    }
                }while (true);
            }
        }

    }
}
