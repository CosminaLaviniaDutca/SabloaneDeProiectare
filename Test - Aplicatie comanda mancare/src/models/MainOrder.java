package models;

import services.*;

public class MainOrder extends Order implements iOrder{
    private String name;
    private double number;

    public MainOrder(String name, double number) {
        super();
        this.name = name;
        this.number = number;
    }

    public void addOrder(iOrder newSubOrder) {
        super.addOrder(newSubOrder);
    }

    @Override
    public void print(){
        System.out.println("Order with name: " + this.name + ", with no. " + this.number);
        super.print();
    }
    @Override
    public void accept(Visitor visitor) {
        super.accept(visitor);
    }
}
