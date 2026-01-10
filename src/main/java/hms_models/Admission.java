package hms_models;

/**
 * Model class representing a patient admission.
 */
public class Admission {
    private Integer id;
    private String patientId;
    private Integer admittingDoctorId;
    private Integer wardId;
    private Integer roomId;
    private Integer bedId;
    private String admissionDate;
    private String dischargeDate;
    private String admissionType;       // emergency, elective, transfer
    private String provisionalDiagnosis;
    private Integer acuityLevel;
    private String status;              // active, discharged, transferred, deceased
    private String createdAt;
    private String actionBy;

    public Admission() {
    }

    public Admission(Integer id, String patientId, Integer admittingDoctorId, Integer wardId,
                     Integer roomId, Integer bedId, String admissionDate, String dischargeDate,
                     String admissionType, String provisionalDiagnosis, Integer acuityLevel,
                     String status, String createdAt) {
        this.id = id;
        this.patientId = patientId;
        this.admittingDoctorId = admittingDoctorId;
        this.wardId = wardId;
        this.roomId = roomId;
        this.bedId = bedId;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.admissionType = admissionType;
        this.provisionalDiagnosis = provisionalDiagnosis;
        this.acuityLevel = acuityLevel;
        this.status = status;
        this.createdAt = createdAt;
    }

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

    public Integer getAdmittingDoctorId() {
        return admittingDoctorId;
    }

    public void setAdmittingDoctorId(Integer admittingDoctorId) {
        this.admittingDoctorId = admittingDoctorId;
    }

    public Integer getWardId() {
        return wardId;
    }

    public void setWardId(Integer wardId) {
        this.wardId = wardId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getAdmissionType() {
        return admissionType;
    }

    public void setAdmissionType(String admissionType) {
        this.admissionType = admissionType;
    }

    public String getProvisionalDiagnosis() {
        return provisionalDiagnosis;
    }

    public void setProvisionalDiagnosis(String provisionalDiagnosis) {
        this.provisionalDiagnosis = provisionalDiagnosis;
    }

    public Integer getAcuityLevel() {
        return acuityLevel;
    }

    public void setAcuityLevel(Integer acuityLevel) {
        this.acuityLevel = acuityLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }
}
