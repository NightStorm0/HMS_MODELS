package hms_models;

public class HospitalCard {
    private Integer id;
    private String cardId;
    private String cardType;
    private String ownerPatientId;
    private String issuedAt;

    // Constructors
    public HospitalCard() {}

    public HospitalCard(String cardId, String cardType, String ownerPatientId) {
        this.cardId = cardId;
        this.cardType = cardType;
        this.ownerPatientId = ownerPatientId;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getOwnerPatientId() {
        return ownerPatientId;
    }

    public void setOwnerPatientId(String ownerPatientId) {
        this.ownerPatientId = ownerPatientId;
    }

    public String getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    @Override
    public String toString() {
        return "HospitalCard{" +
                "id=" + id +
                ", cardId='" + cardId + '\'' +
                ", cardType='" + cardType + '\'' +
                ", ownerPatientId='" + ownerPatientId + '\'' +
                ", issuedAt='" + issuedAt + '\'' +
                '}';
    }
}
