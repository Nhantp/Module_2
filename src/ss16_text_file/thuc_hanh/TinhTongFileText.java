package ss16_text_file.thuc_hanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TinhTongFileText {
    public void readFileText(String filePath){
        try {
            File file=new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            reader.close();
            System.out.println("Tong: "+sum);
        }catch (Exception e){
            System.out.println("File ko ton tai.");
        }
    }

    public static void main(String[] args) {
//        System.out.println("Nhập đường dẫn file: ");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
//
        TinhTongFileText tinhTongFileText=new TinhTongFileText();
        tinhTongFileText.readFileText("D:\\Codegym\\A05\\Module_2\\src\\ss16_text_file\\thuc_hanh\\number");

    }
}
