package Case_Study.models;

public class House extends Facility{
    private String roomStandard;
    private int floor;
    public House(){}

    public House(String serviceName, double usableArea, double taxExpenses, int numberOfPeople,
                 int taxType, String roomStandard, int floor) {
        super(serviceName, usableArea, taxExpenses, numberOfPeople, taxType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House(String roomStandard, int floor) {
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
