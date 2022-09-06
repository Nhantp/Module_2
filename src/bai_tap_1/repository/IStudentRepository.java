package bai_tap_1.repository;

import bai_tap_1.model.Student;

import java.util.List;

public interface IStudentRepository {
    void addStudent(Student student);
    List<Student>getAll();
}
