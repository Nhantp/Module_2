package ss4_lop_va_doi_tuong.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao ax^2: ");
        int a=scanner.nextInt();
        System.out.print("Nhap vao bx: ");
        int b=scanner.nextInt();
        System.out.print("Nhap vao c: ");
        int c=scanner.nextInt();

        PhuongTrinhBacHai bacHai= new PhuongTrinhBacHai(a,b,c);
        if(bacHai.getDiscriminant()<0){
            System.out.println("Phuong trinh vo nghiem.");
        }else if(bacHai.getDiscriminant()==0){
            System.out.println("Phuong trinh co 1 nghiem: "+bacHai.getRoot3());
        }else {
            System.out.println("Nghiem thu 1 :"+bacHai.getRoot1());
            System.out.println("Nghiem thu 2 :"+bacHai.getRoot2());
        }
    }
}
