package ss6_KeThua.bai_tap.BaiCircle;


import ss6_KeThua.thuc_hanh.Shape;
import ss7_Abstract_class_and_interface.thuc_hanh.Comparable.ComparableCircle;

public class Circle extends Shape {
    public double radius=1.0;
    private String color="Blue";

    public Circle(){
    }
    public Circle(double radius, String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*radius*3.14;
    }

    @Override
    public String toString() {
        return "Color:"+color+"\nRadius:"+radius+"\nArea:"+getArea()+"\n"+"Filled: "+isFilled()+"\n";
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(5.4,"Green",false);
        System.out.println(circle);
    }
}
