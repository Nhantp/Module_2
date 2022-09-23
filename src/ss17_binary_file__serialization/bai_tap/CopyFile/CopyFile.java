package ss17_binary_file__serialization.bai_tap.CopyFile;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    private static void copy(File source,File dest) throws IOException {
        try {
            InputStream is=new FileInputStream(source);
            OutputStream os=new FileOutputStream(dest);
            byte[] buffer =new byte[1024];
            int length;
            while ((length=is.read())>0){
                os.write(buffer,0,length);
            }
        }catch (IOException e){
            System.out.println("Loi file");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao file nguon: ");
        String sourcePath=scanner.nextLine();
        System.out.println("Nhap vao file dich:");
        String destPath=scanner.nextLine();
        File sourceFile=new File(sourcePath);
        File destFile=new File(destPath);
        try {
            copy(sourceFile,destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
