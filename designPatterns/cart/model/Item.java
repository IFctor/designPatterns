package designPatterns.cart.model;

public class Item implements I_Item {
    private int id;
    private String name;
    private long barcode;
    private int sale;
    private double price;

    public Item(int id, String name, long barcode, double price, int sale) {
        this.id = id;
        this.name = name;
        this.barcode = barcode;
        this.price = price;
        this.sale = sale;
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

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getPrice() {
        return price*((100.0-sale)/100.0);
    }
    public double getPriceWithoutSales() {
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
                ","+'\"'+ "sale"+'\"' + ":" + sale +
                ","+'\"'+ "price"+'\"' + ":" + getPrice() +
                ","+'\"'+ "priceWS"+'\"' + ":" + getPriceWithoutSales() +
                '}';
    }
}
