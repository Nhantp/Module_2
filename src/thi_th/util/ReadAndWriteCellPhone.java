package thi_th.util;

import thi_th.model.CellPhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCellPhone {
    public List<CellPhone> readFileCellPhone(String filePath) {
        List<CellPhone> cellPhoneList = new ArrayList<>();
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
                String handCarriedCountry = temp[5];
                String status = temp[6];
                CellPhone cellPhone = new CellPhone(id, phoneName, price, amount, producer, handCarriedCountry, status);
                cellPhoneList.add(cellPhone);
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
        return cellPhoneList;
    }

    public void writeFileCellPhone(List<CellPhone> cellPhoneList, String filePath) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = "";
            for (CellPhone cellPhone : cellPhoneList) {
                str += cellPhone.getId() + "," + cellPhone.getPhoneName() + "," + cellPhone.getPrice() + "," + cellPhone.getAmount() + "," +
                        cellPhone.getProducer() + "," + cellPhone.getHandCarriedCountry() + "," + cellPhone.getStatus() + "\n";
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
