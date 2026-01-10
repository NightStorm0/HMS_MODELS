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

    // Constructors
    public ConsultationNote() {}

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
                '}';
    }
}
