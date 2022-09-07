package bai_tap_2.service.impl;


import bai_tap_2.model.MotoBike;
import bai_tap_2.repository.IMotoBikeRepository;
import bai_tap_2.repository.impl.MotoBikeRepository;
import bai_tap_2.service.IMotoBikeService;

import java.util.List;
import java.util.Scanner;

public class MotoBikeService implements IMotoBikeService {
    private static final IMotoBikeRepository iMotoBikeRepository=new MotoBikeRepository();
    private static final Scanner scanner=new Scanner(System.in);
    @Override
    public void displayMotoBike() {
        List<MotoBike>motoBikeList=iMotoBikeRepository.getAll();
        for (MotoBike motoBike:motoBikeList){
            System.out.println(motoBike);
        }
    }

    @Override
    public void addMotoBike() {
        MotoBike motoBike=this.infoMotoBike();
        iMotoBikeRepository.addMotoBike(motoBike);
    }

    @Override
    public void searchMotoBike(String bienSoXe) {
        List<MotoBike> motoBikeList=iMotoBikeRepository.getAll();
        for (MotoBike motoBike:motoBikeList){
            if(motoBike.getBienSoXe().equals(bienSoXe)){
                System.out.println(motoBike);
            }
        }

    }
    public MotoBike infoMotoBike() {
        System.out.println("Nhập vào biển kiểm soát: ");
        String bienSoXe = scanner.nextLine();
        System.out.println("Nhập vào tên hãng sản xuất: ");
        String tenHang = scanner.nextLine();
        System.out.println("Nhập vào năm sản xuất: ");
        String namSanXuat = scanner.nextLine();
        System.out.println("Nhập vào chủ sở hữu: ");
        String nguoiSoHuu = scanner.nextLine();
        System.out.println("Nhập vào số chỗ ngồi: ");
        Double congSuat = Double.parseDouble(scanner.nextLine());
        return new MotoBike(bienSoXe,tenHang,namSanXuat,nguoiSoHuu,congSuat);
    }
}
