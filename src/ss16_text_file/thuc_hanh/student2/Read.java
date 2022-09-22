package ss16_text_file.thuc_hanh.student2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Read {
    public static final String FILE_NAME="D:\\Codegym\\A05\\Module_2\\src\\ss16_text_file\\thuc_hanh\\student2\\file";
    public static List<Student> readFile() {
        List<Student> studentList = new ArrayList<>();
        String line;
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp=line.split(",");
                String id = temp[0];
                String name = temp[1];
                int age = Integer.parseInt(temp[2]);
                studentList.add(new Student(id,name,age));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Loi file");
        }
        return studentList;
    }

    public static void main(String[] args) {
        List<Student>studentList=Read.readFile();
        for (Student student:studentList){
            System.out.println(student);
        }
    }
}

