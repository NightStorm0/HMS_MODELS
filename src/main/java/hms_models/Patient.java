package hms_models;

import java.time.LocalDateTime;

public class Patient {
    private Integer id;
    private String patientId;

    private String lName;
    private String fName;
    private String mName;

    private String dob;
    private String sex;

    private String address;
    private String pPhoneNumber;
    private String sPhoneNumber;
    private String email;

    private String tribe;
    private String religion;
    private String occupation;

    private String nextOfKin;
    private String nokContact;
    private String nokRelationship;
    private String cardType;
    private String cardId;
    private String createdAt;
    private String actionBy;

    // Constructors
    public Patient() {}

    public Patient(String patientId, String lName, String fName, String mName,
                   String dob, String sex, String address, String pPhoneNumber,
                   String sPhoneNumber, String email, String tribe, String religion,
                   String occupation, String nextOfKin, String nokContact,
                   String nokRelationship,String cardType, String cardId) {
        this.patientId = patientId;
        this.lName = lName;
        this.fName = fName;
        this.mName = mName;
        this.dob = dob;
        this.sex = sex;
        this.address = address;
        this.pPhoneNumber = pPhoneNumber;
        this.sPhoneNumber = sPhoneNumber;
        this.email = email;
        this.tribe = tribe;
        this.religion = religion;
        this.occupation = occupation;
        this.nextOfKin = nextOfKin;
        this.nokContact = nokContact;
        this.nokRelationship = nokRelationship;
        this.cardType = cardType;
        this.cardId = cardId;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPPhoneNumber() {
        return pPhoneNumber;
    }

    public void setPPhoneNumber(String pPhoneNumber) {
        this.pPhoneNumber = pPhoneNumber;
    }

    public String getSPhoneNumber() {
        return sPhoneNumber;
    }

    public void setSPhoneNumber(String sPhoneNumber) {
        this.sPhoneNumber = sPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getNokContact() {
        return nokContact;
    }

    public void setNokContact(String nokContact) {
        this.nokContact = nokContact;
    }

    public String getNokRelationship() {
        return nokRelationship;
    }

    public void setNokRelationship(String nokRelationship) {
        this.nokRelationship = nokRelationship;
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
        return "Patient{" +
                "id=" + id +
                ", patientId='" + patientId + '\'' +
                ", lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", dob='" + dob + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", pPhoneNumber='" + pPhoneNumber + '\'' +
                ", sPhoneNumber='" + sPhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", tribe='" + tribe + '\'' +
                ", religion='" + religion + '\'' +
                ", occupation='" + occupation + '\'' +
                ", nextOfKin='" + nextOfKin + '\'' +
                ", nokContact='" + nokContact + '\'' +
                ", nokRelationship='" + nokRelationship + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardId='" + cardId + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", actionBy='" + actionBy + '\'' +
                '}';
    }
}
