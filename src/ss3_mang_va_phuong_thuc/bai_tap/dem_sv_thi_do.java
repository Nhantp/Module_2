package ss3_mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class dem_sv_thi_do {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int[] array;
        int count=0;

       do {
           System.out.println("Nhap vao so luong sinh vien:");
            size = scanner.nextInt();
           if(size>30){
               System.out.println("Vui long nhap lai");
           }
       }while (size>30);

       array=new int[size];
       for(int i=1; i<=array.length; i++){
           System.out.print("Nhap vao sinh vien thu "+i+": ");
           array[i] =scanner.nextInt();
       }

        System.out.println("So luong diem sinh vien da nhap vao: ");
       for (int j=1; j<=array.length; j++){
           System.out.print(array[j]);
           if(j>5&&j<10){
               count++;
           }
       }
        System.out.println("So sinh vien do:"+count);
    }
}
