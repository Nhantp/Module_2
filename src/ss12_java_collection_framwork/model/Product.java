package ss12_java_collection_framwork.model;


public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private double price;
    private int amount;
    private String expiry;

    public Product() {
    }

    public Product(String id, String name, double price, int amount, String expiry) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.expiry = expiry;
    }

    public Product(String id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Mã hàng=" + id +
                ", Tên='" + name + '\'' +
                ", Giá=" + price +
                ", Số lượng=" + amount +
                ", Ngày hết hạn'" + expiry + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }


    @Override
    public int compareTo(Product o) {
        return (int) (this.getPrice() - o.getPrice());
    }
}
