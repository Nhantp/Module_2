package ss12_java_collection_framwork.service;

public interface IProductService {
    void addProduct();

    void editProduct(String id);

    void removeProduct(String id);

    void displayProduct();

    void searchProduct(String id);

    void sortProduct();
}
