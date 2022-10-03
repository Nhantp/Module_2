package Case_Study.Repository;

import Case_Study.models.Booking;

import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public interface IBookingRepository {
    String FILE_NAME="D:\\Codegym\\A05\\Module_2\\src\\Case_Study\\Data\\booking.dat";
    void addBooking(Booking booking);
    Set<Booking>findAll();
}
