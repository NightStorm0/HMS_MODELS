package hms_models;

/**
 * Model class representing a recent action/activity in the system.
 * Actions are persistent records of events that occur in the system,
 * displayed in the "Recent Activity" section.
 */
public class Action {
    private Integer id;
    private String action; // Action type (e.g., "patient_registered", "consultation_added")
    private String message; // Human-readable message
    private String data; // JSON string containing additional data
    private String timestamp; // ISO timestamp when the action occurred

    public Action() {
    }

    public Action(Integer id, String action, String message, String data, String timestamp) {
        this.id = id;
        this.action = action;
        this.message = message;
        this.data = data;
        this.timestamp = timestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
