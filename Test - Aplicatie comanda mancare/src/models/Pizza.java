package models;
import services.*;
public class Pizza implements iOrder{
    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("\t\tPizza: " + this.name + " - price: " + this.price + " RON.");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPizza(this);
    }
    public double getPrice() { return price; }
}
