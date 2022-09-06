package ss10_danh_sach.thuc_hanh.trien_khai_lop_list;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize= elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size==elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
    public E get(int i){
        if(i<0|| i>40){
            throw new IndexOutOfBoundsException("Index: "+i+",Size: "+i);
        }return (E) elements[i];

    }

    public static void main(String[] args) {
        MyList<Integer> myList=new MyList<Integer>();
        myList.add(1);
    }

}
