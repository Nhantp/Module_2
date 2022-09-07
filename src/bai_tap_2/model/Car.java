package bai_tap_2.model;

public class Car extends Vehicle{
    private int soChoNgoi;
    private String kieuXe;

    public Car() {
    }

    public Car(String bienSoXe, String tenHang, String namSanXuat, String nguoiSoHuu, int soChoNgoi, String kieuXe) {
        super(bienSoXe, tenHang, namSanXuat, nguoiSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return super.toString()+", Số chỗ ngồi: " + soChoNgoi +
                ", Kiểu xe: " + kieuXe;
    }
}
