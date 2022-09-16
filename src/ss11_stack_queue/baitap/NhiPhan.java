package ss11_stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class NhiPhan {
    public static void chuyenDoi(int num){
        Stack<Integer>stack=new Stack<>();
        while (num > 0) {
            int temp = num % 2;
            stack.push(temp);
            num /= 2;
        }
        final int SIZE= stack.size();
        for (int i=0; i<SIZE; i++){
            System.out.print(stack.pop()+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so can chuyen doi: ");
        int num=scanner.nextInt();
        chuyenDoi(num);
    }
}
