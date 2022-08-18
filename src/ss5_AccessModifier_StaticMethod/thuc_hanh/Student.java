package ss5_AccessModifier_StaticMethod.thuc_hanh;

public class Student {
    private int stt;
    private String name;
    private static String college="BTT";

    Student(int stt, String name){
        this.stt=stt;
        this.name=name;
    }
    void display(){
        System.out.println("STT: "+stt+" Name: "+name+" School:" +college);
    }
    static void change(){
        college="HV";
    }

    public static void main(String[] args) {
        Student.change();
        Student student1=new Student(1,"Nhan");
        Student student2=new Student(1,"nam");
        Student student3=new Student(1,"nah");
        student1.display();
        student2.display();
        student3.display();
    }
}
