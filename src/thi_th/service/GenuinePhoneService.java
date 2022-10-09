package thi_th.service;

import thi_th.model.CellPhone;
import thi_th.model.GenuinePhone;
import thi_th.repository.IGenuinePhoneRepository;
import thi_th.repository.impl.GenuineRepository;
import thi_th.util.ReadAndWriteCellPhone;
import thi_th.util.ReadAndWriteGenuinePhone;

import java.util.List;

public class GenuinePhoneService implements IGenuinePhoneService {
    IGenuinePhoneRepository iGenuinePhoneRepository=new GenuineRepository();
    List<GenuinePhone>genuinePhoneList=iGenuinePhoneRepository.findAll();


    public void addGenuinePhone() {
        GenuinePhone genuinePhone = new GenuinePhone();
        genuinePhone.infoGenuinePhone();
        iGenuinePhoneRepository.addGenuinePhone(genuinePhone);
    }

    @Override
    public void displayGenuinePhone() {
        for (GenuinePhone genuinePhone:genuinePhoneList){
            System.out.println(genuinePhone);
        }
    }

    @Override
    public void removeGenuinePhone(int id) {
        GenuinePhone genuinePhoneObj = null;
        for (GenuinePhone genuinePhone : genuinePhoneList) {
            if (genuinePhone.getId() == id) {
                genuinePhoneObj=genuinePhone;
                break;
            }
        }
        if (genuinePhoneObj != null) {
            genuinePhoneList.remove(genuinePhoneObj);
            System.out.println("Xoa thanh cong: ");
        } else {
            System.out.println("Not found");
        }
    }

    @Override
    public void searchGenuinePhone(int id) {
            GenuinePhone genuinePhoneObj = null;
            for (GenuinePhone genuinePhone : genuinePhoneList) {
                if (genuinePhone.getId() == id) {
                    genuinePhoneObj=genuinePhone;
                    break;
                }
            }
            if (genuinePhoneObj != null) {
                System.out.println(genuinePhoneObj);
                System.out.println("Tim kiem thanh cong: ");
            } else {
                System.out.println("Not found");
            }
    }

}
