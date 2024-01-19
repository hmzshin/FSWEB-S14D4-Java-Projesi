package com.s14d4.ProductForSale;

public class Bread extends ProductForSale {
    private String kind;


    public Bread(String type, long price, String description, String kind) {
        super(type, price, description);
        this.kind = kind;
    }

    @Override
    public void showDetails() {
        System.out.println("{" + "price:" + super.getPrice() + "," + "type:" + super.getType() + "," + "description:" + super.getDescription() + "," + "kind:" + this.kind);
    }
}
