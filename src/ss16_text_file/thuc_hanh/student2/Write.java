package ss16_text_file.thuc_hanh.student2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Write {
    public static final String FILE_NAME="D:\\Codegym\\A05\\Module_2\\src\\ss16_text_file\\thuc_hanh\\student2\\file";
    public static void write(Student student) throws IOException {
        FileWriter fileWriter=new FileWriter(FILE_NAME);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(student.getId()+","+student.getName()+","+student.getAge());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
//    public static void writeFile(List<Student>studentList) throws IOException {
//        FileWriter fileWriter=new FileWriter(FILE_NAME);
//        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
//        String str="";
//        for(Student student:studentList){
//            str+=student.getId()+","+student.getName()+","+student.getAge()+"\n";
//        }
//        if(str!=null&&!str.isEmpty()){
//            System.out.println(str);
//        }
//        bufferedWriter.close();
//    }

    public static void main(String[] args) throws IOException {
        Student student=new Student("1","Nhan",2);
        write(student);

    }
}
