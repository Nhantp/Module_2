package thi_th.repository.impl;

import thi_th.model.CellPhone;
import thi_th.repository.ICellPhoneRepository;
import thi_th.util.ReadAndWriteCellPhone;

import java.util.List;

public class CellPhoneRepository implements ICellPhoneRepository {
    ReadAndWriteCellPhone readAndWriteCellPhone=new ReadAndWriteCellPhone();
    List<CellPhone>cellPhoneList=readAndWriteCellPhone.readFileCellPhone(FILE_NAME);
    @Override
    public void addCellPhone(CellPhone cellPhone) {
        cellPhoneList.add(cellPhone);
        readAndWriteCellPhone.writeFileCellPhone(cellPhoneList,FILE_NAME);
    }

    @Override
    public void remove(CellPhone cellPhone) {
        cellPhoneList.remove(cellPhone);
        readAndWriteCellPhone.writeFileCellPhone(cellPhoneList,FILE_NAME);
    }

    @Override
    public List<CellPhone> findAll() {
        return cellPhoneList;
    }

}
