package hms_models;

/**
 * Model class representing a room within a hospital ward.
 */
public class WardRoom {
    private Integer id;
    private Integer wardId;
    private String roomNumber;
    private Integer numberOfBeds;

    public WardRoom() {
    }

    public WardRoom(Integer id, Integer wardId, String roomNumber, Integer numberOfBeds) {
        this.id = id;
        this.wardId = wardId;
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWardId() {
        return wardId;
    }

    public void setWardId(Integer wardId) {
        this.wardId = wardId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
}
