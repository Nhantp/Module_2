package Case_Study.util;

import Case_Study.models.Booking;
import Case_Study.models.Contract;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class ReadAndWriteContract {
    Queue<Contract> contractQueue = new LinkedList<>();

    public Queue<Contract> readContract(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            contractQueue = (Queue<Contract>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException e) {
            System.out.println("Loi file doc");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return contractQueue;
    }

    public void writeContract(Queue<Contract> contractQueue, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(contractQueue);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}