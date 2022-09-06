package bai_tap_1.repository;

import bai_tap_1.model.Teacher;

import java.util.List;

public interface ITeacherRepository {

    void add(Teacher teacher);

    List<Teacher> getAll();
}
