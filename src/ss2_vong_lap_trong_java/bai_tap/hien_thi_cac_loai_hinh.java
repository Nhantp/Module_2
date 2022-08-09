package ss2_vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.In hinh chu nhat\n"+"2.In hinh tam giac\n"+
                "  1.top-left\n"+"  2.top-right\n"+"  3.botton-left\n"+
                "3.In hinh tam giac can\n" +"4.Exit\n"+"Nhap vao lua chon:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Nhap vao chieu dai:");
                int height=scanner.nextInt();
                System.out.println("Nhap vao chieu rong:");
                int width=scanner.nextInt();
                for (int i=0; i<height;i++ ){
                    for (int j=0; j<width;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            }
            case 2:{
                System.out.println("Nhap vao lua chon ve tam giac:");
                int input=scanner.nextInt();
                switch (input){
                    case 1:{
                        System.out.println("Nhap vao kich thuoc:");
                        int size1=scanner.nextInt();
                        for(int i=0; i<size1;i++){
                            for (int j=0; j<=i;j++){
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                    }
                    case 2:{
                        System.out.println("Nhap vao kich thuoc:");
                        int size2=scanner.nextInt();
                        for(int i=size2; i>0; i--){
                            for(int j=0; j<size2; j++){
                               if(j>=i){
                                   System.out.print("*");
                               }else {
                                   System.out.print(" ");
                               }
                            }
                            System.out.print("\n");
                        }
                    }
                    case 3:{
                        System.out.println("Nhap vao kich thuoc:");
                        int size3=scanner.nextInt();
                        for(int i=size3; i>0; i--){
                            for (int j=0; j<size3; j++){
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                    }
                }
            }
            case 3:{
                System.out.println("Nhap vao kich thuoc:");
                int size=scanner.nextInt();
                for(int i=1; i<=size; i++){
                    for (int j=1; j<=2*size-1;j++){
                        if(j>=size-i+1&&j<=size+i-1){
                            System.out.print("*");
                        }else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
        }
    }
}
