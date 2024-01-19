public class Coke extends ProductForSale {
    private String brand;

    public Coke(String type, long price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("{" + "price:" + super.getPrice() + "," + "type:" + super.getType() + "," + "description:" + super.getDescription() + "," + "brand:" + this.brand);
    }
}
