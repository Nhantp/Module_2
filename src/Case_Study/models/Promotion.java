package Case_Study.models;

import java.io.Serializable;

public class Promotion implements Serializable {
    private int yearOfUse;
    private int voucherTenPercent;
    private int voucherTwentyPercent;
    private int voucherFiftyPercent;

    public Promotion() {
    }

    public Promotion(int yearOfUse, int voucherTenPercent, int voucherTwentyPercent, int voucherFiftyPercent) {
        this.yearOfUse = yearOfUse;
        this.voucherTenPercent = voucherTenPercent;
        this.voucherTwentyPercent = voucherTwentyPercent;
        this.voucherFiftyPercent = voucherFiftyPercent;
    }

    public int getYearOfUse() {
        return yearOfUse;
    }

    public void setYearOfUse(int yearOfUse) {
        this.yearOfUse = yearOfUse;
    }

    public int getVoucherTenPercent() {
        return voucherTenPercent;
    }

    public void setVoucherTenPercent(int voucherTenPercent) {
        this.voucherTenPercent = voucherTenPercent;
    }

    public int getVoucherTwentyPercent() {
        return voucherTwentyPercent;
    }

    public void setVoucherTwentyPercent(int voucherTwentyPercent) {
        this.voucherTwentyPercent = voucherTwentyPercent;
    }

    public int getVoucherFiftyPercent() {
        return voucherFiftyPercent;
    }

    public void setVoucherFiftyPercent(int voucherFiftyPercent) {
        this.voucherFiftyPercent = voucherFiftyPercent;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "yearOfUse=" + yearOfUse +
                ", voucherTenPercent=" + voucherTenPercent +
                ", voucherTwentyPercent=" + voucherTwentyPercent +
                ", voucherFiftyPercent=" + voucherFiftyPercent +
                '}';
    }
}
