package ss7_Abstract_class_and_interface.bai_tap.Resizeable;


public class main {
    public static void main(String[] args) {
        Circle[] circle=new Circle[2];
        circle[0]=new Circle(5);
        circle[1]=new Circle(7);

        System.out.println("\nHinh tron khi chua tang kich thuoc:");
        for (Circle circle1:circle){
            System.out.println(circle1);
        }
        System.out.println("\nMang sau khi tang");
        for(Circle circle2:circle){
           double percent = Math.random();
           circle2.resize(percent);
            System.out.println(circle2);
        }
        Rectangle[] rectangles=new Rectangle[2];
        rectangles[0]=new Rectangle(11,4);
        rectangles[1]=new Rectangle(9,6);

        System.out.println("\nHinh chu nhat khi chua tang kich thuoc:");
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }

        System.out.println("\nHinh chu nhat sau khi tang kich thuoc");
        for (Rectangle rectangle1:rectangles){
            double percent=Math.random();
            rectangle1.resize(percent);
            System.out.println(rectangle1);
        }
    }

}
