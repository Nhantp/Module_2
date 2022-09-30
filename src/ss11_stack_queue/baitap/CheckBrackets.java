package ss11_stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {

    public static void checkBracket(String input){

        Stack bracketLeft = new Stack();
        Stack bracketRight = new Stack();
        for (int i = 0; i < input.length(); i++) {
            if( input.charAt(i)==')'){
                bracketLeft.push(input.charAt(i));
            }
            else if(input.charAt(i) == '(' ){
                bracketRight.push(input.charAt(i));
            }
        }
        if(bracketRight.size() == bracketLeft.size()){
            System.out.println("Valid expression");
        }
        else{
            System.out.println("Valid is not expression");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String input;
        input = scanner.nextLine();
        checkBracket(input);
    }
}
