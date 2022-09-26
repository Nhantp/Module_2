package ss17_binary_file__serialization.bai_tap.ProductManagement;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    ProductRepository productRepository=new ProductRepository();
    Product product = new Product();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("Nhap vao ma san pham: ");
        product.setId(scanner.nextLine());
        System.out.println("Nhap vao ten san pham: ");
        product.setName(scanner.nextLine());
        System.out.println("Nhap vao hang san xuat: ");
        product.setManufacturer(scanner.nextLine());
        System.out.println("Nhap vao gia san pham: ");
        product.setPrice(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap vao mo ta khac: ");
        product.setOtherDescription(scanner.nextLine());
        productRepository.add(product);
    }

    public void display() {
        for (Product product: productRepository.productList){
            System.out.println(product);
        }
    }

    public void search(String id) {
        Product product1=new Product();
        for(Product product: productRepository.productList){
            if(product.getId().equals(id)){
                product1=product;
            }
        }
        int index=productRepository.productList.indexOf(product1);
        if(index!=-1){
            System.out.println(product1);
        }else {
            System.out.println("Not found");
        }
    }

}
