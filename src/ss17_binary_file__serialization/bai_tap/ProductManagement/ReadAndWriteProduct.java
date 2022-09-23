//package ss17_binary_file__serialization.bai_tap.ProductManagement;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReadAndWriteProduct {
//    public static ProductService productService=new ProductService();
//    private static final String FILE_NAME= "D:\\Codegym\\A05\\Module_2\\src\\ss17_binary_file__serialization\\bai_tap\\ProductManagement\\data.dat";
//    public static void writeFile(List<Product>productList) throws IOException {
//        FileOutputStream fos=new FileOutputStream(FILE_NAME);
//        ObjectOutputStream oos= new ObjectOutputStream(fos);
//        oos.writeObject(productList);
//        oos.close();
//    }
//    public static List<Product> readFile() throws IOException, ClassNotFoundException {
//        FileInputStream fis=new FileInputStream(FILE_NAME);
//        ObjectInputStream ois=new ObjectInputStream(fis);
//        List<Product>productList=(List<Product>) ois.readObject();
//        return productList;
//    }
//
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        List<Product>productList=new ArrayList<>();
//            productList.add(new Product("1","banh","2022",10,"do"));
//            productList.add(new Product("2","banh","2022",10,"do"));
//            productList.add(new Product("3","banh","2022",10,"do"));
//            productList.add(new Product("4","banh","2022",10,"do"));
//            productList.add(new Product("5","banh","2022",10,"do"));
//        ReadAndWriteProduct.writeFile(productList);
//        productService.display();
//
//        }
//    }
