package hms_models;

/**
 * Model class representing a single component result for a lab order.
 * When a test is completed, results are stored as individual components.
 * For single-value tests, there will be one component result.
 * For multi-component tests (e.g., Electrolytes), there will be multiple component results.
 */
public class LabResultComponent {
    private Integer id;
    private Integer labOrderId;
    private String componentCode;    // Links to investigation_components (e.g., "NA" for Sodium)
    private String value;            // The actual result value (e.g., "140")
    private Integer isAbnormal;      // 0 = normal, 1 = abnormal
    private String recordedAt;

    // Transient fields populated from JOIN with investigation_components
    private String componentName;    // Display name (e.g., "Sodium")
    private String unit;             // e.g., "mmol/L"
    private String normalRange;      // e.g., "135-145"

    // Constructors
    public LabResultComponent() {
    }

    public LabResultComponent(Integer labOrderId, String componentCode, String value, Integer isAbnormal) {
        this.labOrderId = labOrderId;
        this.componentCode = componentCode;
        this.value = value;
        this.isAbnormal = isAbnormal;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLabOrderId() {
        return labOrderId;
    }

    public void setLabOrderId(Integer labOrderId) {
        this.labOrderId = labOrderId;
    }

    public String getComponentCode() {
        return componentCode;
    }

    public void setComponentCode(String componentCode) {
        this.componentCode = componentCode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getIsAbnormal() {
        return isAbnormal;
    }

    public void setIsAbnormal(Integer isAbnormal) {
        this.isAbnormal = isAbnormal;
    }

    public String getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(String recordedAt) {
        this.recordedAt = recordedAt;
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

    @Override
    public String toString() {
        return "LabResultComponent{" +
                "id=" + id +
                ", labOrderId=" + labOrderId +
                ", componentCode='" + componentCode + '\'' +
                ", componentName='" + componentName + '\'' +
                ", value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                ", normalRange='" + normalRange + '\'' +
                ", isAbnormal=" + isAbnormal +
                '}';
    }
}
