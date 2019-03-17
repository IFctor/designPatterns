package designPatterns.cart.model;

import java.util.ArrayList;
import java.util.List;

public class Cart implements I_Item  {
    private int id;
    private List<I_Item> items;
    private int sale;
    private String name="";

    public Cart(int id,  List<I_Item> items) {
        this.id = id;
        this.items = items;
    }

    public Cart(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }
    public Cart(int id, String name) {
        this.id = id;
        this.items = new ArrayList<>();
        this.name = name;
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


    public List<I_Item> getItems() {
        return items;
    }

    public void setItems(List<I_Item> items) {
        this.items = items;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getPrice() {
        double resultPrice=0;
        for (var item:items) {
            resultPrice+=item.getPrice();
        }
        return resultPrice*((100.0-sale)/100.0);
    }
    public double getPriceWithoutSales()
    {
        double resultPrice=0;
        for (var item:items) {
            resultPrice+=item.getPriceWithoutSales();
        }
        return resultPrice;
    }


    public void addItem(I_Item item) {
        items.add(item);
    }

    @Override
    public String toString() {
        return "{" +
                '\"'+"type"+'\"' + ":" + '\"'+"Chart"+ '\"'+
                ","+'\"'+ "id"+'\"' + ":" + id +
                ","+'\"'+ "name"+'\"' + ":" + '\"'+ name + '\"' +
                ","+'\"'+ "items"+'\"' + ":" + items +
                ","+'\"'+ "sale"+'\"' + ":" + sale +
                ","+'\"'+ "price"+'\"' + ":" + getPrice() +
                ","+'\"'+ "priceWS"+'\"' + ":" + getPriceWithoutSales() +
                '}';
    }
}