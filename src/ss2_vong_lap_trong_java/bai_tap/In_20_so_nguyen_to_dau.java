package ss2_vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class In_20_so_nguyen_to_dau {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so luong van in:");
        int size=scanner.nextInt();
        int count=0;
        int n=2;
        while (count<size){
            boolean check=true;
            for (int i=2; i<=n/2;i++) {
                if (n % i == 0) {
                    check = false;
                }
                }
            if(check){
                System.out.println(" "+n);
                count++;
            }
            n++;
            }
        }
    }
