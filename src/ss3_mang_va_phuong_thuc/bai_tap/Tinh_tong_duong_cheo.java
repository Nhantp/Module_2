package ss3_mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class Tinh_tong_duong_cheo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap kich thuoc ma tran:");
        int x = input.nextInt();
        int[][] arr = new int[x][x];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhap phan tu: [" + (i+1) + "][" + (j+1) + "]:");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Ma tran vua nhap::\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("" + arr[i][j] + "\t");
            }
            System.out.printf("\n");
        }
        double sum1=0.0;
        double sum2=0.0;
        for (int i = 0; i < arr.length; i++) {
            sum1+=arr[i][i];
        }
        System.out.println("\nTổng các phần tử ở đường chéo chính là: "+sum1);
        for (int i = 0; i < arr.length; i++) {
            sum2+=arr[i][arr.length-1-i];
        }
        System.out.println("Tổng các phần tử ở đường chéo phụ là: "+sum2);
    }
}
