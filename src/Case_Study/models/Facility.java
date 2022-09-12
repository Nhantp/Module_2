package Case_Study.models;

public abstract class Facility {
    private String serviceName;
    private double Area;
    private double chiPhi;
    private int maxPeople;
    private int kieuThue;

    public Facility() {
    }

    public Facility(String serviceName, double area, double chiPhi, int maxPeople, int kieuThue) {
        this.serviceName = serviceName;
        Area = area;
        this.chiPhi = chiPhi;
        this.maxPeople = maxPeople;
        this.kieuThue = kieuThue;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(int kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", Area=" + Area +
                ", chiPhi=" + chiPhi +
                ", maxPeople=" + maxPeople +
                ", kieuThue=" + kieuThue +
                '}';
    }
}
