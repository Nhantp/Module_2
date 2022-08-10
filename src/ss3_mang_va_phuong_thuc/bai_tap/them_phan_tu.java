package ss3_mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class them_phan_tu {
    public static void main(String[] args) {
        int[] array = {1,4,6,8,9,6,4,3};
        int array1 = array.length + 1;
        int[] newArray = new int[array1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mang truoc khi them:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" " + array[i] + " ");
        }
        System.out.println("\nNhap vao vi tri them:");
        int index = scanner.nextInt();
        System.out.println("Nhap so can them:");
        int x = scanner.nextInt();
        if (index<=1||index>=newArray.length-1){
            System.out.println("Khong them duoc");
        }else{
            for (int i = 0; i < newArray.length - 1; i++) {
                newArray[i] = array[i];
            }
            for (int i = 0; i < newArray.length; i++) {
                if (index == i+1) {
                    for (int j = newArray.length - 1; j > i; j--) {
                        newArray[j] = newArray[j - 1];
                    }
                    newArray[i] = x;
                }
            }
            System.out.printf("Mang sau khi them:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.printf(" " + newArray[i] + " ");
            }
        }
    }
}