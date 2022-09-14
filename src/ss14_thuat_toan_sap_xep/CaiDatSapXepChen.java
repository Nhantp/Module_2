package ss14_thuat_toan_sap_xep;

import java.util.Scanner;

public class CaiDatSapXepChen {
    static Scanner scanner=new Scanner(System.in);
    private int a;

    public CaiDatSapXepChen(int a) {
        this.a = a;
    }

    public CaiDatSapXepChen() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void input(int[] list){
        for (int i=0; i<list.length; i++){
            System.out.println("Nhap vao phan tu thu: "+(i+1));
            int a=scanner.nextInt();
            list[i]= new CaiDatSapXepChen(a).getA();
        }
    }
    public void insertionSort(int[] list){
        int pos,x;
        for(int i=0; i<list.length; i++){
            x=list[i];
            pos=i;
            while(pos>0&&x<list[pos-1]){
                list[pos]=list[pos-1];
                pos--;
            }
            list[pos]=x;
        }
    }
    public void display(int[] list){
        for(int i:list){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap vao so luong: ");
        int sizes=scanner.nextInt();
        int[] list=new int[sizes];
        CaiDatSapXepChen caiDatSapXepChen=new CaiDatSapXepChen();
        caiDatSapXepChen.input(list);
        caiDatSapXepChen.insertionSort(list);
        caiDatSapXepChen.display(list);
    }
}
