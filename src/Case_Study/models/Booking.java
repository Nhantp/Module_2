package Case_Study.models;

import java.io.Serializable;

public class Booking implements Serializable,Comparable<Booking> {
    private String idBooking;
    private String dateStart;
    private String dateEnd;
    private String idCustomer;
    private String serviceName;
    private String serviceType;
    private int someContracts;
    private double advanceDeposit;
    private double totalPayment;;

    public Booking() {
    }

    public Booking(String idBooking, String dateStart, String dateEnd, String idCustomer, String serviceName, String serviceType, int someContracts, double advanceDeposit, double totalPayment) {
        this.idBooking = idBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.someContracts = someContracts;
        this.advanceDeposit = advanceDeposit;
        this.totalPayment = totalPayment;
    }

    public Booking(String idBooking, String dateStart, String dateEnd, String idCustomer, String serviceName, String serviceType) {
        this.idBooking = idBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public Booking(int someContracts, String idBooking, double advanceDeposit, double totalPayment, String idCustomer) {
        this.someContracts = someContracts;
        this.idBooking = idBooking;
        this.advanceDeposit = advanceDeposit;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking =idBooking;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public int getSomeContracts() {
        return someContracts;
    }

    public void setSomeContracts(int someContracts) {
        this.someContracts = someContracts;
    }

    public double getAdvanceDeposit() {
        return advanceDeposit;
    }

    public void setAdvanceDeposit(double advanceDeposit) {
        this.advanceDeposit = advanceDeposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", idCustomer='" + idCustomer + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", someContracts=" + someContracts +
                ", advanceDeposit=" + advanceDeposit +
                ", totalPayment=" + totalPayment +
                '}';
    }


    @Override
    public int compareTo(Booking o) {
        return this.dateStart.compareTo(o.dateStart);
    }
}

