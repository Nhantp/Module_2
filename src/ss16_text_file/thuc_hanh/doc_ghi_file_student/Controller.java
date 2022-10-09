package ss16_text_file.thuc_hanh.doc_ghi_file_student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class
Controller {
    List<Student> studentList = new ArrayList<>();
    Student student = new Student();
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_NAME = "D:\\Codegym\\A05\\Module_2\\src\\ss16_text_file\\thuc_hanh\\doc_ghi_file_student\\data";
    public static final String COMMA = ",";

    public void add() {
        student.input();
        studentList.add(student);

    }

    public void display() {
        String line = null;
        for (Student students : studentList) {
            line = students.getId() + COMMA + students.getName() + COMMA + students.getAddress();
            ReadAndWrite.fileWrite(FILE_NAME, line);
        }
        List<String> listLine = ReadAndWrite.readFile(FILE_NAME);
        System.out.println(listLine);
    }

    public static void main(String[] args) {
        Controller controller=new Controller();
        controller.add();
        controller.display();



//        Student student=new Student("1","nhan","Qn");
//        Student student1=new Student("2","nhan","Qn");
//        Student student2=new Student("3","nhan","Qn");

//        list.add(student1);
//        list.add(student);
//        list.add(student2);

    }
}
