package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class Hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao ten cua ban:");
        String name= scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
