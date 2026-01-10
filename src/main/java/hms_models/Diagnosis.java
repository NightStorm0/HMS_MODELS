package hms_models;

/**
 * Model class representing a Diagnosis in the Hospital Management System.
 * A diagnosis represents the medical condition identified by a doctor during
 * consultation.
 */
public class Diagnosis {
    private Integer id;
    private Integer consultationId;
    private Integer encounterId;
    private String patientId;
    private String doctorId;
    private String diagnosisCode; // ICD-10 code
    private String diagnosisName;
    private String diagnosisType; // e.g., "Primary", "Secondary", "Differential"
    private String severity; // e.g., "Mild", "Moderate", "Severe"
    private String notes;
    private String diagnosisDate;
    private String status; // e.g., "Active", "Resolved", "Chronic"

    // Constructors
    public Diagnosis() {
    }

    public Diagnosis(Integer consultationId, String patientId, String doctorId,
            String diagnosisCode, String diagnosisName, String diagnosisType) {
        this.consultationId = consultationId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.diagnosisCode = diagnosisCode;
        this.diagnosisName = diagnosisName;
        this.diagnosisType = diagnosisType;
        this.status = "Active";
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

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public String getDiagnosisType() {
        return diagnosisType;
    }

    public void setDiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDiagnosisDate() {
        return diagnosisDate;
    }

    public void setDiagnosisDate(String diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Diagnosis{" +
                "id=" + id +
                ", consultationId=" + consultationId +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", diagnosisCode='" + diagnosisCode + '\'' +
                ", diagnosisName='" + diagnosisName + '\'' +
                ", diagnosisType='" + diagnosisType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
