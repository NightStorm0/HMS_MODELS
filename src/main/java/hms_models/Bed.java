package hms_models;

/**
 * Model class representing a bed within a ward room.
 */
public class Bed {
    private Integer id;
    private Integer roomId;
    private String bedNumber;
    private String status;      // available, occupied, maintenance

    public Bed() {
    }

    public Bed(Integer id, Integer roomId, String bedNumber, String status) {
        this.id = id;
        this.roomId = roomId;
        this.bedNumber = bedNumber;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
