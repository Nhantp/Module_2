package demo.repository.impl;

import demo.model.Student;
import demo.repository.IStudentRepository;


import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static final List<Student> studentList = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }
}
