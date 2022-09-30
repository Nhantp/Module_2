package Case_Study.Repository.impl;

import Case_Study.Repository.IBookingRepository;
import Case_Study.models.Booking;
import Case_Study.util.ReadAndWriteBooking;
import Case_Study.util.ReadAndWriteContract;

import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    ReadAndWriteBooking readAndWriteBooking=new ReadAndWriteBooking();
    ReadAndWriteContract readAndWriteContract=new ReadAndWriteContract();
    Set<Booking> bookingSet=readAndWriteBooking.readBooking(FILE_NAME);
    Queue<Booking>bookingQueue= readAndWriteContract.readContract(FILE_NAME);

    @Override
    public void addBooking(Booking booking) {
        bookingSet.add(booking);
        readAndWriteBooking.writeBooking(bookingSet,FILE_NAME);
    }

    @Override
    public void addContracts(Booking booking) {
        bookingQueue.add(booking);
        readAndWriteContract.writeContract(bookingQueue,FILE_NAME);
    }

    @Override
    public Set<Booking> findAll() {
        return bookingSet;
    }

    @Override
    public Queue<Booking> getAll() {
        return bookingQueue;
    }
}
