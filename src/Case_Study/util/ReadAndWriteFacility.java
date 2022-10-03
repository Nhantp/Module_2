package Case_Study.util;

import Case_Study.Service.impl.FacilityService;
import Case_Study.models.Facility;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteFacility {
    Map<Facility,Integer>linkedHashMap=new LinkedHashMap<>();
    public Map<Facility,Integer> readFacility(String filePath){
        try {
            FileInputStream fis=new FileInputStream(filePath);
            ObjectInputStream ois=new ObjectInputStream(fis);
            linkedHashMap = (Map<Facility, Integer>)ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException e){
            System.out.println("Loi file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return linkedHashMap;
    }
    public void writeFacility(Map<Facility,Integer> linkedHashMap,String filePath){
        try {
            FileOutputStream fos=new FileOutputStream(filePath);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(linkedHashMap);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Loi file ghi");
        }
    }
}
