package hms_models;

public class ConsultationNote {
    private Integer id;
    private Integer encounterId;
    private String title;
    private String chiefComplaint;
    private String historyOfPresentIllness;
    private String assessment;
    private String plan;
    private String createdAt;
    private String actionBy;

    // Transient fields — populated via JOIN at query time, not stored in DB
    /** The name of the clinic where this note was written. */
    private String sourceClinicName;
    /**
     * The visibility setting of the source clinic: "PUBLIC" or "PRIVATE".
     * Defaults to "PUBLIC" if the clinic cannot be determined.
     */
    private String clinicNoteVisibility;

    // Constructors
    public ConsultationNote() {
    }

    public ConsultationNote(Integer encounterId, String title, String chiefComplaint,
            String historyOfPresentIllness, String assessment, String plan) {
        this.encounterId = encounterId;
        this.title = title;
        this.chiefComplaint = chiefComplaint;
        this.historyOfPresentIllness = historyOfPresentIllness;
        this.assessment = assessment;
        this.plan = plan;
    }

    // Getters and Setters
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getHistoryOfPresentIllness() {
        return historyOfPresentIllness;
    }

    public void setHistoryOfPresentIllness(String historyOfPresentIllness) {
        this.historyOfPresentIllness = historyOfPresentIllness;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
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

    public String getSourceClinicName() {
        return sourceClinicName;
    }

    public void setSourceClinicName(String sourceClinicName) {
        this.sourceClinicName = sourceClinicName;
    }

    public String getClinicNoteVisibility() {
        return clinicNoteVisibility;
    }

    public void setClinicNoteVisibility(String clinicNoteVisibility) {
        this.clinicNoteVisibility = clinicNoteVisibility;
    }

    private java.util.List<Vitals> vitals;

    public java.util.List<Vitals> getVitals() {
        return vitals;
    }

    public void setVitals(java.util.List<Vitals> vitals) {
        this.vitals = vitals;
    }

    @Override
    public String toString() {
        return "ConsultationNote{" +
                "id=" + id +
                ", encounterId=" + encounterId +
                ", title='" + title + '\'' +
                ", chiefComplaint='" + chiefComplaint + '\'' +
                ", historyOfPresentIllness='" + historyOfPresentIllness + '\'' +
                ", assessment='" + assessment + '\'' +
                ", plan='" + plan + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", actionBy='" + actionBy + '\'' +
                ", sourceClinicName='" + sourceClinicName + '\'' +
                ", clinicNoteVisibility='" + clinicNoteVisibility + '\'' +
                ", vitals=" + vitals +
                '}';
    }
}
