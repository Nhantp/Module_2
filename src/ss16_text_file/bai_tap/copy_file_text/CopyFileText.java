package ss16_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static List<String> readFile(String filePath) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }

    public static void writeFile(String filePath, List<String> data) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

        for(String string:data){
            bufferedWriter.write(string);
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
    }
    public static void main(String[] args) throws IOException {
        List<String>stringList=CopyFileText.readFile("D:\\Codegym\\A05\\Module_2\\src\\ss16_text_file\\bai_tap\\copy_file_text\\data");
        for(String string:stringList){
            System.out.println(string);
        }
        writeFile("D:\\Codegym\\A05\\Module_2\\src\\ss16_text_file\\bai_tap\\copy_file_text\\result", stringList);
    }
}
