package bai_tap_1.service.impl;

import bai_tap_1.model.Teacher;
import bai_tap_1.repository.ITeacherRepository;
import bai_tap_1.repository.impl.TeacherRepository;
import bai_tap_1.service.ITeacherService;

import java.util.List;
import java.util.Scanner;


public class TeacherService implements ITeacherService {
    ITeacherRepository iTeacherRepository = new TeacherRepository();
    List<Teacher> teacherList = iTeacherRepository.getAll();
    Scanner scanner = new Scanner(System.in);
    Teacher teacher = new Teacher();

    @Override
    public void add() {
        teacher.infoTeacher();
        iTeacherRepository.add(teacher);
    }

    @Override
    public void remove(int id) {
        Teacher teacherObj = null;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == id) {
                teacherObj = teacher;
            }
        }
        if (teacherObj != null) {
            teacherList.remove(teacherObj);
            System.out.println("Xoa thanh cong.");
        } else {
            System.out.println("Not found");
        }
    }

    @Override
    public void display() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void edit(int id) {
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == id) {
                do {
                    System.out.println("1.sua ten");
                    System.out.println("2.return");
                    System.out.println("Nhap vao lua chon: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1: {
                            System.out.println("Nhap vao ten can sua: ");
                            String name = scanner.nextLine();
                            teacher.setName(name);
                            iTeacherRepository.edit();
                            break;
                        }
                        case 2:{
                            return;
                        }
                    }
                } while (true);
            }
        }

    }
}
