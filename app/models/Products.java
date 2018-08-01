package models;

/**
 * Created by Computer on 12/7/2561.
 */
public class Products {
    private String title,detail;
    private double price;
    private int amount;


    public Products(String title, String detail, double price, int amount) {
        this.title = title;
        this.detail = detail;
        this.price = price;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
