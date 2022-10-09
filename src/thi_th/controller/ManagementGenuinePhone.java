package thi_th.controller;

import thi_th.repository.IGenuinePhoneRepository;
import thi_th.service.CellPhoneService;
import thi_th.service.GenuinePhoneService;
import thi_th.service.ICellPhoneService;
import thi_th.service.IGenuinePhoneService;

import java.util.Scanner;

public class ManagementGenuinePhone {
    Scanner scanner = new Scanner(System.in);
    IGenuinePhoneService iGenuinePhoneService= new GenuinePhoneService();

    public void GenuinePhoneMenu() {
        do {
            System.out.println("1.Them moi");
            System.out.println("2.Xoa");
            System.out.println("3.Xem dien thoai");
            System.out.println("4.Tim kiem");
            System.out.println("5. Quay lai");
            System.out.println("Tim kiem chuc nang: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    iGenuinePhoneService.addGenuinePhone();
                    break;
                }
                case 2: {
                    System.out.println("Nhap vao id can xoa: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    iGenuinePhoneService.removeGenuinePhone(id);
                    break;
                }
                case 3: {
                    iGenuinePhoneService.displayGenuinePhone();
                    break;
                }
                case 4: {
                    System.out.println("Nhap vao id can tim kiem: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    iGenuinePhoneService.searchGenuinePhone(id);
                    break;
                }
                case 5:{
                    return;
                }
            }

        } while (true);
    }

}
