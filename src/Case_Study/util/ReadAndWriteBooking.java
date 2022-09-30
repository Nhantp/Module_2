package Case_Study.util;

import Case_Study.models.Booking;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteBooking {
    Set<Booking> bookingSet = new TreeSet<>();

    public Set<Booking> readBooking(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            bookingSet= (Set<Booking>) ois.readObject();

            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bookingSet;
    }

    public void writeBooking(Set<Booking> bookingSet, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bookingSet);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
