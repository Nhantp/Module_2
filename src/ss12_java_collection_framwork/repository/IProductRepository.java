package ss12_java_collection_framwork.repository;

import ss12_java_collection_framwork.model.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);

    List<Product> findAll();

    void editProduct(Product product);

    void removeProduct();

    void displayProduct();

    void searchProduct();

    void sortProduct();
}
