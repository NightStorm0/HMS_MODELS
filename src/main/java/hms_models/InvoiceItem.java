package hms_models;

/**
 * Represents a line item on an invoice.
 * Multiple items can belong to a single invoice.
 */
public class InvoiceItem {
    private Integer id;
    private Integer invoiceId;
    private String itemType; // lab, drug, consult, ward, procedure, misc
    private String itemName; // "CBC", "Paracetamol 500mg", "Consultation Fee"
    private Integer refId; // optional: id from source table (investigation_id, inventory_id)
    private Double quantity;
    private Double unitPrice;
    private Double discount;
    private Double lineTotal; // (quantity * unitPrice) - discount
    private String createdAt;

    public InvoiceItem() {
        this.quantity = 1.0;
        this.discount = 0.0;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getRefId() {
        return refId;
    }

    public void setRefId(Integer refId) {
        this.refId = refId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(Double lineTotal) {
        this.lineTotal = lineTotal;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Calculate line total from quantity, unit price, and discount
     */
    public void calculateLineTotal() {
        double qty = quantity != null ? quantity : 1.0;
        double price = unitPrice != null ? unitPrice : 0.0;
        double disc = discount != null ? discount : 0.0;
        this.lineTotal = (qty * price) - disc;
    }
}
