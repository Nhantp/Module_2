package thi_th.model;

import java.util.Scanner;

public class GenuinePhone extends Phone{
    private String warrantyPeriod;
    private String warrantyCoverage;

    public GenuinePhone() {
    }

    public GenuinePhone(int id, String phoneName, double price, int amount, String producer, String warrantyPeriod, String warrantyCoverage) {
        super(id, phoneName, price, amount, producer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }
    public void infoGenuinePhone(){
        Scanner scanner=new Scanner(System.in);
        super.info();
        System.out.println("Nhap vao thoi gian bao hanh: ");
        this.warrantyCoverage=scanner.nextLine();
        System.out.println("Nhap vao pham vi bao hanh: ");
        this.warrantyPeriod=scanner.nextLine();

    }

    @Override
    public String toString() {
        return "GenuinePhone{" +
                "ID=" + id +
                ", phoneName='" + phoneName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", producer='" + producer + '\'' +
                ", warrantyPeriod='" + warrantyPeriod + '\'' +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                '}';
    }
}
