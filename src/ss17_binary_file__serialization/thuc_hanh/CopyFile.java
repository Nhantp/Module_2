package ss17_binary_file__serialization.thuc_hanh;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
             inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            inputStream.close();
        }

    }
    public static void copyFileUsingJava7Files(File source, File dest)throws IOException{
       Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);


    }

    public static void main(String[] args) throws IOException {
        File sourceFile= new File("D:\\Codegym\\A05\\Module_2\\src\\ss17_binary_file__serialization\\thuc_hanh\\data.dat");
        File destFile=new File("D:\\Codegym\\A05\\Module_2\\src\\ss17_binary_file__serialization\\thuc_hanh\\result.dat");
        try {
            copyFileUsingJava7Files(sourceFile,destFile);
        }catch (IOException e){
            System.out.println("Loi file");
            System.out.println(e.getMessage());
        }
    }
}
