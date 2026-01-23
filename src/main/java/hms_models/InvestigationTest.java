package hms_models;

/**
 * Model class representing a Laboratory Test in the investigations catalog.
 * This represents the master catalog of available tests that can be ordered,
 * not individual orders (which are represented by Investigation class).
 */
public class InvestigationTest {
    private Integer id;
    private String testCode;
    private String testName;
    private String category;
    private String unit;
    private String normalRange;
    private Double price;
    private String sampleType;
    private String turnaroundTime;
    private String description;
    private Integer active;
    private String createdAt;
    private String updatedAt;

    // Constructors
    public InvestigationTest() {
        this.active = 1; // Default to active
    }

    public InvestigationTest(String testCode, String testName, String category,
            String unit, String normalRange, Double price) {
        this.testCode = testCode;
        this.testName = testName;
        this.category = category;
        this.unit = unit;
        this.normalRange = normalRange;
        this.price = price;
        this.active = 1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestCode() {
        return testCode;
    }

    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNormalRange() {
        return normalRange;
    }

    public void setNormalRange(String normalRange) {
        this.normalRange = normalRange;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public String getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(String turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    // Utility methods
    public boolean isActive() {
        return active != null && active == 1;
    }

    @Override
    public String toString() {
        return "InvestigationTest{" +
                "id=" + id +
                ", testCode='" + testCode + '\'' +
                ", testName='" + testName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", active=" + active +
                '}';
    }
}
