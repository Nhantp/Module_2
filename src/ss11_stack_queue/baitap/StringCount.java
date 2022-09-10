package ss11_stack_queue.baitap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class StringCount {
    public static void main(String[] args) {
        TreeMap<String,Integer> map=new TreeMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String str=scanner.nextLine();
        String[] arr=str.split(" ");
        System.out.println("Mang sau khi nhap: "+Arrays.toString(arr));
        for(String s: arr){
            if( map.containsKey(s)){
                int count =map.get(s);
                count++;
                map.put(s,count);
            }else {
                map.put(s,1);
            }
        }
        System.out.println(map);
    }
}
