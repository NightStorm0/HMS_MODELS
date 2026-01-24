package hms_models;

import java.util.List;

/**
 * Represents a billing invoice for a patient.
 * One invoice can contain multiple invoice items.
 */
public class Invoice {
    private Integer id;
    private String invoiceNumber; // AVI-INV-000123
    private String patientId;
    private Integer encounterId; // nullable: for OPD
    private Integer admissionId; // nullable: for Inpatient
    private String status; // unpaid, partial, paid, void
    private Double total; // sum of all line items
    private Double amountPaid; // sum of all payments
    private String actionBy; // user who created
    private String createdAt;
    private String notes;

    // Transient fields for UI
    private String patientName;
    private List<InvoiceItem> items;
    private List<Payment> payments;

    public Invoice() {
        this.status = "unpaid";
        this.total = 0.0;
        this.amountPaid = 0.0;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Integer getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(Integer encounterId) {
        this.encounterId = encounterId;
    }

    public Integer getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(Integer admissionId) {
        this.admissionId = admissionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    /**
     * Calculate the outstanding balance
     */
    public Double getBalance() {
        return (total != null ? total : 0.0) - (amountPaid != null ? amountPaid : 0.0);
    }

    /**
     * Check if invoice is fully paid
     */
    public boolean isFullyPaid() {
        return getBalance() <= 0;
    }
}
