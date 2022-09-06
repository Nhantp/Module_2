package bai_tap_1.repository.impl;
import bai_tap_1.model.Teacher;
import bai_tap_1.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private List<Teacher>teacherList=new ArrayList<>();

    @Override
    public void add(Teacher teacher) {
        teacherList.add(teacher);

    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }
}
