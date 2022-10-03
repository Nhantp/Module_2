package Case_Study.models;

import java.util.Scanner;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(int idCode, String name, int dateOfBirth, boolean gender, int phoneNumber, String email, String customerType, String address) {
        super(idCode, name, dateOfBirth, gender, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void infoCustomer() {
        Scanner scanner=new Scanner(System.in);
        infoPerson();
        System.out.println("Nhap vao loai khach hang: ");
        this.customerType = scanner.nextLine();
        System.out.println("Nhap vao dia chi: ");
        this.address = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                ", idCode=" + idCode +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
