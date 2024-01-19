package com.s14d4.ProductForSale;

public class Chocolate extends ProductForSale {
    private double cacaoPercentage;

    public Chocolate(String type, long price, String description, double cacaoPercentage) {
        super(type, price, description);
        this.cacaoPercentage = cacaoPercentage;
    }


    @Override
    public void showDetails() {
        System.out.println("{" + "price:" + super.getPrice() + "," + "type:" + super.getType() + "," + "description:" + super.getDescription() + "," + "cacaoPercentage:" + this.cacaoPercentage);
    }

}
