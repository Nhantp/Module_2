package bt_them;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClassStudent {
    private String className;

    private static final List<Student> studentsList = new ArrayList<>();

    public ClassStudent(String className) {
        this.className = className;
    }

    public ClassStudent() {
    }

    static {
        studentsList.add(new Student("1", "nhan", "Quang Nam", 9.8));
        studentsList.add(new Student("2", "hung", "Quang Nam", 9.9));
        studentsList.add(new Student("3", "an", "Hue", 3));
        studentsList.add(new Student("4", "manh", "DN", 4));
        studentsList.add(new Student("5", "yen", "QB", 2));
        studentsList.add(new Student("6", "hu", "Quang Nam", 1));
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    Scanner scanner = new Scanner(System.in);

    public void inputClass() {
        System.out.println("Nhap vao so luong hoc sinh:");
        int sizes = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao lop:");
        this.className = scanner.nextLine();
        for (int i = 0; i < sizes; i++) {
            Student student = new Student();
            student.inputStudent();
            studentsList.add(student);
        }
    }

    public void displayClass() {
        System.out.println("Lop" + className);
        for (Student student : studentsList) {
            student.displayStudent();
        }
    }

    public void sortStudent() {
        Collections.sort(studentsList);
        for (Student student : studentsList) {
            System.out.println(student);
        }
    }

    public void countStudent(String address) {
        int count = 0;
        for (Student student : studentsList) {
            if (student.getAddress().equals(address)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void addPoint() {
        for (Student student : studentsList) {
            boolean check = student.getAdvantage() + 0.3 > 10;
            if (!check && student.getAddress().equals("Quang Nam")) {
                student.setAdvantage(student.getAdvantage() + 0.3);
                System.out.println(student);
            }
            if (check) {
                student.setAdvantage(10);
                System.out.println(student);
            }
        }
    }
}
