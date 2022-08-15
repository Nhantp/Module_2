package ss3_mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class tim_max_2_chieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap phan tu dong:");
        int row=scanner.nextInt();
        System.out.println("Nhap phan tu cot");
        int col=scanner.nextInt();
        int a[][]=new int[row][col];
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Nhap phan tu:"+"a["+i+"]["+j+"]:");
                a[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Phan tu da nhap vao:");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(" "+a[i][j]+" ");
            }
        }
        int max=a[0][0];
        System.out.print("\nMax=");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if(max<=a[i][j]){
                    max=a[i][j];
                }
            }
        }
        System.out.print(max);

    }
}
