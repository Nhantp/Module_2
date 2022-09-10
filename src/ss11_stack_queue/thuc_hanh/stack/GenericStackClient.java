package ss11_stack_queue.thuc_hanh.stack;

public class GenericStackClient {
    private static void stackOfString(){
        MyGenericStack<String> stack= new MyGenericStack<>();
        stack.push("5");
        stack.push("4");
        stack.push("3");
        stack.push("2");
        stack.push("1");
        System.out.println("2.1. Size of stack after push operations: "+stack.size());
        System.out.println("2.2. Pop elements from stack : "+stack.size());
        while (!stack.isEmpty()){
            System.out.print(" %s"+ stack.pop());
        }
        System.out.println("\nn3.3 Size of stack after pop operations : " + stack.size());
    }
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integer.");
        stackOfString();
        System.out.println("\n1. Stack of integer.");
        stackOfString();
    }
}
