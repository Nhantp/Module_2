package demo.service.impl.impl;


import demo.model.Student;
import demo.repository.IStudentRepository;
import demo.repository.impl.StudentRepository;
import demo.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static final Scanner scanner = new Scanner(System.in);
    private final IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void addStudent() {
        Student student = this.infoStudent();
        iStudentRepository.addStudent(student);
    }

    @Override
    public void display() {
        List<Student> studentList = iStudentRepository.getAll();
        for (Student student: studentList) {
            System.out.println(student);
        }

    }

    private Student infoStudent() {
        System.out.print("Mời bạn nhập code học sinh: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập ngày sinh học sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Mời bạn nhập lớp của học sinh: ");
        String nameClass = scanner.nextLine();
        System.out.print("Mời bạn nhập điểm của học sinh: ");
        double point = Double.parseDouble(scanner.nextLine());
        Student student = new Student(code, name, dateOfBirth,nameClass,point);
        return student;
    }
}
