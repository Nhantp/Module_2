package Case_Study.models;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Person implements Serializable {
    protected int idCode;
    protected String name;
    protected int dateOfBirth;
    protected boolean gender;
    protected int phoneNumber;
    protected String email;

    public Person() {
    }

    public Person(int idCode, String name, int dateOfBirth, boolean gender, int phoneNumber, String email) {
        this.idCode = idCode;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void infoPerson(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao ma khach hang: ");
        this.idCode =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ten: ");
        this.name = scanner.nextLine();
        System.out.println("Nhap vao ngay sinh: ");
        this.dateOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao gioi tinh: ");
        this.gender= scanner.nextLine().isEmpty();
        System.out.println("Nhap vao so dien thoai: ");
        this.phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao email: ");
        this.email = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "idCode=" + idCode +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
