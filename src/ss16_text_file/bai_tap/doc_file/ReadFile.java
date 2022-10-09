package ss16_text_file.bai_tap.doc_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String FILE_NAME="D:\\Codegym\\A05\\Module_2\\src\\ss16_text_file\\bai_tap\\data";
    public static List<Country>readFile() {
            List<Country>countryList= new ArrayList<>();
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(FILE_NAME);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                String temp[];
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    int id = Integer.parseInt(temp[0]);
                    String code = temp[1];
                    String name = temp[2];
                    Country country=new Country(id, code, name);
                    countryList.add(country);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return countryList;
        }

        public static void writeListCSV (List < Country > countryList) throws IOException {
            FileWriter fileWriter = new FileWriter(FILE_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String str = "";
            for (Country country :countryList ) {
                str += country.getId() + "," + country.getCode() + "," + country.getName() + "\n";
            }
            if (str != null && !str.isEmpty()) {
                bufferedWriter.write(str);
            }
            bufferedWriter.close();
        }

        public static void main (String[]args){
            List<Country> countryList= readFile();
            for (Country country : countryList) {
                System.out.println(country);
            }
        }
    }