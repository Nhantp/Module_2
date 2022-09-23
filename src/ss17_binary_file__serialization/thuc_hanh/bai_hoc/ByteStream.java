package ss17_binary_file__serialization.thuc_hanh.bai_hoc;

import java.io.*;

public class ByteStream {
    private static final String FILE_NAME="D:\\Codegym\\A05\\Module_2\\src\\ss17_binary_file__serialization\\thuc_hanh\\bai_hoc\\studentData.dat";
    public static void writeFile(Student student) throws IOException {
        FileOutputStream fos=new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
    }
    public static Student readFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(FILE_NAME);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Student student=(Student) objectInputStream.readObject();
        return student;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student=new Student("1","nhan",33);
        writeFile(student);
        System.out.println(readFile());
    }
}
