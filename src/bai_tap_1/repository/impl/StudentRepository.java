package bai_tap_1.repository.impl;

import bai_tap_1.model.Student;
import bai_tap_1.repository.IStudentRepository;
import bai_tap_1.util.ReadAndWriteStudent;
import java.util.List;


public class StudentRepository implements IStudentRepository {
    ReadAndWriteStudent readAndWriteStudent=new ReadAndWriteStudent();
    List<Student> studentList=readAndWriteStudent.readStudent(FILE_NAME);

    @Override
    public void add(Student student) {
        studentList.add(student);
    readAndWriteStudent.writeStudent(studentList,FILE_NAME);
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }
}
