public class Store {
    public static void main(String[] args) {
/*        ProductForSale product1 = new Chocolate("Black", 200, "Best chocolate in the world", 60);
        ProductForSale product2 = new Coke("Diet", 500, "Without sugar", "Turkish Coke");
        ProductForSale product3 = new Bread("Brown", 300, "Stay healthy with healthy bread", "Wholewheat");
        product2.setPrice(5);
        System.out.println(product2.getSalesPrice(12));
        ;
        System.out.println(product3.getSalesPrice(12));
        ;

        ProductForSale[] products = {product1, product2, product3};
        listProducts(products);*/

        Troll troll = new Troll("Troll", 200, 1000);
        System.out.println(troll.attack());

    }

/*    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }*/
}