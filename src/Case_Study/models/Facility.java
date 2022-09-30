package Case_Study.models;

import java.io.Serializable;

public abstract class Facility implements Serializable {
    public static final long serialVersionUID=26L;
    private String serviceName;
    private double area;
    private double rentalCost;
    private int maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double area, double rentalCost, int maxPeople, String rentalType) {
        this.serviceName = serviceName;
        this.area=area;
        this.rentalCost = rentalCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "serviceName='" + serviceName + '\'' +
                ", Area=" + area +
                ", rentalCost=" + rentalCost +
                ", maxPeople=" + maxPeople +
                ", rentalType=" + rentalType;
    }
}
