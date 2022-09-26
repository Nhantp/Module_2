package bai_tap_1.repository;

import bai_tap_1.model.Teacher;

import java.io.IOException;
import java.util.List;

public interface ITeacherRepository {
    public static final String FILE_NAME="src/bai_tap_1/data/teacher.dat";

    void add(Teacher teacher);

    List<Teacher> getAll();
}
