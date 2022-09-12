package Case_Study.models;

public class Villa extends Facility {
    private String roomStandard;
    private double lakeArea;
    private int floor;

    public Villa() {
    }

    public Villa(String serviceName, double usableArea, double taxExpenses, int numberOfPeople,
                 int taxType, String roomStandard, double lakeArea, int floor) {
        super(serviceName, usableArea, taxExpenses, numberOfPeople, taxType);
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.floor = floor;
    }

    public Villa(String roomStandard, double lakeArea, int floor) {
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getLakeArea() {
        return lakeArea;
    }

    public void setLakeArea(double lakeArea) {
        this.lakeArea = lakeArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", lakeArea=" + lakeArea +
                ", floor=" + floor +
                '}';
    }
}
