package ss17_binary_file__serialization.bai_tap.ProductManagement;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner=new Scanner(System.in);
        ProductService productService=new ProductService();
        do{
            System.out.println("1.Nhap san pham.");
            System.out.println("2.Hien thi san pham.");
            System.out.println("3.Tim kiem san pham.");
            System.out.println("Nhap vao lua chon.");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    productService.add();
                    break;
                }
                case 2:{
                    productService.display();
                    break;
                }
                case 3:{
                    System.out.println("Nhap vao id can tim kiem: ");
                    String id=scanner.nextLine();
                    productService.search(id);
                }
            }
        }while (true);
    }
}
