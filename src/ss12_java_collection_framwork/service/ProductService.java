package ss12_java_collection_framwork.service;
import ss12_java_collection_framwork.model.Product;
import ss12_java_collection_framwork.repository.IProductRepository;
import ss12_java_collection_framwork.repository.ProductRepository;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final IProductRepository iProductRepository = new ProductRepository();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        Product product = this.infoProduct();
        iProductRepository.addProduct(product);
    }

    @Override
    public void editProduct(String id) {
        List<Product> productList = iProductRepository.findAll();
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                do {
                    System.out.println("1.Sửa id.");
                    System.out.println("2.Sửa tên");
                    System.out.println("3.Sửa giá.");
                    System.out.println("4.Sửa số lượng.");
                    System.out.println("5.Sửa ngày sản xuất.");
                    System.out.println("6.Quay lại.");
                    System.out.println("7.Nhập vào lựa chọn.");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1: {
                            System.out.println("Nhập vào id:");
                            String idCode = scanner.nextLine();
                            product.setId(idCode);
                            break;
                        }
                        case 2: {
                            System.out.println("Nhập vào tên:");
                            String name = scanner.nextLine();
                            product.setName(name);
                            break;
                        }
                        case 3: {
                            System.out.println("Nhập vào giá:");
                            double price = Double.parseDouble(scanner.nextLine());
                            product.setPrice(price);
                            break;
                        }
                        case 4: {
                            System.out.println("Nhập vào số lượng:");
                            int amount = Integer.parseInt(scanner.nextLine());
                            product.setAmount(amount);
                            break;
                        }
                        case 5: {
                            System.out.println("Nhập vào hạn sử dụng:");
                            String expiry = scanner.nextLine();
                            product.setExpiry(expiry);
                            break;
                        }
                        case 6: {
                            return;
                        }
                    }

                } while (true);
            }
        }

    }

    @Override
    public void removeProduct(String id) {
        List<Product> productList = iProductRepository.findAll();
        int index = productList.indexOf(new Product(id));
        if (index != -1) {
            productList.remove(index);
        } else {
            System.out.println("Id empty");
        }

    }

    @Override
    public void displayProduct() {
        List<Product> productList = iProductRepository.findAll();
        for (Product product : productList) {
            System.out.println(product);
        }

    }

    @Override
    public void searchProduct(String id) {
        List<Product> productList = iProductRepository.findAll();
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                System.out.println(product);
            }
        }

    }

    @Override
    public void sortProduct() {
        List<Product> productList = iProductRepository.findAll();
        Collections.sort(productList);
        for (Product product : productList) {
            System.out.println(product);
        }

    }

    public Product infoProduct() {
        System.out.println("Nhập vào id:");
        String id = scanner.nextLine();
        System.out.println("Nhập vào tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào giá:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào số lượng:");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào hạn sử dụng:");
        String expiry = scanner.nextLine();

        return new Product(id, name, price, amount, expiry);

    }

}
