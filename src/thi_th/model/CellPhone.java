package thi_th.model;

import java.util.Scanner;

public class CellPhone extends Phone{
    private String handCarriedCountry;
    private String status;

    public CellPhone() {
    }

    public CellPhone(int id, String phoneName, double price, int amount, String producer, String handCarriedCountry, String status) {
        super(id, phoneName, price, amount, producer);
        this.handCarriedCountry = handCarriedCountry;
        this.status = status;
    }

    public String getHandCarriedCountry() {
        return handCarriedCountry;
    }

    public void setHandCarriedCountry(String handCarriedCountry) {
        this.handCarriedCountry = handCarriedCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void infoCellPhone(){
        Scanner scanner=new Scanner(System.in);
        super.info();
        System.out.println("Nhap vao quoc gia xach tay: ");
        this.handCarriedCountry=scanner.nextLine();
        System.out.println("Nhap vao trang thai: ");
        this.status=scanner.nextLine();
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "ID=" + id +
                ", phoneName='" + phoneName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", producer='" + producer + '\'' +
                ", handCarriedCountry='" + handCarriedCountry + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
