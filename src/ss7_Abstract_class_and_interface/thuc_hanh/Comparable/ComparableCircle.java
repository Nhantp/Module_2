package ss7_Abstract_class_and_interface.thuc_hanh.Comparable;
import java.util.Arrays;
import ss6_KeThua.bai_tap.BaiCircle.Circle;
public class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle(){
    }
    public ComparableCircle(double radius, String color, boolean filled){
        super(radius,color,filled);
    }


    @Override
    public String toString() {
        return "Radius: "+radius+ " Area: "+getArea();
    }
    @Override
    public int compareTo(Object o) {
        ComparableCircle circle= (ComparableCircle) o;
        if(getRadius()<circle.getRadius()) return 1;
        else if (getRadius()>circle.getRadius()) return -1;
        else return 0;
    }


    public static void main(String[] args) {
        ComparableCircle[] circle=new ComparableCircle[3];
        circle[0]=new ComparableCircle(3.2,"Red",true);
        circle[1]=new ComparableCircle(2.0,"Blue",false);
        circle[2]=new ComparableCircle(4.6,"Green",false);
        System.out.println("Pre-sorted");
        for (ComparableCircle comparableCircle:circle){
            System.out.println(comparableCircle);
        }
        Arrays.sort(circle);
        System.out.println("After-sorted");
        for (ComparableCircle comparableCircle1:circle){
            System.out.println(comparableCircle1);
        }
    }
}

