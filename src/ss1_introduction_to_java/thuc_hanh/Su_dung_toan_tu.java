package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;

public class Su_dung_toan_tu {
    public static void main(String[] args) {
        float height;
        float width;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Height: ");
        height=scanner.nextFloat();
        System.out.println("Enter Width: ");
        width=scanner.nextFloat();
        float area=width*height;

        System.out.println("Height: "+height);
        System.out.println("Width:"+width);
        System.out.println("Area: "+area);

    }
}
