package bt_them;

import java.util.Scanner;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private String address;
    private double advantage;

    public Student() {
    }

    public Student(String id, String name, String address, double advantage) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.advantage = advantage;
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

    public double getAdvantage() {
        return advantage;
    }

    public void setAdvantage(double advantage) {
        this.advantage = advantage;
    }

    Scanner scanner = new Scanner(System.in);

    public void inputStudent() {
        System.out.println("Nhap vao id: ");
        this.id = scanner.nextLine();
        System.out.println("Nhap vao name: ");
        this.name = scanner.nextLine();
        System.out.println("Nhap vao dia chi: ");
        this.address = scanner.nextLine();
        System.out.println("Nhap vao diem trung binh: ");
        this.advantage = Double.parseDouble(scanner.nextLine());
    }

    public void displayStudent() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Dia chi: " + this.address);
        System.out.println("Diem trung binh: " + this.advantage);
    }


    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", advantage=" + advantage +
                '}';
    }
}
