package pro.hms.models;

/**
 * Request model for server restart endpoint.
 * Contains the password required for authorization.
 */
public class RestartRequest {
    private String password;

    public RestartRequest() {
    }

    public RestartRequest(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
