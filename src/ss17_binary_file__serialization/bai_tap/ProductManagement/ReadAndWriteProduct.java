package ss17_binary_file__serialization.bai_tap.ProductManagement;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteProduct {
    List<Product>productList=new ArrayList<>();
    public  void writeFile(List<Product> productList,String filePath){
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
        }catch (IOException e){
            System.out.println("loi file viet");
        }
    }

    public  List<Product> readFile(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Loi file doc");
        }
        return productList;
    }
}
