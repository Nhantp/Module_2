package bai_tap_1.model;

import java.time.LocalDate;
import java.util.Scanner;

public class Teacher extends Person {
    private String specialize;

    public Teacher(){
    }

    public Teacher(int id, String name, String dateOfBirth, String gender, String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }


    public void infoTeacher(){
        Scanner scanner=new Scanner(System.in);
        super.info();
        System.out.println("Nhap vao chuyen mon: ");
        this.specialize=scanner.nextLine();
    }


    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                "specialize='" + specialize + '\'' +
                '}';
    }
}
