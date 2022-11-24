package services;

import models.*;

public class PriceCalcVisitor implements Visitor {
    private double pizzaPrice;
    private double pastaPrice;
    private double saladPrice;

    public PriceCalcVisitor() {
        this.pizzaPrice = 0;
        this.pastaPrice = 0;
        this.saladPrice = 0;
    }

    @Override
    public void visitPizza(Pizza pizza) {
        this.pizzaPrice += pizza.getPrice();
    }
    @Override
    public void visitPasta(Pasta pasta) {
        this.pastaPrice += pasta.getPrice();
    }
    @Override
    public void visitSalad(Salad salad) {
        this.saladPrice += salad.getPrice();
    }

    public void foodTypePrice() {
        System.out.println("\tTotal pizza price: " + this.pizzaPrice + " RON.");
        System.out.println("\tTotal pasta price: " + this.pastaPrice + " RON.");
        System.out.println("\tTotal salad price: " + this.saladPrice + " RON.");
    }

    public void foodTotalPrice() {
        double total = this.pizzaPrice + this.pastaPrice + this.saladPrice;
        System.out.println("\tTotal price of the order: " + total + " RON.");
    }
}