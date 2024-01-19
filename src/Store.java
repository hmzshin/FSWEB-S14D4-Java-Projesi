import com.s14d4.ProductForSale.Bread;
import com.s14d4.ProductForSale.Chocolate;
import com.s14d4.ProductForSale.Coke;
import com.s14d4.RPGGame.Troll;

public class Store {
    public static void main(String[] args) {
        com.s14d4.ProductForSale.ProductForSale product1 = new Chocolate("Black", 200, "Best chocolate in the world", 60);
        com.s14d4.ProductForSale.ProductForSale product2 = new Coke("Diet", 500, "Without sugar", "Turkish Coke");
        com.s14d4.ProductForSale.ProductForSale product3 = new Bread("Brown", 300, "Stay healthy with healthy bread", "Wholewheat");

        System.out.println(product2.getSalesPrice(12));
        ;
        System.out.println(product3.getSalesPrice(12));
        ;

        com.s14d4.ProductForSale.ProductForSale[] products = {product1, product2, product3};
        listProducts(products);

        Troll troll = new Troll("com.s14d4.RPGGame.Troll", 200, 1000);
        System.out.println(troll.attack());

    }

    public static void listProducts(com.s14d4.ProductForSale.ProductForSale[] products) {
        for (com.s14d4.ProductForSale.ProductForSale product : products) {
            product.showDetails();
        }
    }
}