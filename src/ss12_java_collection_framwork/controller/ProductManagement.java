package ss12_java_collection_framwork.controller;

import ss12_java_collection_framwork.model.Product;
import ss12_java_collection_framwork.service.IProductService;
import ss12_java_collection_framwork.service.ProductService;

import java.util.Scanner;

public class ProductManagement {
    private static final IProductService iProductService = new ProductService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Thêm sản phẩm.");
            System.out.println("2.Sửa sản phẩm theo id.");
            System.out.println("3.Xóa sản phẩm theo id.");
            System.out.println("4.Hiển thị sản phẩm.");
            System.out.println("5.Tìm kiếm sản phẩm.");
            System.out.println("6.Sắp xếp sản phẩm tăng dần theo giá.");
            System.out.println("7.Thoát");
            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: {
                    iProductService.addProduct();
                    break;
                }
                case 2: {
                    System.out.println("Nhập vào id cần sửa: ");
                    String id = scanner.nextLine();
                    iProductService.editProduct(id);
                    break;
                }
                case 3: {
                    System.out.println("Nhập vào id cần xóa");
                    String index = scanner.nextLine();
                    iProductService.removeProduct(index);
                    break;
                }
                case 4: {
                    iProductService.displayProduct();
                    break;
                }
                case 5: {
                    System.out.println("Nhập vào id cần tìm kiếm:");
                    String id = scanner.nextLine();
                    iProductService.searchProduct(id);
                    break;
                }
                case 6: {
                    iProductService.sortProduct();
                    break;
                }
                case 7: {
                    System.exit(0);

                }
            }
        } while (true);
    }
}
