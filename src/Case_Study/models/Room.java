package Case_Study.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, double area, double rentalCost, int maxPeople, String rentalType, String freeService) {
        super(serviceName, area, rentalCost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                ", freeService='" + freeService + '\'' +
                '}';
    }
}
