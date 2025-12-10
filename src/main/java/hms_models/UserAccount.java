package hms_models;

public  class UserAccount {
    private int id;
    private String name;
    private String username;
    private String passwordHash;
    private AccountType type;
    private int accessLevel;
    private String createdAt;
    private String lastLogin;
    private boolean active;

    public enum AccountType {
        ADMIN(5),
        MANAGER(4),
        DOCTOR(3),
        NURSE(2),
        PHARMACY(2),
        LAB_ADMIN(2),
        FRONT_DESK(1),
        GUEST(0);

        public final int level;

        AccountType(int lvl) { this.level = lvl; }
    }

    public UserAccount(int id, String name, String username, String passwordHash,
                       AccountType type, String createdAt, String lastLogin, boolean active) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.passwordHash = passwordHash;
        this.type = type;
        this.accessLevel = type.level;
        this.createdAt = createdAt;
        this.lastLogin = lastLogin;
        this.active = active;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public AccountType getType() {
        return type;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public boolean isActive() {
        return active;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setType(AccountType type) {
        this.type = type;
        this.accessLevel = type.level;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
