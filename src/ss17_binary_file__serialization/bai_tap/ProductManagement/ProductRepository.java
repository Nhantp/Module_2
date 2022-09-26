package ss17_binary_file__serialization.bai_tap.ProductManagement;


import java.util.List;

public class ProductRepository {
    ReadAndWriteProduct readAndWriteProduct=new ReadAndWriteProduct();
    private static final String FILE_NAME = "src/ss17_binary_file__serialization/bai_tap/ProductManagement/data.dat";
    List<Product>productList=readAndWriteProduct.readFile(FILE_NAME);
    public void add(Product product){
        productList.add(product);
        readAndWriteProduct.writeFile(productList,FILE_NAME);
    }
}
