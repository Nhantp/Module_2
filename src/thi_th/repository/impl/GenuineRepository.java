package thi_th.repository.impl;

import thi_th.model.CellPhone;
import thi_th.model.GenuinePhone;
import thi_th.repository.IGenuinePhoneRepository;
import thi_th.util.ReadAndWriteGenuinePhone;

import java.util.List;

public class GenuineRepository implements IGenuinePhoneRepository {
    ReadAndWriteGenuinePhone readAndWriteGenuinePhone=new ReadAndWriteGenuinePhone();
    List<GenuinePhone>genuinePhoneList=readAndWriteGenuinePhone.readFileGenuinePhone(FILE_NAME);

    @Override
    public void addGenuinePhone(GenuinePhone genuinePhone) {
        genuinePhoneList.add(genuinePhone);
        readAndWriteGenuinePhone.writeFileGenuinePhone(genuinePhoneList,FILE_NAME);
    }

    @Override
    public void remove(int id) {
        readAndWriteGenuinePhone.writeFileGenuinePhone(genuinePhoneList,FILE_NAME);
    }

    @Override
    public List<GenuinePhone> findAll() {
        return genuinePhoneList;
    }
}
