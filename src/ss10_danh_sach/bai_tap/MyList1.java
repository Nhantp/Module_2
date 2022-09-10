package ss10_danh_sach.bai_tap;

import java.util.Arrays;

public class MyList1<E> {
    int size=0;
    static final int DEFAULT_CAPACITY =10;
    private E[] element;

    public MyList1(){
        element= (E[]) new Object[DEFAULT_CAPACITY];
    }
    public MyList1(int capacity){
        element= (E[]) new Object[capacity];
    }
    public void ensureCapacity(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }
    public void add(E e) {
        if(size==element.length){
            ensureCapacity();
        }
        element[size++]=e;
    }

    public void setSize(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }
     public void setElement(E[] element){
        this.element=element;
    }
    public Object[] getElement(){
        return element;
    }
    public void addIndex(int index, E e){
        if(index>=0&&index<=size){
            size++;
            for (int i=size-1; i>=index; i--){
                element[i]=element[i+1];
            }
            element[index]=e;
        }
    }
//    public E remove(){
//
//    }
    public E get(int i){
        return element[i];
    }

    public static void main(String[] args) {
        MyList1<String> myList1=new MyList1<>();
        myList1.addIndex(1,"nhan1");
        myList1.addIndex(2,"nhan2");
        myList1.addIndex(3,"nhan3");
        myList1.addIndex(4,"nhan4");
        for(int i=0; i<myList1.size;i++){
            System.out.println(myList1.get(i));
        }
        myList1.addIndex(1,"Nhan");
        myList1.addIndex(2,"Nhan");
        myList1.addIndex(3,"Nhan");
        myList1.addIndex(4,"Nhan");
        for (int i=0; i<myList1.size; i++){
            System.out.println(myList1.get(i));
        }
    }

}
