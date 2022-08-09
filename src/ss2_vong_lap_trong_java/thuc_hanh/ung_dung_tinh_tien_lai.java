package ss2_vong_lap_trong_java.thuc_hanh;
import java.util.Scanner;
public class ung_dung_tinh_tien_lai {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so tien gui:");
        int tienGui=scanner.nextInt();
        System.out.println("Nhap vao lai suat theo thang:");
        float laiSuat=scanner.nextFloat();
        System.out.println("Nhap vao so thang:");
        int thang=scanner.nextInt();

        double tienLai=tienGui*(laiSuat/100)/12*thang;
        System.out.println("Tien lai:"+tienLai);
    }
}
