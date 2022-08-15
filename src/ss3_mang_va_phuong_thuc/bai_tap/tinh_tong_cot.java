package ss3_mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class tinh_tong_cot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so dong:");
        int row=scanner.nextInt();
        System.out.println("Nhap vao so cot:");
        int col=scanner.nextInt();

        int a[][]=new int[row][col];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print("Nhap vao phan tu thu "+i+"["+j+"]: ");
                a[i][j]=scanner.nextInt();
            }
        }
        System.out.println("mảng vừa nhập là:\n");
        for (int i=0; i<a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("" + a[i][j] + "\t");
            }
            System.out.printf("\n");
        }
        System.out.print("\nNhập cột muốn tính tổng:");
        int cols = scanner.nextInt();
        while (cols > col - 1 || cols < 0) {
            System.out.println("không có cột " + cols + " trong mảng");
            System.out.print("\nNhập cột muốn tính tổng:");
            cols = scanner.nextInt();
        }
        int sumCol=0;
        for (int i = 0; i < a.length; i++) {
            sumCol += a[i][cols];
        }
        System.out.println("Tổng các phần tử cột " + cols + " là: " + sumCol);
    }
}
