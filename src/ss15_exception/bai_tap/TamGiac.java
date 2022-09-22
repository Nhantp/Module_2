package ss15_exception.bai_tap;

import java.util.Scanner;

public class TamGiac {

    public void checkException(int a, int b, int c) throws TriangleException{
        if(a+b<=c|| b+c<=a|| a+c<=b){
            throw new TriangleException("Loi: 2 canh cong be hon hoac bang 1 canh");
        }else {
            System.out.println("Hop le.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TamGiac tamGiac=new TamGiac();
        try {

            System.out.println("Nhap vao canh 1: ");
            int a = scanner.nextInt();
            System.out.println("Nhap vao canh 2: ");
            int b = scanner.nextInt();
            System.out.println("Nhap vao canh 3: ");
            int c = scanner.nextInt();
            try {
                tamGiac.checkException(a,b,c);
            } catch (TriangleException e) {
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println("Khong dung dinh dang.");
        }

    }
}
