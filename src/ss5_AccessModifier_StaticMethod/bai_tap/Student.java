package ss5_AccessModifier_StaticMethod.bai_tap;

public class Student {
    private String name="John";
    private String classes="C02";

    Student(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public static void main(String[] args) {
        Student student=new Student();
        String name="Nhan";
        String classes="1";
        student.setName(name);
        student.setClasses(classes);
    }
}
