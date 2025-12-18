package hms_models;

/**
 * Model class representing notes associated with an admission.
 */
public class WardNote {
    private Integer id;
    private Integer admissionId;
    private Integer authorId;
    private String noteType;    // doctor's note, nursing note, progress note
    private String content;
    private String createdAt;

    public WardNote() {
    }

    public WardNote(Integer id, Integer admissionId, Integer authorId, String noteType, 
                    String content, String createdAt) {
        this.id = id;
        this.admissionId = admissionId;
        this.authorId = authorId;
        this.noteType = noteType;
        this.content = content;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(Integer admissionId) {
        this.admissionId = admissionId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getNoteType() {
        return noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
