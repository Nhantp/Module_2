package ss16_text_file.thuc_hanh.doc_ghi_file_student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void fileWrite(String pathFile, String line){

        try {
            FileWriter fileWriter=new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            bufferedWriter.newLine();

            bufferedWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<String> readFile(String pathFile){
        List<String>listLine=new ArrayList<>();
        try {

            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return listLine;
    }
}
