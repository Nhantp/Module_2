//package ss16_text_file.thuc_hanh.student2;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReadAndWrite {
//    public static final String FILE_STUDENT_CSV = "D:\\Codegym\\A05\\Module_2\\src\\ss16_text_file\\thuc_hanh\\student2\\result ";
//
//    public static List<Student> readCSV() {
//        List<Student> studentList = new ArrayList<>();
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        try {
//            fileReader = new FileReader(FILE_STUDENT_CSV);
//            bufferedReader = new BufferedReader(fileReader);
//            String line;
//            String[] temp;
//            while ((line = bufferedReader.readLine()) != null) {
//              temp=line.split(",");
//              String id=temp[0];
//              String name=temp[1];
//              int age=Integer.parseInt(temp[2]);
//              Student student=new Student(id,name,age);
//              studentList.add(student);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//        return studentList;
//    }
////    public static void writeFile(Student student) throws IOException{
////        FileWriter fileWriter=new FileWriter(FILE_STUDENT_CSV);
////        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
////        bufferedWriter.write(student.getId()+","+student.getName()+","+student.getAge());
////        bufferedWriter.newLine();
////        bufferedWriter.close();
////    }
//    public static void writeListCSV(List<Student>studentList)throws IOException {
//        FileWriter fileWriter = new FileWriter(FILE_STUDENT_CSV);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        String str ="";
//        for (Student student : studentList) {
//            str += student.getId() + ',' + student.getName() + ',' + student.getAge() + ',';
//        }
//        bufferedWriter.write(str);
//        bufferedWriter.newLine();
//        bufferedWriter.close();
//    }
//
//    public static void main(String[] args)throws IOException {
//        List<Student>studentList= ReadAndWrite.readCSV();
//        for (Student student:studentList){
//            System.out.println(student);
//        }
//        studentList.add(new Student("1","nhan",19));
//        studentList.add(new Student("1","nhan",19));
////        studentList.add(new Student("2","nhan",19));
////        studentList.add(new Student("3","nhan",19));
////        studentList.add(new Student("5","nhan",19));
////        studentList.add(new Student("6","nhan",19));
////        studentList.add(new Student("7","nhan",19));
//        writeListCSV(studentList);
//
//    }
//}
