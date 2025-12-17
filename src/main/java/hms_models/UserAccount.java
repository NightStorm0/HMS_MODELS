package hms_models;

public class UserAccount {
    private int id;
    private String name;
    private String username;
    private AccountType type;
    private int accessLevel;
    private String lastLogin;
    public static int USER_ID_PLACEHOLDER = -1000;

    public enum AccountType {
        ADMINISTRATOR(5),
        MANAGER(4),
        DOCTOR(3),
        NURSE(2),
        PHARMACY(2),
        LAB_ADMIN(2),
        FRONT_DESK(1),
        GUEST(0);

        public final int level;

        AccountType(int lvl) {
            this.level = lvl;
        }
    }

    public UserAccount(int id, String name, String username, String account_type, String lastLogin) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.type = AccountType.valueOf(account_type);
        this.accessLevel = type.level;
        this.lastLogin = lastLogin;
    }

    public UserAccount(){
        this.id = USER_ID_PLACEHOLDER;
        this.name = "";
        this.username = "";
        this.type = AccountType.GUEST;
        this.accessLevel = 0;
        this.lastLogin = "";
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

    public AccountType getType() {
        return type;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public String getLastLogin() {
        return lastLogin;
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

    public void setType(AccountType type) {
        this.type = type;
        this.accessLevel = type.level;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }
}
