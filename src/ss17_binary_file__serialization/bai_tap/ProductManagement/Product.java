package ss17_binary_file__serialization.bai_tap.ProductManagement;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private String id;
    private String name;
    private String manufacturer;
    private double price;
    private String otherDescription;

    public Product() {
    }

    public Product(String id, String name, String manufacturer, double price, String otherDescription) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.otherDescription = otherDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "Mã sản phẩm: " + id +
                ", Tên sản phẩm: " + name  +
                ", Hãng sản xuất: " + manufacturer +
                ", Giá: " + price +
                ", Mô tả khác: " + otherDescription + "}";
    }

}
