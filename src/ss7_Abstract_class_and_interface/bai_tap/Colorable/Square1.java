package ss7_Abstract_class_and_interface.bai_tap.Colorable;

public class Square1 {
    private double canh;
    Square1(double canh){
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

}
