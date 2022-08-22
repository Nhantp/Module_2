package ss7_Abstract_class_and_interface.bai_tap.Resizeable;

public class Rectangle implements Resizeable {
    private double height;
    private double width;
    Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    public double area(){
        return height*width;
    }

    @Override
    public String toString() {
        return "\nHeight: "+height+"\n"+"Width: "+width+"\n"+"Area: "+area();
    }

    @Override
    public void resize(double percent) {
        height=height + height*percent;
        width= width+width*percent;
    }
}
