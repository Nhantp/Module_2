package ss13_thuat_toan_tim_kiem;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiCoDoiDaiMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Nhap vao chuoi:");
        string = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        list.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) > list.getLast()) {
                list.add(string.charAt(i));
            }
        }
        for (Character x : list) {
            System.out.println(x);
        }
    }
}
