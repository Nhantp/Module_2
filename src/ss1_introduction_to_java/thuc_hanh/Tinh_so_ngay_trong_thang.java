package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class Tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao thang:");
        int month = scanner.nextInt();
        String day;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day="31";
                break;
            case 2: {
               day="28,29";
            }
            break;
            case 4:
            case 6:
            case 9:
            case 11:
               day="30";
            default:
                day="";
        }
        if(!day.equals("")) {
            System.out.printf("Thang %d co %s",month,day+" ngay");
        }else {
            System.out.println("Nhap sai thang");
        }
    }
}