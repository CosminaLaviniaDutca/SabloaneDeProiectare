package models;
import services.*;
public class Salad implements iOrder{
    private String name;
    private double price;

    public Salad(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("\t\tSalad: " + this.name + " - price: " + this.price + " RON.");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitSalad(this);
    }
    public double getPrice() { return price; }
}
