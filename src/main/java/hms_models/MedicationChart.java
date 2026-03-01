package hms_models;

public class MedicationChart {
    private Integer id;
    private Integer prescriptionId;
    private String medicationName;
    private String medicationBrand;
    private Double quantityGiven;
    private String unitGiven;
    private String route;
    private String scheduledTime;
    private String administrationTime;
    private String status; // "GIVEN", "OMITTED", "REFUSED", "PENDING"
    private Integer inventoryId;
    private String actionBy;

    public MedicationChart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getMedicationBrand() {
        return medicationBrand;
    }

    public void setMedicationBrand(String medicationBrand) {
        this.medicationBrand = medicationBrand;
    }

    public Double getQuantityGiven() {
        return quantityGiven;
    }

    public void setQuantityGiven(Double quantityGiven) {
        this.quantityGiven = quantityGiven;
    }

    public String getUnitGiven() {
        return unitGiven;
    }

    public void setUnitGiven(String unitGiven) {
        this.unitGiven = unitGiven;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public String getAdministrationTime() {
        return administrationTime;
    }

    public void setAdministrationTime(String administrationTime) {
        this.administrationTime = administrationTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    @Override
    public String toString() {
        return "MedicationChart{" +
                "id=" + id +
                ", prescriptionId=" + prescriptionId +
                ", medicationName='" + medicationName + '\'' +
                ", medicationBrand='" + medicationBrand + '\'' +
                ", quantityGiven=" + quantityGiven +
                ", unitGiven='" + unitGiven + '\'' +
                ", route='" + route + '\'' +
                ", scheduledTime='" + scheduledTime + '\'' +
                ", administrationTime='" + administrationTime + '\'' +
                ", status='" + status + '\'' +
                ", inventoryId=" + inventoryId +
                ", actionBy='" + actionBy + '\'' +
                '}';
    }
}
