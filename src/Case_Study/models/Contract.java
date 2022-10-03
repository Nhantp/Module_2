package Case_Study.models;

import java.io.Serializable;

public class Contract implements Serializable {
    private String someContracts;
    private String idBooking;
    private double advanceDeposit;
    private double totalPayment;
    private String idCustomer;

    public Contract() {
    }

    public Contract(String someContracts, String idBooking, double advanceDeposit, double totalPayment, String idCustomer) {
        this.someContracts = someContracts;
        this.idBooking = idBooking;
        this.advanceDeposit = advanceDeposit;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public String getSomeContracts() {
        return someContracts;
    }

    public void setSomeContracts(String someContracts) {
        this.someContracts = someContracts;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
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

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "someContracts='" + someContracts + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", advanceDeposit=" + advanceDeposit +
                ", totalPayment=" + totalPayment +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}
