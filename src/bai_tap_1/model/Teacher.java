package bai_tap_1.model;

import bai_tap_1.model.Person;

public class Teacher extends Person {
    private String specialize;

    Teacher(){
    }

    public Teacher(int id, String name, String dateOfBirth, String gender, String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }



    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return super.toString()+", Chuyên môn: "+specialize;
    }
}
