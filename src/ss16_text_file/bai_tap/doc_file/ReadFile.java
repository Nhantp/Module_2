package ss16_text_file.bai_tap.doc_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String FILE_NAME="D:\\Codegym\\A05\\Module_2\\src\\ss16_text_file\\bai_tap\\data";
    public static List<Country>readFile(){
        List<Country>countryList=new ArrayList<>();
        String line;
        try {
            FileReader fileReader=new FileReader(FILE_NAME);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                String[] temp=line.split(",");
                String id=temp[0];
                String code=temp[1];
                String name=temp[2];
                countryList.add(new Country(id,code,name));
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("Loi file");
        }
        return countryList;
    }

    public static void main(String[] args) {
        List<Country>countryList=ReadFile.readFile();
        for(Country country:countryList){
            System.out.println(country);
        }
    }
}
