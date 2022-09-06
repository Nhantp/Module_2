package ss6_KeThua.bai_tap.BaiCircle;

public class Cylinder extends Circle {
    private double height=3.3;
    public Cylinder(){
    }
    Cylinder(double radius, String color, double height,boolean filled){
        super(radius,color,filled);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setRadius(){
        this.radius=radius;
    }

    public double getVolume(){
        return radius*radius*height*3.14;
    }
    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public String toString() {
        return super.toString()+"Volume:"+getVolume()+"\n";
    }

    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(3.0,"Red",4.3,true);
        System.out.println(cylinder);
        cylinder=new Cylinder();
        System.out.println(cylinder);
    }
}
