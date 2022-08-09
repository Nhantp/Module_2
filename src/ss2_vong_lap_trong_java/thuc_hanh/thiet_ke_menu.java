package ss2_vong_lap_trong_java.thuc_hanh;
import java.util.Scanner;
public class thiet_ke_menu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("\n"+"1.Ve hinh chu nhat"+"\n"+"2.Ve hinh vuong"+"\n"+"3.Ve tam giac"+"\n"+"Nhap vao lua chon:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Hinh chu nhat:");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                break;
            }
            case 2:{
                System.out.println("Hinh vuong:");
                System.out.println("* * * *");
                System.out.println("* * * *");
                System.out.println("* * * *");
                System.out.println("* * * *");
                break;
            }
            case 3:{
                System.out.println("Hinh tam giac:");
                System.out.println("* * * * *");
                System.out.println("* * * * ");
                System.out.println("* * * ");
                System.out.println("* * ");
                System.out.println("* ");
            }
        }
    }
}
