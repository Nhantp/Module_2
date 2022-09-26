package bai_tap_1.util;

import bai_tap_1.model.Teacher;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteTeacher {
    List<Teacher>teacherList=new ArrayList<>();
    public List<Teacher>readTeacher(String filePath) {
        ObjectInputStream ois=null;
        try {
            FileInputStream fis=new FileInputStream(filePath);
            ois=new ObjectInputStream(fis);
            teacherList=(List<Teacher>) ois.readObject();
            if (ois != null) ois.close();
        }catch (IOException e){
            System.out.println("Loi file doc");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return teacherList;
    }
    public void writeTeacher(List<Teacher>teacherList,String filePath) {
        ObjectOutputStream oos=null;
        try {
            FileOutputStream fis=new FileOutputStream(filePath);
            oos=new ObjectOutputStream(fis);
            oos.writeObject(teacherList);
        }catch (IOException e){
            System.out.println("Loi file ghi");
        }
        finally {
//            oos.close();
        }
    }
}
