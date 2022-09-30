package Case_Study.Service.impl;

import Case_Study.Repository.IBookingRepository;
import Case_Study.Repository.impl.BookingRepository;
import Case_Study.Service.IBookingService;
import Case_Study.models.Booking;

import java.util.*;

public class BookingService implements IBookingService {
    IBookingRepository iBookingRepository=new BookingRepository();
    Scanner scanner=new Scanner(System.in);

    @Override
    public void addBooking() {
        Booking booking=this.infoBooking();
        iBookingRepository.addBooking(booking);
    }

    @Override
    public void addContracts() {
        Booking booking=this.infoContracts();
        iBookingRepository.addContracts(booking);
    }

    @Override
    public void displayBooking() {
        Set<Booking> bookingTreeSet=iBookingRepository.findAll();
        for (Booking booking:bookingTreeSet){
            System.out.println(booking);
        }
    }

    @Override
    public void displayContracts() {
        Queue<Booking>bookingQueue=iBookingRepository.getAll();
        for (Booking booking:bookingQueue){
            System.out.println(booking);
        }
    }

    public Booking infoBooking(){
        System.out.println("Nhap vao ma booking: ");
        String idBooking=scanner.nextLine();
        System.out.println("Nhap vao ngay bat dau: ");
        String dateStart=scanner.nextLine();
        System.out.println("Nhap vao ngay ket thuc: ");
        String dateEnd=scanner.nextLine();
        System.out.println("Nhap vao ma khach hang: ");
        String idCustomer=scanner.nextLine();
        System.out.println("Nhap vao ten dich vu: ");
        String serviceName=scanner.nextLine();
        System.out.println("Nhap vao loai dich vu: ");
        String serviceType=scanner.nextLine();
        return new Booking(idBooking,dateStart,dateEnd,idCustomer,serviceName,serviceType);
    }
    public Booking infoContracts(){
        System.out.println("Nhap vao so hop dong: ");
        int someContracts=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ma booking: ");
        String idBooking=scanner.nextLine();
        System.out.println("Nhap vao so tien coc truoc: ");
        double advanceDeposit=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao tong tien thanh toan: ");
        double totalPayment=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao ma khach hang: ");
        String idCustomer=scanner.nextLine();

        return new Booking(someContracts,idBooking,advanceDeposit,totalPayment,idCustomer);
    }


}
