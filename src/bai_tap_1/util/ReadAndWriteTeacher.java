package bai_tap_1.util;

import bai_tap_1.model.Teacher;

import java.awt.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteTeacher {
    public List<Teacher> readFileTeacher(String filePath) {
        List<Teacher> teacherList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String name = temp[1];
                String dateOfBirth=temp[2];
                String gender = temp[3];
                String specialize = temp[4];
                Teacher teacher = new Teacher(id, name, dateOfBirth, gender, specialize);
                teacherList.add(teacher);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return teacherList;
    }

    public void writeFileTeacher(List<Teacher> teacherList, String filePath) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = "";
            for (Teacher teacher : teacherList) {
                str += teacher.getId() + "," + teacher.getName() + "," + teacher.getDateOfBirth() + "," + teacher.getGender() +
                        "," + teacher.getSpecialize()+"\n";
            }
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}