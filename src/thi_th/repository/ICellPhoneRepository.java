package thi_th.repository;

import thi_th.model.CellPhone;

import java.util.List;

public interface ICellPhoneRepository {
    String FILE_NAME="D:\\Codegym\\A05\\Module_2\\src\\thi_th\\data\\data\\data.csv";
    void addCellPhone(CellPhone cellPhone);
    void remove(int id);
    List<CellPhone> findAll();
}
