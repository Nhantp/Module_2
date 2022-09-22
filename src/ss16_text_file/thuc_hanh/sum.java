package ss16_text_file.thuc_hanh;

import java.io.*;

public class sum {
    public void readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line="";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Loi file");
        }
    }

    public void writeFile(String filePath ) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(new BufferedWriter(writer));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Loi file");
        }
    }

    public static void main(String[] args) {
        sum sum = new sum();
        sum.readFile("src/ss16_text_file/thuc_hanh/number");
        sum.writeFile("src/ss16_text_file/thuc_hanh/result");
    }
}
