package bai_tap_1.service.impl;

import bai_tap_1.model.Student;
import bai_tap_1.repository.IStudentRepository;
import bai_tap_1.repository.impl.StudentRepository;
import bai_tap_1.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
   private static final Scanner scanner = new Scanner(System.in);
   private final IStudentRepository iStudentRepository = new StudentRepository();


   private Student infoStudent() {
      System.out.println("Nhap vao id:");
      int id = Integer.parseInt(scanner.nextLine());
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
      Student student = new Student(id, name, dateOfBirth, gender, class1, score);
      return student;
   }

   @Override
   public void add() {
      Student student=this.infoStudent();
      iStudentRepository.add(student);
   }

   @Override
   public void remove() {
      System.out.println("Nhap vap hoc sinh can xoa:");
      List<Student> studentList=iStudentRepository.getAll();
      int removeStudent=Integer.parseInt(scanner.nextLine());
      for (int i=0; i<studentList.size();i++){
         if(removeStudent==studentList.get(i).getId()){
            studentList.remove(i);
         }
      }

   }

   @Override
   public void display() {
      List<Student> studentList=iStudentRepository.getAll();
      for(Student student:studentList){
         System.out.println(student);
      }
   }
}



//   @Override
//   public void add() {
//
//   }
//
//   public void remove(){
//      System.out.println("Nhap vao id muon xoa:");
//      int removeStudent=Integer.parseInt(input.nextLine());
//      for (int i = 0 ; i <studentList.size(); i++) {
//         if(removeStudent==studentList.get(i).getId()){
//            studentList.remove(i);
//         }
//      }
//      System.out.println("Da xoa hoc sinh co id:"+removeStudent);
//   }
//   public void display(){
//      for (int i = 0; i <studentList.size(); i++) {
//         System.out.println(studentList.get(i));
//      }
//      System.out.println("Hien thi thanh cong.");
//   }
//}
