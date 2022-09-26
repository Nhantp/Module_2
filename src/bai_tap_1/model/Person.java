package bai_tap_1.model;

import java.io.Serializable;
import java.util.Objects;

public abstract class Person implements Serializable {
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;

    public Person(String id, String name, String dateOfBirth, String gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
    Person(){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public String toString() {
        return "Id: "+id+",  Tên: "+name+",  Ngày sinh: "+dateOfBirth+",  Giới tính: "+gender;
    }
}
