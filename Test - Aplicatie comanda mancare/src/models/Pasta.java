package models;
import services.*;
public class Pasta implements iOrder{
    private String name;
    private double price;

    public Pasta(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("\t\tPasta: " + this.name + " - price: " + this.price + " RON.");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPasta(this);
    }
    public double getPrice() { return price; }
}
