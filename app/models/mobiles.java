package models;

/**
 * Created by THAMON on 7/23/2018.
 */
public class mobiles {
    String id, brand, model;
    double price;
    int amount;

    public mobiles() {
    }

    public mobiles(String id, String brand, String model, double price, int amount) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
