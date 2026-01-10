package hms_models;

/**
 * Model class representing a Medical Investigation/Lab Order in the Hospital
 * Management System.
 * An investigation represents diagnostic tests or procedures ordered by a
 * doctor.
 */
public class Investigation {
    private Integer id;
    private Integer consultationId;
    private Integer encounterId;
    private String patientId;
    private String doctorId;
    private String investigationType; // e.g., "Lab Test", "X-Ray", "MRI", "CT Scan", "Ultrasound"
    private String investigationName;
    private String description;
    private String orderDate;
    private String status; // e.g., "Pending", "In Progress", "Completed", "Cancelled"
    private String priority; // e.g., "Routine", "Urgent", "Emergency"
    private String result;
    private String resultDate;
    private String notes;

    // Constructors
    public Investigation() {
    }

    public Investigation(Integer consultationId, String patientId, String doctorId,
            String investigationType, String investigationName, String priority) {
        this.consultationId = consultationId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.investigationType = investigationType;
        this.investigationName = investigationName;
        this.priority = priority;
        this.status = "Pending";
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(Integer consultationId) {
        this.consultationId = consultationId;
    }

    public Integer getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(Integer encounterId) {
        this.encounterId = encounterId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getInvestigationType() {
        return investigationType;
    }

    public void setInvestigationType(String investigationType) {
        this.investigationType = investigationType;
    }

    public String getInvestigationName() {
        return investigationName;
    }

    public void setInvestigationName(String investigationName) {
        this.investigationName = investigationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResultDate() {
        return resultDate;
    }

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Investigation{" +
                "id=" + id +
                ", consultationId=" + consultationId +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", investigationType='" + investigationType + '\'' +
                ", investigationName='" + investigationName + '\'' +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
