package bai_tap_1.service.impl;

import bai_tap_1.model.Student;
import bai_tap_1.repository.IStudentRepository;
import bai_tap_1.repository.impl.StudentRepository;
import bai_tap_1.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    IStudentRepository iStudentRepository = new StudentRepository();
    List<Student> studentList = iStudentRepository.getAll();


    @Override
    public void add() {
        Student student=new Student();
        student.infoStudent();
        iStudentRepository.add(student);
    }

    @Override
    public void remove(int id) {
        Student studentObj = null;
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentObj = student;
                break;
            }
        }
        if (studentObj != null) {
            studentList.remove(studentObj);
            System.out.println("Xoa thanh cong: ");
        } else {
            System.out.println("Not found");
        }
    }

    @Override
    public void display() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void edit() {

    }

}



