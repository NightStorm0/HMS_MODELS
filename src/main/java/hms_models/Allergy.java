package hms_models;

/**
 * Model class representing a Patient Allergy in the Hospital Management System.
 * An allergy represents substances or conditions that cause adverse reactions
 * in patients.
 */
public class Allergy {
    private Integer id;
    private String patientId;
    private String allergyName;
    private String allergyType; // e.g., "Drug", "Food", "Environmental", "Other"
    private String severity; // e.g., "Mild", "Moderate", "Severe", "Life-threatening"
    private String reaction; // Description of the allergic reaction
    private String notes;
    private String recordedDate;
    private String recordedBy; // Doctor/Staff who recorded the allergy
    private String status; // e.g., "Active", "Inactive", "Resolved"

    // Constructors
    public Allergy() {
    }

    public Allergy(String patientId, String allergyName, String allergyType, String severity) {
        this.patientId = patientId;
        this.allergyName = allergyName;
        this.allergyType = allergyType;
        this.severity = severity;
        this.status = "Active";
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public String getAllergyType() {
        return allergyType;
    }

    public void setAllergyType(String allergyType) {
        this.allergyType = allergyType;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRecordedDate() {
        return recordedDate;
    }

    public void setRecordedDate(String recordedDate) {
        this.recordedDate = recordedDate;
    }

    public String getRecordedBy() {
        return recordedBy;
    }

    public void setRecordedBy(String recordedBy) {
        this.recordedBy = recordedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Allergy{" +
                "id=" + id +
                ", patientId='" + patientId + '\'' +
                ", allergyName='" + allergyName + '\'' +
                ", allergyType='" + allergyType + '\'' +
                ", severity='" + severity + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
