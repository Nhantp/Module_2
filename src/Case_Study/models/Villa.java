package Case_Study.models;

public class Villa extends Facility {
    private String roomStandard;
    private double lakeArea;
    private int floor;

    public Villa() {
    }

    public Villa(String serviceName, double area, double rentalCost, int maxPeople, String rentalType, String roomStandard, double lakeArea, int floor) {
        super(serviceName, area, rentalCost, maxPeople, rentalType);
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
        return "Villa{" +super.toString()+
                ", roomStandard='" + roomStandard + '\'' +
                ", lakeArea=" + lakeArea +
                ", floor=" + floor +
                '}';
    }
}
