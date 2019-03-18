package designPatterns.cart;

import designPatterns.cart.model.Cart;
import designPatterns.cart.model.Item;

public class Main {

    public static void main(String[] args)
    {
        Cart myCart = new Cart(1);
        myCart.setDiscount(10);
        Item laptop = new Item(1, "laptop", 12125101, 135000, 10);
        myCart.addItem(laptop);
        Cart myNestedCart = new Cart (2, "printer+laptop");
        myNestedCart.setDiscount(25);
        Item myNestedLaptop = new Item (1,"laptop",682786711,135000,0);
        myNestedCart.addItem(myNestedLaptop);
        Item myNestedPrinter = new Item (2,"printer",64565446,50000,0);
        myNestedCart.addItem(myNestedPrinter);
        myCart.addItem(myNestedCart);
        System.out.println(myCart.toString());
    }
}
