package hms_models;

/**
 * Model class representing a hospital ward.
 */
public class Ward {
    private Integer id;
    private String wardName;
    private String wardType;     // medical, surgical, ICU, maternity
    private Integer totalBeds;
    private String createdAt;

    public Ward() {
    }

    public Ward(Integer id, String wardName, String wardType, Integer totalBeds, String createdAt) {
        this.id = id;
        this.wardName = wardName;
        this.wardType = wardType;
        this.totalBeds = totalBeds;
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

    public Integer getTotalBeds() {
        return totalBeds;
    }

    public void setTotalBeds(Integer totalBeds) {
        this.totalBeds = totalBeds;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
