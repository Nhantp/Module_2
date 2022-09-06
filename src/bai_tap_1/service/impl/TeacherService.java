package bai_tap_1.service.impl;

import bai_tap_1.model.Teacher;
import bai_tap_1.repository.ITeacherRepository;
import bai_tap_1.repository.impl.TeacherRepository;
import bai_tap_1.service.ITeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static final Scanner scanner = new Scanner(System.in);
    private final ITeacherRepository iTeacherRepository = new TeacherRepository();

    @Override
    public void add() {
        Teacher teacher = this.infoTeacher();
        iTeacherRepository.add(teacher);
    }

    @Override
    public void remove() {
        List<Teacher> teacherList = iTeacherRepository.getAll();
        System.out.println("Nhap vao giang vien can xoa:");
        int removeTeacher = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < teacherList.size(); i++) {
            if(removeTeacher==teacherList.get(i).getId()){
                teacherList.remove(i);
            }
        }
    }

    @Override
    public void display() {
        List<Teacher> teacherList=iTeacherRepository.getAll();
        for(Teacher teacher:teacherList){
            System.out.println(teacher);
        }

    }

    private Teacher infoTeacher() {
        System.out.println("Nhap vao id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ten:");
        String name = scanner.nextLine();
        System.out.println("Nhap vao ngay sinh:");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhap vao gioi tinh:");
        String gender = scanner.nextLine();
        System.out.println("Nhap vao trinh do chuyen mon:");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, specialize);
        return teacher;
    }

}
