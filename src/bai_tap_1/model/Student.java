package bai_tap_1.model;


import java.time.LocalDate;
import java.util.Scanner;

public class Student extends Person {
    private String class1;
    private float score;
    Scanner scanner=new Scanner(System.in);

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, String gender, String class1, float score) {
        super(id, name, dateOfBirth, gender);
        this.class1 = class1;
        this.score = score;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void infoStudent() {
        super.info();
        System.out.println("Nhap vao lop: ");
        this.class1=scanner.nextLine();
        System.out.println("Nhap vao diem:");
        this.score = Integer.parseInt(scanner.nextLine());

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                "class1='" + class1 + '\'' +
                ", score=" + score +
                '}';
    }
}
