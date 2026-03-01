package hms_models;

public class MedicationPrescription {
    private Integer id;
    private Integer encounterId;
    private String medicationName;
    private Double doseAmount;
    private String doseUnit;
    private String route;
    private String frequencyCode;
    private String durationString;
    private String startDate;
    private String endDate;
    private String status; // "ACTIVE", "FINISHED", "DISCONTINUED"
    private String actionBy;

    public MedicationPrescription() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(Integer encounterId) {
        this.encounterId = encounterId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public Double getDoseAmount() {
        return doseAmount;
    }

    public void setDoseAmount(Double doseAmount) {
        this.doseAmount = doseAmount;
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getFrequencyCode() {
        return frequencyCode;
    }

    public void setFrequencyCode(String frequencyCode) {
        this.frequencyCode = frequencyCode;
    }

    public String getDurationString() {
        return durationString;
    }

    public void setDurationString(String durationString) {
        this.durationString = durationString;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    @Override
    public String toString() {
        return "MedicationPrescription{" +
                "id=" + id +
                ", encounterId=" + encounterId +
                ", medicationName='" + medicationName + '\'' +
                ", doseAmount=" + doseAmount +
                ", doseUnit='" + doseUnit + '\'' +
                ", route='" + route + '\'' +
                ", frequencyCode='" + frequencyCode + '\'' +
                ", durationString='" + durationString + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", actionBy='" + actionBy + '\'' +
                '}';
    }
}
