package hms_models;

public  class InventoryItem {
    private int id;
    private String itemName;
    private String itemType;
    private int quantity;
    private double price;
    private double costPrice;
    private int lowThreshold;
    private String expiryDate;

    public InventoryItem() {
        // Default constructor
    }

    public InventoryItem(int id, String itemName, String itemType, int quantity, double price,
                         double costPrice, int lowThreshold, String expiryDate) {
        this.id = id;
        this.itemName = itemName;
        this.itemType = itemType;
        this.quantity = quantity;
        this.price = price;
        this.costPrice = costPrice;
        this.lowThreshold = lowThreshold;
        this.expiryDate = expiryDate;
    }


    // Getters
    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public int getLowThreshold() {
        return lowThreshold;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public void setLowThreshold(int lowThreshold) {
        this.lowThreshold = lowThreshold;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
