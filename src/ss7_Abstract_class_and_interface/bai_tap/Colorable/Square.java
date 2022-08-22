package ss7_Abstract_class_and_interface.bai_tap.Colorable;

public class Square implements Colorable{
    private double canh;
    Square(double canh){
        this.canh=canh;
    }
    public double getCanh() {
        return canh;
    }
    public double area(){
        return canh*canh;
    }

    @Override
    public String toString() {
        return "Canh: "+canh+" Area: "+area();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four side.");
    }
}
