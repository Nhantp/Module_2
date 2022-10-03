package Case_Study.util;

import Case_Study.models.Booking;

import java.io.*;
import java.util.*;

public class ReadAndWriteBooking {
    Set<Booking> bookingSet = new TreeSet<>();
    Booking booking=new Booking();

    public Set<Booking> readBooking(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            bookingSet= (Set<Booking>) ois.readObject();

            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Loi file");
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
