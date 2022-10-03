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
        Booking booking=new Booking();
        booking.input();
        iBookingRepository.addBooking(booking);
    }

    @Override
    public void displayBooking() {
        Set<Booking> bookingTreeSet= iBookingRepository.findAll();
        for (Booking booking:bookingTreeSet){
            System.out.println(booking);
        }
    }




}
