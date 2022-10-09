package bai_tap_1.util;

import bai_tap_1.model.Student;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStudent {
    public List<Student> readFileStudent(String filePath) {
        List<Student> studentList = new ArrayList<>();
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
                String dateOfBirth = temp[2];
                String gender = temp[3];
                String class1 = temp[4];
                float score = Float.parseFloat(temp[5]);
                Student student = new Student(id, name, dateOfBirth, gender, class1, score);
                studentList.add(student);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return studentList;
    }

    public void writeFileStudent(List<Student> studentList, String filePath) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = "";
            for (Student student : studentList) {
                str += student.getId() + "," + student.getName() + "," + student.getDateOfBirth() + "," + student.getGender() +
                        "," + student.getClass1() + "," + student.getScore()+"\n";
            }
            if(str!=null &&!str.isEmpty()){
                bufferedWriter.write(str);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }

        }
    }
}
