package hms_models;

/**
 * Model class representing a hospital ward.
 */
public class Ward {
    private Integer id;
    private String wardName;
    private String wardType; // medical, surgical, ICU, maternity
    private Integer totalRooms;
    private Integer departmentId;
    private String createdAt;

    public Ward() {
    }

    public Ward(Integer id, String wardName, String wardType, Integer totalRooms, String createdAt) {
        this(id, wardName, wardType, totalRooms, null, createdAt);
    }

    public Ward(Integer id, String wardName, String wardType, Integer totalRooms, Integer departmentId,
            String createdAt) {
        this.id = id;
        this.wardName = wardName;
        this.wardType = wardType;
        this.totalRooms = totalRooms;
        this.departmentId = departmentId;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    public Integer getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(Integer totalRooms) {
        this.totalRooms = totalRooms;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
