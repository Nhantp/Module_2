package ss13_thuat_toan_tim_kiem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TimChuoiTangLonNhat {
    public static void main(String[] args) {

        LinkedList<Character>list=new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi:");
        String input=scanner.nextLine();
        list.add(input.charAt(0));
        for (int i=0; i<input.length();i++){
            if(input.charAt(i)>list.getLast()){
                list.add(input.charAt(i));
            }
        }
        for (Character character : list) {
            System.out.println(character);
        }
    }
}
