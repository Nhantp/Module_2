package Case_Study.models;

import org.omg.CORBA.INTERNAL;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Booking implements Serializable,Comparable<Booking> {
    private int idBooking;
    private int dateStart;
    private int dateEnd;
    private Customer customer;
    private String serviceName;

    public Booking() {
    }

    public Booking(int idBooking, int dateStart, int dateEnd, Customer customer, String serviceName) {
        this.idBooking = idBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.customer = customer;
        this.serviceName = serviceName;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getDateStart() {
        return dateStart;
    }

    public void setDateStart(int dateStart) {
        this.dateStart = dateStart;
    }

    public int getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(int dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public void input(){
        Customer customer=new Customer();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao ma booking: ");
        this.idBooking=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ngay bat dau: ");
        this.dateStart=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ngay ket thuc: ");
        this.dateEnd=Integer.parseInt(scanner.nextLine());
        customer.infoCustomer();
        System.out.println("Nhap vao ten dich vu: ");
        this.serviceName=scanner.nextLine();
//        System.out.println("Nhap vao loai dich vu: ");
//        this.serviceType=scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        return this.dateStart=o.dateStart;
    }



    @Override
    public int hashCode() {
        return Objects.hash(dateStart, dateEnd);
    }
}

