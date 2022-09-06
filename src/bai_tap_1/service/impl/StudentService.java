package bai_tap_1.service.impl;

import bai_tap_1.model.Student;
import bai_tap_1.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
   private static final List<Student> studentList = new ArrayList<>();
   Scanner input= new Scanner(System.in);

   static {
      studentList.add(new Student(1,"nhan","26/01/2003","male","a05",123));
      studentList.add(new Student(2,"nhan","26/01/2003","male","a05",123));
      studentList.add(new Student(3,"nhan","26/01/2003","male","a05",123));
      studentList.add(new Student(4,"nhan","26/01/2003","male","a05",123));
      studentList.add(new Student(5,"nhan","26/01/2003","male","a05",123));
   }

   public void add(){
      System.out.println("Nhap vao id:");
      int id = Integer.parseInt(input.nextLine());
      System.out.println("Nhap vao ten:");
      String name=this.input.nextLine();
      System.out.println("Nhap vao ngay sinh:");
      String dateOfBirth=this.input.nextLine();
      System.out.println("Nhap vao gioi tinh:");
      String gender=this.input.nextLine();
      System.out.println("Nhap vao lop:");
      String class1=this.input.nextLine();
      System.out.println("Nhap vao diem:");
      float score=this.input.nextFloat();
      Student student=new Student(id,name,dateOfBirth,gender,class1,score);
      studentList.add(student);
      System.out.println("Ban da them thanh cong");
   }
   public void remove(){
      System.out.println("Nhap vao id muon xoa:");
      int removeStudent=Integer.parseInt(input.nextLine());
      for (int i = 0 ; i <studentList.size(); i++) {
         if(removeStudent==studentList.get(i).getId()){
            studentList.remove(i);
         }
      }
      System.out.println("Da xoa hoc sinh co id:"+removeStudent);
   }
   public void display(){
      for (int i = 0; i <studentList.size(); i++) {
         System.out.println(studentList.get(i));
      }
      System.out.println("Hien thi thanh cong.");
   }
}
