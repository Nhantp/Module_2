package ss11_stack_queue.thuc_hanh.stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack=new LinkedList<>();
    }

//    Cai push
    public void push(T element){
        stack.addFirst(element);
    }

//    Cai pop
    public T pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

//    Cai size
    public int size(){
        return stack.size();
    }

//    Cai isEmpty
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        return false;
    }


}
