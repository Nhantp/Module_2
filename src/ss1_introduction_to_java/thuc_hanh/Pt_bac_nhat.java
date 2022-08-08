package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class Pt_bac_nhat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a:");
        double a=scanner.nextDouble();
        System.out.println("Enter b:");
        double b=scanner.nextDouble();
        System.out.println("Enter c:");
        double c= scanner.nextDouble();

        if(a!=0){
            double answer=(c-b)/a;
            System.out.println("X="+answer);
        }else {
            if(a==b){
                System.out.println("Pt vo so nghiem");
            }
            else {
                System.out.println("Pt vo nghiem");
            }
        }

    }
}
