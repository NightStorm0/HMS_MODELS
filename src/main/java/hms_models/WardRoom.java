package hms_models;

/**
 * Model class representing a room within a hospital ward.
 */
public class WardRoom {
    private Integer id;
    private Integer wardId;
    private String roomNumber;
    private String roomType;    // general, private, ICU, isolation

    public WardRoom() {
    }

    public WardRoom(Integer id, Integer wardId, String roomNumber, String roomType) {
        this.id = id;
        this.wardId = wardId;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
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

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
