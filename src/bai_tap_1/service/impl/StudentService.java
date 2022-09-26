package bai_tap_1.service.impl;

import bai_tap_1.model.Student;
import bai_tap_1.repository.IStudentRepository;
import bai_tap_1.repository.impl.StudentRepository;
import bai_tap_1.service.IStudentService;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
   private static final Scanner scanner = new Scanner(System.in);
   private IStudentRepository iStudentRepository = new StudentRepository();


   private Student infoStudent() {
      System.out.println("Nhap vao id:");
      String id = scanner.nextLine();
      System.out.println("Nhap vao ten:");
      String name = scanner.nextLine();
      System.out.println("Nhap vao ngay sinh:");
      String dateOfBirth = scanner.nextLine();
      System.out.println("Nhap vao gioi tinh:");
      String gender = scanner.nextLine();
      System.out.println("Nhap vao lop:");
      String class1 = scanner.nextLine();
      System.out.println("Nhap vao diem:");
      float score = Integer.parseInt(scanner.nextLine());
      System.out.println("Ban da them thanh cong");
      return new Student(id, name, dateOfBirth, gender, class1, score);

   }

   @Override
   public void add() {
      Student student = this.infoStudent();
      this.iStudentRepository.add(student);
   }

   @Override
   public void remove(String id) {
      List<Student> studentList = iStudentRepository.getAll();
      Student studentObj = new Student();
      for (Student student: studentList) {
         if (student.getId().equals(id)){
            studentObj = student;
            break;
         }
      }
      int index = studentList.indexOf(studentObj);
      if(index!=-1){
         studentList.remove(index);
      }else {
         System.out.println("Not found");
      }

   }

   @Override
   public void display() {
     List<Student>studentList=iStudentRepository.getAll();
     for (Student student:studentList){
        System.out.println(student);
      }
   }
}



