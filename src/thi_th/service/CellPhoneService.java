package thi_th.service;

import thi_th.model.CellPhone;
import thi_th.repository.ICellPhoneRepository;
import thi_th.repository.impl.CellPhoneRepository;

import java.util.List;

public class CellPhoneService implements ICellPhoneService {
    ICellPhoneRepository iCellPhoneRepository = new CellPhoneRepository();
    List<CellPhone> cellPhoneList = iCellPhoneRepository.findAll();

    public void addCellPhone() {
        CellPhone cellPhone = new CellPhone();
        cellPhone.infoCellPhone();
        iCellPhoneRepository.addCellPhone(cellPhone);
    }

    @Override
    public void displayCellPhone() {
        for (CellPhone cellPhone:cellPhoneList){
            System.out.println(cellPhone);
        }
    }

    @Override
    public void removeCellPhone(int id) {
        CellPhone cellPhoneObj = null;
        for (CellPhone cellPhone : cellPhoneList) {
            if (cellPhone.getId() == id) {
                cellPhoneObj=cellPhone;
                break;
            }
        }
        if (cellPhoneObj != null) {
            iCellPhoneRepository.remove(cellPhoneObj);
            System.out.println("Xoa thanh cong: ");
        } else {
            System.out.println("Not found");
        }
    }

    @Override
    public void searchCellPhone(int id) {
            CellPhone cellPhoneObj = null;
            for (CellPhone cellPhone : cellPhoneList) {
                if (cellPhone.getId() == id) {
                    cellPhoneObj=cellPhone;
                }
            }
            if (cellPhoneObj != null) {
                System.out.println(cellPhoneObj);
                System.out.println("Tim kiem thanh cong: ");
            } else {
                System.out.println("Not found");
            }
    }

}

