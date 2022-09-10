package ss12_java_collection_framwork.repository;

import ss12_java_collection_framwork.model.Product;

import java.util.ArrayList;
import java.util.List;
public class ProductRepository implements IProductRepository {
    private static final List<Product> productList=new ArrayList<>();
    static {
        productList.add(new Product("3","banh",32000,10,"10/9/2022"));
        productList.add(new Product("7","keo",41000,10,"10/9/2022"));
        productList.add(new Product("55","kem",15000,10,"10/9/2022"));
        productList.add(new Product("78","xe",60000,10,"10/9/2022"));
        productList.add(new Product("32","mu",7000,10,"10/9/2022"));
        productList.add(new Product("24","ao",82000,10,"10/9/2022"));
    }
    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void editProduct(Product product) {

    }

    @Override
    public void removeProduct() {

    }

    @Override
    public void displayProduct() {

    }

    @Override
    public void searchProduct() {

    }

    @Override
    public void sortProduct() {

    }
}
