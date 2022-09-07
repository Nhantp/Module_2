package bai_tap_2.model;

public class Truck extends Vehicle{
    private double trongTai ;

    public Truck() {
    }

    public Truck(String bienSoXe, String tenHang, String namSanXuat, String nguoiSoHuu, double trongTai) {
        super(bienSoXe, tenHang, namSanXuat, nguoiSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Trọng tải: " + trongTai;
    }
}
