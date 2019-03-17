package designPatterns.cart.model;

public interface I_Item {
    int getId();

    void setId(int id);

    String getName();

    void setName(String name);

    int getSale();

    void setSale(int sale);

    double getPrice();
    double getPriceWithoutSales();


}
