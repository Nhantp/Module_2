package ss11_stack_queue.baitap;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;

public class Reverse<T> {
    private final LinkedList<T> stack;

    public Reverse(){
        stack =new LinkedList<>();
    }
    public int size(){
        return stack.size();
    }
    public void push(T e){
        stack.addFirst(e);
    }
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        return false;
    }
    public T pop(){
        if(isEmpty()){
            throw   new EmptyStackException();
        }
        return stack.removeFirst();
    }
    void printf(){
        if(stack.size()==0){
            System.out.println("empty");
        }else {
            for (int i=0; i<stack.size();i++){
                System.out.println(stack.get(i));
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Reverse<Integer> reverse=new Reverse<>();
        System.out.println("Nhap vao so luong mang:");
        int size=scanner.nextInt();
        for(int i=0; i<size; i++){
            System.out.println("Nhap vao phan tu thu "+(i+1)+":");
            int e=scanner.nextInt();
            reverse.push(e);
        }
        System.out.println("Phan tu da nhap:");
        reverse.printf();
        int size1=reverse.size();
        Reverse<Integer> reverse1=new Reverse<>();
        for(int i=0; i<size1; i++){
            reverse1.push(reverse1.pop());
        }
        System.out.println("mang sau khi dao:");
        reverse1.printf();
    }

}
