package ss3_mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[]array={1,3,4,5,7,8,9};
        System.out.println("Mang truoc khi xoa:");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("\nNhap vao phan tu can xoa:");
        int delete=scanner.nextInt();
        System.out.println("Mang sau khi xoa:");
        for (int i=0; i<array.length; i++){
            if(delete==array[i]){
                    for (int j=i;j<array.length-1;j++){
                        array[j]=array[j+1];
                    }
            }
        }
        for (int i=0; i<array.length-1; i++){
            System.out.print(array[i]+" ");
        }
    }
}
