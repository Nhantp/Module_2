package ss16_text_file.thuc_hanh.doc_ghi_file_student;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private String address;
    private Scanner scanner=new Scanner(System.in);

    public Student() {
    }

    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void input(){
        System.out.println("Nhap vao id: ");
        this.id=scanner.nextLine();
        System.out.println("Nhap vao ten: ");
        this.name=scanner.nextLine();
        System.out.println("Nhap vao dia chi: ");
        this.address=scanner.nextLine();

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
