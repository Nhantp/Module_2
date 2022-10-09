package bai_tap_1.repository.impl;

import bai_tap_1.model.Teacher;
import bai_tap_1.repository.ITeacherRepository;
import bai_tap_1.util.ReadAndWriteTeacher;

import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    ReadAndWriteTeacher readAndWriteTeacher = new ReadAndWriteTeacher();
    List<Teacher> teacherList = readAndWriteTeacher.readFileTeacher(FILE_NAME);

    @Override
    public void add(Teacher teacher) {
        teacherList.add(teacher);
        readAndWriteTeacher.writeFileTeacher(teacherList, FILE_NAME);
    }

    @Override
    public void edit() {
        readAndWriteTeacher.writeFileTeacher(teacherList, FILE_NAME);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }
}
