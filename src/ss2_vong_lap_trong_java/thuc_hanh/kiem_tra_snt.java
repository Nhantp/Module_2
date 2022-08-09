package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class kiem_tra_snt {
    public static void main(String[] args) {
        System.out.println("Nhap vao mot so");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        if(number<2){
            System.out.println("Khong phai so nguyen to.");
        }else {
            int i=2;
            boolean check=true;
            while (i<=Math.sqrt(number)){
                if(number%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println("la so nguyen to");
            }else {
                System.out.println("Khong phai la so nguyen to.");
            }
        }
    }
}
