package bai_tap_1.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public abstract class Person{
    protected int id;
    protected String name;
    protected String dateOfBirth;
    protected String gender;

    public Person(int id, String name, String dateOfBirth, String gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    Person(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    void info(){
        Scanner scanner=new Scanner(System.in);
            System.out.println("Nhap vao id:");
            this.id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap vao ten:");
            this.name= scanner.nextLine();
            System.out.println("Nhap vao ngay sinh:");
            this.dateOfBirth=scanner.nextLine();
            System.out.println("Nhap vao gioi tinh:");
            this.gender=scanner.nextLine();
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
