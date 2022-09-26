package bai_tap_1.util;

import bai_tap_1.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStudent {
    List<Student> studentList = new ArrayList<>();

    public List<Student> readStudent(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Loi file doc");
        }
        return studentList;
    }

    public void writeStudent(List<Student> studentList, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("loi file ghi");
        }
    }
}
