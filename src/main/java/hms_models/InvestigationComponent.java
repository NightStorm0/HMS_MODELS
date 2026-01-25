package hms_models;

/**
 * Model class representing a component of a multi-part investigation test.
 * For example, an Electrolyte Panel investigation would have components like
 * Sodium, Potassium, Chloride, and Bicarbonate.
 */
public class InvestigationComponent {
    private Integer id;
    private Integer investigationId;
    private String componentCode;  // Globally unique code (e.g., "NA" for Sodium)
    private String componentName;  // Display name (e.g., "Sodium")
    private String unit;           // e.g., "mmol/L"
    private String normalRange;    // e.g., "135-145"
    private Integer displayOrder;  // For consistent UI ordering
    private String description;
    private String createdAt;

    // Constructors
    public InvestigationComponent() {
    }

    public InvestigationComponent(Integer investigationId, String componentCode, String componentName,
            String unit, String normalRange, Integer displayOrder) {
        this.investigationId = investigationId;
        this.componentCode = componentCode;
        this.componentName = componentName;
        this.unit = unit;
        this.normalRange = normalRange;
        this.displayOrder = displayOrder;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvestigationId() {
        return investigationId;
    }

    public void setInvestigationId(Integer investigationId) {
        this.investigationId = investigationId;
    }

    public String getComponentCode() {
        return componentCode;
    }

    public void setComponentCode(String componentCode) {
        this.componentCode = componentCode;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
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

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "InvestigationComponent{" +
                "id=" + id +
                ", investigationId=" + investigationId +
                ", componentCode='" + componentCode + '\'' +
                ", componentName='" + componentName + '\'' +
                ", unit='" + unit + '\'' +
                ", normalRange='" + normalRange + '\'' +
                ", displayOrder=" + displayOrder +
                '}';
    }
}
