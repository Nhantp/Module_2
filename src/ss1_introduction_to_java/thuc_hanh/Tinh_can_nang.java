package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;
import java.lang.Math;
public class Tinh_can_nang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap vao chieu cao:");
        float height= scanner.nextFloat();
        System.out.println("Nhap vao can nang:");
        float weight=scanner.nextFloat();

        double bmi=weight/Math.pow(height,2);
        if(bmi<18.5){
            System.out.println("Underweight.");
        }else if(bmi>=18.5&&bmi<25){
            System.out.println("Normal");
        } else if (bmi>=25&&bmi<30) {
            System.out.println("OverWeight");
        }else {
            System.out.println("Obese");
        }
    }
}
