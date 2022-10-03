package Case_Study.Repository.impl;

import Case_Study.Repository.IBookingRepository;
import Case_Study.models.Booking;
import Case_Study.util.ReadAndWriteBooking;
import java.util.Set;

public class BookingRepository implements IBookingRepository {
    ReadAndWriteBooking readAndWriteBooking=new ReadAndWriteBooking();
    Set<Booking> bookingSet=readAndWriteBooking.readBooking(FILE_NAME);

    @Override
    public void addBooking(Booking booking) {
        bookingSet.add(booking);
        readAndWriteBooking.writeBooking(bookingSet,FILE_NAME);
    }

    @Override
    public Set<Booking> findAll() {
        return bookingSet;
    }
}
