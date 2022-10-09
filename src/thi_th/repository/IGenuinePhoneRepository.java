package thi_th.repository;

import thi_th.model.CellPhone;
import thi_th.model.GenuinePhone;

import java.util.List;

public interface IGenuinePhoneRepository {
    String FILE_NAME = "D:\\Codegym\\A05\\Module_2\\src\\thi_th\\data\\data\\mobile.csv";

    void addGenuinePhone(GenuinePhone genuinePhone);
    void remove(int id);

    List<GenuinePhone> findAll();
}
