package hms_models;

/**
 * Model class representing a Clinic/Department in the Hospital Management
 * System.
 * A clinic represents a medical department or specialty area (e.g., Cardiology,
 * Pediatrics).
 */
public class Clinic {
    private Integer id;
    private String clinicName;
    private String description;
    private String status; // e.g., "Active", "Inactive"
    private String createdDate;
    private String updatedDate;

    // Constructors
    public Clinic() {
    }

    public Clinic(String clinicName, String description, String status) {
        this.clinicName = clinicName;
        this.description = description;
        this.status = status;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "id=" + id +
                ", clinicName='" + clinicName + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", updatedDate='" + updatedDate + '\'' +
                '}';
    }
}
