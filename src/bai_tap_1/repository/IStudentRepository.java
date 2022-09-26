package bai_tap_1.repository;

import bai_tap_1.model.Student;

import java.util.List;

public interface IStudentRepository {
    String FILE_NAME="D:\\Codegym\\A05\\Module_2\\src\\bai_tap_1\\data\\student.dat";
    void add(Student student);
    List<Student>getAll();

}
