package designPatterns.cart.model;

public class Item implements I_Item {
    private int id;
    private String name;
    private long barcode;
    private int discount;
    private double price;

    public Item(int id, String name, long barcode, double price, int discount) {
        this.id = id;
        this.name = name;
        this.barcode = barcode;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price*((100.0-discount)/100.0);
    }
    public double getPriceWithoutDiscount() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                '\"'+"type"+'\"' + ":" + '\"'+"Item"+ '\"'+
                ","+'\"'+ "id"+'\"' + ":" + id +
                ","+'\"'+ "name"+'\"' + ":" + '\"'+ name + '\"' +
                ","+'\"'+ "barcode"+'\"' + ":" + barcode +
                ","+'\"'+ "discount"+'\"' + ":" + discount +
                ","+'\"'+ "price"+'\"' + ":" + getPrice() +
                ","+'\"'+ "priceDS"+'\"' + ":" + getPriceWithoutDiscount() +
                '}';
    }
}
