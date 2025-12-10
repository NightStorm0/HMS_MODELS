package hms_models;

public class Consultation {
    private Integer id;
    private String patientId;
    private String consultationDate;
    private String time;
    private String clinic;
    private String doctorId;
    private String status;

    // Constructors
    public Consultation() {}

    public Consultation(String patientId, String clinic, String doctorId, String status) {
        this.patientId = patientId;
        this.clinic = clinic;
        this.doctorId = doctorId;
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

    public String getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(String consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", patientId='" + patientId + '\'' +
                ", consultationDate='" + consultationDate + '\'' +
                ", time='" + time + '\'' +
                ", clinic='" + clinic + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
