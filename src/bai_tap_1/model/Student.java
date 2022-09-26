package bai_tap_1.model;


public class Student extends Person {
    private String class1;
    private float score;

    public Student(){
    }

    public Student(String id, String name, String dateOfBirth, String gender, String class1, float score) {
        super(id, name, dateOfBirth, gender);
        this.class1 = class1;
        this.score = score;
    }

    public Student(String id) {
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


    @Override
    public String toString() {
        return super.toString()+", Lớp: "+class1+",  Điểm: "+score;
    }

}
