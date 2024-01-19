package com.s14d4.ProductForSale;

public abstract class ProductForSale {
    private String type;
    private long price;
    private String description;

    public ProductForSale(String type, long price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {

        return type;
    }

    public long getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public long getSalesPrice(int quantity) {
        return quantity * price;
    }

    public abstract void showDetails();

}
