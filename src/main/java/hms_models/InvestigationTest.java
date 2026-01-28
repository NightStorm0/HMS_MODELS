package hms_models;

import java.util.List;

/**
 * Model class representing a Laboratory Test in the investigations catalog.
 * This represents the master catalog of available tests that can be ordered,
 * not individual orders (which are represented by LabOrder class).
 */
public class InvestigationTest {
    private Integer id;
    private String investigationId; // NEW: INV-XXX-XXX
    private String testCode;
    private String testName;
    private String category;
    // private String unit; // DEPRECATED
    // private String normalRange; // DEPRECATED
    private Double price;
    private String sampleType;
    private String turnaroundTime;
    private String description;
    // private Integer hasComponents; // DEPRECATED: All tests now have at least 1
    // component
    private Integer active;
    private String createdAt;
    private String updatedAt;

    // Transient field - populated on demand
    private List<InvestigationComponent> components;

    // Constructors
    public InvestigationTest() {
        this.active = 1; // Default to active
        // this.hasComponents = 0; // DEPRECATED
    }

    public InvestigationTest(String testCode, String testName, String category,
            Double price) {
        this.testCode = testCode;
        this.testName = testName;
        this.category = category;
        this.price = price;
        this.active = 1;
    }

    public String getInvestigationId() {
        return investigationId;
    }

    public void setInvestigationId(String investigationId) {
        this.investigationId = investigationId;
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

    // Deprecated fields removed from getter/setter

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

    public List<InvestigationComponent> getComponents() {
        return components;
    }

    public void setComponents(List<InvestigationComponent> components) {
        this.components = components;
    }

    // Utility methods
    public boolean isActive() {
        return active != null && active == 1;
    }

    public boolean hasComponents() {
        // return hasComponents != null && hasComponents == 1;
        return true; // All tests now have at least 1 component
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
