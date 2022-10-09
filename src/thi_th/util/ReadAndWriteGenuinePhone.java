package thi_th.util;

import thi_th.model.CellPhone;
import thi_th.model.GenuinePhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteGenuinePhone {
    public List<GenuinePhone> readFileGenuinePhone(String filePath) {
        List<GenuinePhone> genuinePhoneList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String phoneName = temp[1];
                double price = Double.parseDouble(temp[2]);
                int amount = Integer.parseInt(temp[3]);
                String producer = temp[4];
                String warrantyPeriod = temp[5];
                String warrantyCoverage = temp[6];
                GenuinePhone genuinePhone = new GenuinePhone(id, phoneName, price, amount, producer, warrantyPeriod, warrantyCoverage);
                genuinePhoneList.add(genuinePhone);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return genuinePhoneList;
    }

    public void writeFileGenuinePhone(List<GenuinePhone> genuinePhoneList, String filePath) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = "";
            for (GenuinePhone genuinePhone : genuinePhoneList) {
                str += genuinePhone.getId() + "," + genuinePhone.getPhoneName() + "," + genuinePhone.getPrice() + "," + genuinePhone.getAmount() + "," +
                        genuinePhone.getProducer() + "," + genuinePhone.getWarrantyCoverage() + "," + genuinePhone.getWarrantyPeriod() + "\n";
            }
            if (str != null && !str.isEmpty()) {
                bufferedWriter.write(str);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }

        }
    }
}
