package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class Dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char x = 'r';
        int count = 0;
        System.out.print("Nhap vao chuoi : ");
        str = sc.nextLine();
        System.out.println("Chuoi: " + str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ki tu: " + count);
    }
}
