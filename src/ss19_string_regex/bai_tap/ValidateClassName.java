package ss19_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        final String CLASSNAME_REGEX = "^[C|A|P]{1}[0-9]{4}[G|H|I|K|L|M]{1}$";
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap vao ten lop: ");
            String input = scanner.nextLine();
            if (pattern.matcher(input).find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Not valid");
            }
        }
    }
}
