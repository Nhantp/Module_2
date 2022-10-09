package bai_tap_1.repository;

import bai_tap_1.model.Teacher;

import java.io.IOException;
import java.util.List;

public interface ITeacherRepository {
    String FILE_NAME = "D:\\Codegym\\A05\\Module_2\\src\\bai_tap_1\\data\\teadcher.csv";

    void add(Teacher teacher);
    void edit();

    List<Teacher> getAll();
}
