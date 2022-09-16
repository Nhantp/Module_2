package ss11_stack_queue.baitap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KiemTraChuoiDoiXung {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String str=scanner.nextLine();
        Queue<Object> queue=new LinkedList<>();
        for(int i=str.length()-1; i>=0; i--){
            queue.add(str.charAt(i));
        }
        String reverseString="";
        while (!queue.isEmpty()){
            reverseString=reverseString+queue.remove();
        }
        if(str.equals(reverseString)){
            System.out.println("Doi xung.");
        }else {
            System.out.println("Khong doi xung.");
        }
    }
}
