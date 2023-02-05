package Session6.LearnOOP.BaiTap.QuanLyMuaBanSach;

import java.util.ArrayList;
import java.util.Date;

class Book {
    private String name;
    private int quantity;
    private double price;
    private Date importDate;

    public Book(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Book(String name, int quantity, double price, Date importDate) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.importDate = importDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }
}
