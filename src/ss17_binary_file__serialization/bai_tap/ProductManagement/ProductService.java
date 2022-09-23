package ss17_binary_file__serialization.bai_tap.ProductManagement;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.swing.event.ListDataEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService{
    private static final String FILE_NAME= "D:\\Codegym\\A05\\Module_2\\src\\ss17_binary_file__serialization\\bai_tap\\ProductManagement\\data.dat";
    private static List<Product>productList=new ArrayList<>();
    Product product=new Product();
    Scanner scanner=new Scanner(System.in);
    public void add() throws IOException {
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
        productList.add(product);
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
        }catch (IOException e){
            System.out.println("loi file");
        }
    }

    public  void display(){
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            for(Product product:productList){
                System.out.println(product);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Loi file");
        }
    }
    public void search(){
        System.out.println("Nhap vao id can tim kiem: ");
        String id=scanner.nextLine();
        try {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(FILE_NAME));
        productList=(List<Product>) ois.readObject();
            for (Product product : productList) {
                if (product.getId().equals(id)) {
                    System.out.println(product);
                }
            }
        }catch (IOException e){
            System.out.println("loi file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
