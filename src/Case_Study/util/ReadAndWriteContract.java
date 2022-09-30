package Case_Study.util;

import Case_Study.models.Booking;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class ReadAndWriteContract {
    Queue<Booking> bookingQueue = new LinkedList<>();

    public Queue<Booking> readContract(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            bookingQueue = (Queue<Booking>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return bookingQueue;
    }

    public void writeContract(Queue<Booking> bookingQueue, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bookingQueue);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}