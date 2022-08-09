package ss2_vong_lap_trong_java.thuc_hanh;
import java.util.Scanner;
public class tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao a:");
        int a=scanner.nextInt();
        System.out.println("Nhap vao b:");
        int b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);

        if(a==0||b==0){
            System.out.println("Nhap vao gia tri >0");
        }
        if(a>b){
            a=a-b;
        }else {
            b=b-a;
        }
        System.out.print("UCLN la:"+a);
    }
}
