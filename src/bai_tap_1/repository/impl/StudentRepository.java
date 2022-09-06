package bai_tap_1.repository.impl;

import bai_tap_1.model.Student;
import bai_tap_1.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static final List<Student> studentList=new ArrayList<>();


    @Override
    public void add(Student student) {
    studentList.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }
}
