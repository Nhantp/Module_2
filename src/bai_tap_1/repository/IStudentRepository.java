package bai_tap_1.repository;

import bai_tap_1.model.Student;
import bai_tap_1.model.Teacher;

import java.util.List;

public interface IStudentRepository {
    void add(Student student);
    List<Student>getAll();

}
