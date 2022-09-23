package ss17_binary_file__serialization.thuc_hanh;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

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
            outputStream.close();
        }

    }
    public static void copyFileUsingJava7Files(File source, File dest)throws IOException{
       Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);


    }

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao file nguon:");
        String sourcePath=scanner.nextLine();
        System.out.println("Nhap vao file dich:");
        String destPath=scanner.nextLine();
        File sourceFile=new File(sourcePath);
        File destFile=new File(destPath);
        try {
            copyFileUsingJava7Files(sourceFile,destFile);
            copyFileUsingStream(sourceFile,destFile);
        }catch (IOException e){
            System.out.println("Loi file");
            System.out.println(e.getMessage());
        }
    }
}
