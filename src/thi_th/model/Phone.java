package thi_th.model;

import java.util.Scanner;

public abstract class Phone {
    protected int id;
    protected String phoneName;
    protected double price;
    protected int amount;
    protected String producer;

    public Phone() {
    }

    public Phone(int id, String phoneName, double price, int amount, String producer) {
        this.id = id;
        this.phoneName = phoneName;
        this.price = price;
        this.amount = amount;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void info(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao id: ");
        this.id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ten dien thoai: ");
        this.phoneName=scanner.nextLine();
        System.out.println("Nhap vao gia ban: ");
        this.price=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao so luong: ");
        this.amount=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao nha san xuat: ");
        this.producer=scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ID=" + id +
                ", phoneName='" + phoneName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", producer='" + producer + '\'' +
                '}';
    }
}
