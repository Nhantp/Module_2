package Case_Study.util;

import Case_Study.models.Promotion;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWritePromotion {
    Set<Promotion>promotionSet=new TreeSet<>();
    public Set<Promotion>readPromotion(String filePath){
        try {
            FileInputStream fis=new FileInputStream(filePath);
            ObjectInputStream ois=new ObjectInputStream(fis);
            promotionSet= (Set<Promotion>) ois.readObject();
        }catch (IOException e){
            System.out.println("Loi file doc.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return promotionSet;
    }
    public void writePromotion(Set<Promotion>promotionSet,String filePath){
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(promotionSet);
        }catch (IOException e){
            System.out.println("Loi file ghi.");
        }
    }
}
