package hms_models;

public class Encounter {
    private Integer id;
    private String patientId;
    private Integer doctorId;
    private Integer clinicId;
    private String visitDate;
    private String visitType; // consultation, surgery, emergency, follow-up
    private String status; // waiting, in-progress, completed

    // Constructors
    public Encounter() {}

    public Encounter(String patientId, Integer doctorId, Integer clinicId, String visitType, String status) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.clinicId = clinicId;
        this.visitType = visitType;
        this.status = status;
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

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getClinicId() {
        return clinicId;
    }

    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Encounter{" +
                "id=" + id +
                ", patientId='" + patientId + '\'' +
                ", doctorId=" + doctorId +
                ", clinicId=" + clinicId +
                ", visitDate='" + visitDate + '\'' +
                ", visitType='" + visitType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
