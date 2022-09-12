package bt_them;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ClassStudent classStudent = new ClassStudent();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------QUAN LY HOC SINH---------");
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Hien thi danh sach sinh vien");
            System.out.println("3.Sap xep sinh vien theo ten");
            System.out.println("4.Dem hoc sinh Hue");
            System.out.println("5.Cong diem hoc sinh QN");
            System.out.println("Nhap vao lua chon:");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: {
                    classStudent.inputClass();
                    break;
                }
                case 2: {
                    classStudent.displayClass();
                    break;
                }
                case 3: {
                    classStudent.sortStudent();
                    break;
                }
                case 4: {
                    String address = "Hue";
                    classStudent.countStudent(address);
                }
                case 5: {
                    classStudent.addPoint();
                }
            }
        } while (true);
    }
}
