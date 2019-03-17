import designPatterns.cart.model.Cart;
import designPatterns.cart.model.Item;

public class Main {

    public static void main(String[] args)
    {
        Cart myCart = new Cart(1);
        myCart.setSale(10);
        Item laptop = new Item(1, "laptop", 1324567985, 135000, 10);
        myCart.addItem(laptop);
        Cart myNestedCart = new Cart (2, "printer+laptop");
        myNestedCart.setSale(0);
        Item myNestedLaptop = new Item (1,"laptop",682786711,100000,0);
        myNestedCart.addItem(myNestedLaptop);
        Item myNestedPrinter = new Item (2,"printer",64565446,150000,0);
        myNestedCart.addItem(myNestedPrinter);
        myCart.addItem(myNestedCart);
        System.out.println(myCart.toString());
    }
}
