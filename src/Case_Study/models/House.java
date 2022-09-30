package Case_Study.models;

public class House extends Facility {
    private String roomStandard;
    private int floor;

    public House() {
    }

    public House(String serviceName, double area, double rentalCost, int maxPeople, String rentalType, String roomStandard, int floor) {
        super(serviceName, area, rentalCost, maxPeople, rentalType);
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

    @Override
    public String toString() {
        return "House{" + super.toString()+
                ", roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }
}
