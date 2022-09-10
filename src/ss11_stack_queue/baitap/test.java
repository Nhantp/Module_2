package ss11_stack_queue.baitap;

import java.util.Scanner;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = str.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String x :array) {
            if (map.containsKey(x)) {
                int count = map.get(x);
                count++;
                map.put(x, count);
            } else {
                map.put(x, 1);
            }
            System.out.println(map);

        }
    }
}

