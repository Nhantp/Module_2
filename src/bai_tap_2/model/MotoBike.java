package bai_tap_2.model;

public class MotoBike extends Vehicle {
    private double congSuat;

    public MotoBike() {
    }

    public MotoBike(String bienSoXe, String tenHang, String namSanXuat, String nguoiSoHuu, double congSuat) {
        super(bienSoXe, tenHang, namSanXuat, nguoiSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString()+", Công suất: " + congSuat;
    }
}
