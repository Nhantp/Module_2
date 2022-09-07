package bai_tap_2.model;

public abstract class Vehicle {
    private String bienSoXe;
    private String tenHang;
    private String namSanXuat;
    private String nguoiSoHuu;

    public Vehicle() {
    }

    public Vehicle(String bienSoXe, String tenHang, String namSanXuat, String nguoiSoHuu) {
        this.bienSoXe = bienSoXe;
        this.tenHang = tenHang;
        this.namSanXuat = namSanXuat;
        this.nguoiSoHuu = nguoiSoHuu;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getNguoiSoHuu() {
        return nguoiSoHuu;
    }

    public void setNguoiSoHuu(String nguoiSoHuu) {
        this.nguoiSoHuu = nguoiSoHuu;
    }

    @Override
    public String toString() {
        return "Biển số xe: " + bienSoXe+
                ", Tên hãng sản xuất: " + tenHang +
                ", Năm sản xuất: " + namSanXuat +
                ", Người sở hữu: " + nguoiSoHuu;
    }
}
