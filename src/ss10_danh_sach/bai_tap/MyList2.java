package ss10_danh_sach.bai_tap;

public class MyList2<E> {
    private int size=0;
    // do dai mac dinh cua arrayList
    private static final int DEFAULT_CAPACITY=10;

    private E elements[];

    public MyList2() {
        elements= (E[]) new Object[DEFAULT_CAPACITY];
    }
    public MyList2(int size) {
        elements= (E[]) new Object[size];
    }

    //bolean add(E e)
    public void add(E e) {
        if(size==elements.length){
            size++;
        }
        elements[size++]=e;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public E[] getElements() {
        return elements;
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    //void add(int index, E e)
    public void addToIndex(int index, E e){
        if(index>=0 && index<=size){
            size++;
            for(int i=size-1; i>=index; i--){
                elements[i+1]= elements[i];
            }
            elements[index]= e;
        }
    }
    //E remove(int index)
    public boolean removeToIndex(int index){
        if(index>=0 && index<size){
            for(int i=index; i<size;i++){
                elements[i]= elements[i+1];
            }
            size--;
            return true;
        }
        return false;
    }
    // int size
    public int getSize() {
        return size;
    }


    //E clone
//    @Override
//    public MyList1 clone() {
//        MyList1<E> clone = new MyList1<>(elements.length);
//        for (E x : elements) {
//            clone.add(x);
//        }
//        return clone;
//    }
    //boolean contains(E e)
    public boolean contains(E e){
        for(int i=0; i<size;i++){
            if(elements[i].equals(e)){
                return true;
            }
        }
        return false;
    }
    //int indexOf(E e)
    public int indexOf(E e){
        for(int i=0; i<size;i++){
            if(elements[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    //E get(int i)
    public E get(int index){
        return elements[index];
    }
    //public void clear()
    public  void clear(){
        for(int i=0; i<size;i++){
            elements[i]=null;
        }
        ensureCapacity(DEFAULT_CAPACITY);
    }
    //void ensureCapacity(int minCapacity)
    public void ensureCapacity(int minCapacity){
        this.size=DEFAULT_CAPACITY;
    }
    //run main
    public static void main(String[] args) {
//        MyList1<String> myList1= new MyList1<>();
//        //add elements to ArrayList
//        myList1.add("mot");
//        myList1.add("hai");
//        myList1.add("ba");
//        myList1.add("bon");
//        myList1.add("nam");
//        //Print the elements
//        System.out.println("Print ArrayList: ");
//        for(int i=0; i<myList1.size;i++){
//            System.out.println(myList1.get(i));
//        }
//        //add elements to ArrayList (index)
//        myList1.addToIndex(2,"Them vao vi tri 2");
//        System.out.println("Print ArrayList: ");
//        for(int i=0; i<myList1.size;i++){
//            System.out.println(myList1.get(i));
//        }
        //get size
//        System.out.println("Size: "+myList1.getSize());
        //remove to index 2
//        myList1.removeToIndex(2);
//        System.out.println("Print ArrayList: ");
//        for(int i=0; i<myList1.size;i++){
//            System.out.println(myList1.get(i));
//        }
        // check elements contains arrayList
        //true
//        System.out.println(myList1.contains("mot"));
        ///false
//        System.out.println(myList1.contains("sau"));
        //Get the position of the element in the arrayList
        // return index
//        System.out.println(myList1.indexOf("mot"));
        //return -1
//        System.out.println(myList1.indexOf(("sau")));
        //clear ArrayList
//        myList1.clear();
//        System.out.println("Print ArrayList clear: ");
//        for(int i=0; i<myList1.size;i++){
//            System.out.println(myList1.get(i));
//        }
//        System.out.println("Size: "+myList1.getSize());
        //clone

        MyList2<String> myList2= new MyList2<>();
//        myList2.add("mot");
//        myList2.add("hai");
//        myList2.add("ba");
//        myList2.add("bon");
//        System.out.println("List: ");
//        for(int i=0; i<myList2.size;i++){
//            System.out.println(myList2.get(i));
//        }
        myList2.addToIndex(0,"tham");
        myList2.addToIndex(1,"nhan");
        myList2.addToIndex(2,"nhan");
        myList2.addToIndex(3,"nhan");
        myList2.addToIndex(4,"nhan");
        System.out.println("List: ");
        for(int i=0; i<myList2.size;i++){
            System.out.println(myList2.get(i));
        }
//        myList.clear();
//        System.out.println("List: ");
//        for(int i=0; i<myList.size;i++){
//            System.out.println(myList.get(i));
//        }
//        System.out.println(myList1.getSize());
//        System.out.println("List: ");
//        MyList1<String> clone = myList1.clone();
//        System.out.println(clone.contains("mot"));
//        System.out.println(clone.contains("hai"));
//        System.out.println(clone.get(3));
//        System.out.println(clone.getSize());
//        clone.clear();
//        System.out.println(clone.getSize());
//        System.out.println("List: ");
//        for(int i=0; i<clone.size;i++){
//            System.out.println(clone.get(i));
//        }
    }

}
