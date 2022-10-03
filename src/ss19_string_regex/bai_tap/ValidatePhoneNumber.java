package ss19_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        final String PHONENUMBER_REGEX="^\\([0-9]{2}\\)\\-\\([0]{1}[0-9]{9}\\)$";
        Pattern pattern= Pattern.compile(PHONENUMBER_REGEX);
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Nhap vao so dien thoai: ");
            String phoneNumber=scanner.nextLine();
            if (pattern.matcher(phoneNumber).find()){
                System.out.println("Phone Number is oke");
            }
            else {
                System.out.println("Phone number not oke");
            }
        }
    }
}
