package Case_Study.models;

public class Facility {
    public String serviceName;
    public double usableArea;
    public double taxExpenses;
    public int numberOfPeople;
    public int taxType;

    public Facility(String serviceName, double usableArea, double taxExpenses, int numberOfPeople, int taxType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.taxExpenses = taxExpenses;
        this.numberOfPeople = numberOfPeople;
        this.taxType = taxType;
    }
    public Facility(){}

    public String getServiceName() {
        return serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public double getTaxExpenses() {
        return taxExpenses;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public int getTaxType() {
        return taxType;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public void setTaxExpenses(double taxExpenses) {
        this.taxExpenses = taxExpenses;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setTaxType(int taxType) {
        this.taxType = taxType;
    }
}
