package bai_tap_1.repository.impl;
import bai_tap_1.model.Teacher;
import bai_tap_1.repository.ITeacherRepository;
import bai_tap_1.util.ReadAndWriteStudent;
import bai_tap_1.util.ReadAndWriteTeacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    ReadAndWriteTeacher readAndWriteTeacher= new ReadAndWriteTeacher();
    private  List<Teacher>teacherList=readAndWriteTeacher.readTeacher(FILE_NAME);

    @Override
    public void add(Teacher teacher){
        teacherList.add(teacher);
        readAndWriteTeacher.writeTeacher(teacherList,FILE_NAME);

    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }
}
