package designPatterns.cart.model;

public interface I_Item {
    int getId();

    void setId(int id);

    String getName();

    void setName(String name);

    int getDiscount();

    void setDiscount(int discount);

    double getPrice();
    double getPriceWithoutDiscount();


}
