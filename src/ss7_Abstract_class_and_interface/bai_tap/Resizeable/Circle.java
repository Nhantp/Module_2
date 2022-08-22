package ss7_Abstract_class_and_interface.bai_tap.Resizeable;

public class Circle implements Resizeable {
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public double area(){
        return radius*radius*3.14;
    }

    @Override
    public String toString() {
        return "Radius: " +radius+"\n"+"Area :"+area();
    }

    @Override
    public void resize(double percent) {
        radius=radius+radius*percent;
    }
}

