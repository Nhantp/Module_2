package ss5_AccessModifier_StaticMethod.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle(10.5);
        double r= circle.getRadius();
        double a =circle.getArea();
        System.out.println("Radius: "+r);
        System.out.println("Area: "+a);
    }
}
