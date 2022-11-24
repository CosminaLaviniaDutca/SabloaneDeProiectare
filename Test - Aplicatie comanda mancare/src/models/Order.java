package models;

import services.*;

import java.util.ArrayList;

public class Order implements iOrder{
    private String name;
    private double number;
    private ArrayList<iOrder> orders = new ArrayList<>();

    public Order() {}
    public Order(String name, double number) {
        this.name = name;
        this.number = number;
    }

    public void addOrder(iOrder newOrder) {
        this.orders.add(newOrder);
    }

    @Override
    public void print(){
        if(this.name!=null){
            System.out.println("\tOrder with name: " + this.name + ", with no. " + this.number);
        }
        for (iOrder iO : orders) {
            iO.print();
        }
    }
    @Override
    public void accept(Visitor visitor) {
        for (iOrder iO: this.orders) {
            iO.accept(visitor);
        }
    }
}
