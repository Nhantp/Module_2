package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class Chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao USD:");
        int usd=scanner.nextInt();
        int vnd=usd*23000;
        System.out.println("Quy doi USD sang VND: "+vnd);
    }
}
