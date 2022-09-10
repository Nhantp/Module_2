package ss10_danh_sach.thuc_hanh.trien_khai_lop_linkedlist;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    private class Node{
        private Node next;
        private Object data;
        public Object getData(){
            return this.data;
        }
        public Node(Object data) {
        }
    }
    public void add(int index,Object data){
        Node temp= head;
        Node holder;
        for(int i=0; i< index-1&& temp.next!=null; i++){
            temp=temp.next;
        }
        holder=temp.next;
        temp.next =new Node(data);
        temp.next.next =holder;
        numNodes++;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }


    public static void main(String[] args) {
        System.out.println("----------TEST---------");
        MyLinkedList linkedList=new MyLinkedList(10);
        linkedList.addFirst(1);
        linkedList.add(1,4);
        linkedList.add(2,4);
        linkedList.add(3,4);
        linkedList.printList();


    }
}
