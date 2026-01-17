package hms_models;

/**
 * Model class representing a patient appointment.
 */
public class Appointment {
    private Integer id;
    private String appointmentId; // unique appointment identifier
    private String patientId; // foreign key to patients
    private Integer doctorId; // foreign key to doctor/user
    private String reason; // reason for appointment
    private String appointmentDateTime; // date and time of appointment
    private String status; // scheduled, completed, cancelled, no-show
    private String createdAt;

    public Appointment() {
    }

    public Appointment(Integer id, String appointmentId, String patientId, Integer doctorId,
            String reason, String appointmentDateTime, String status, String createdAt) {
        this.id = id;
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.reason = reason;
        this.appointmentDateTime = appointmentDateTime;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(String appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
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
}
