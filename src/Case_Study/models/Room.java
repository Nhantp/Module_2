package Case_Study.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, double usableArea, double taxExpenses, int numberOfPeople, int taxType, String freeService) {
        super(serviceName, usableArea, taxExpenses, numberOfPeople, taxType);
        this.freeService = freeService;
    }

    public Room(String freeService) {
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
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
