package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class Tinh_nam_nhuan
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap vao nam can tinh:");
        int year= scanner.nextInt();

        if(year%4==0){
            System.out.println("La Nam Nhuan.");
        }else {
            if (year % 100 == 0 && year % 400 == 0) {
                System.out.println("La Nam Nhuan.");
            } else {
                System.out.println("Khong phai nam nhuan.");
            }
        }

    }
}
