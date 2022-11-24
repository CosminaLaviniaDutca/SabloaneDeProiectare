import services.*;
import models.*;

public class Main {
     public static void main(String[] args) throws Exception {
         //the main order
         MainOrder mainOrder = new MainOrder("Order",1.0);
         //suborders - from different restaurants
         Order subOrder1 = new Order("Restaurant 1",1.1);
         Order subOrder2 = new Order("Restaurant 2",1.2);
         Order subOrder3 = new Order("Restaurant 3",1.3);
         Order subOrder4 = new Order("Restaurant 4",1.4);
         //food types ( pizza, pasta, salad )
         Pizza capriciosa = new Pizza("Capriciosa", 20.5);
         Pizza prosciutto = new Pizza("Prosciutto", 25.5);
         Pizza quatro = new Pizza("Quatro", 23.5);
         Pasta arabiata = new Pasta("Arabiata", 16);
         Pasta carbonara = new Pasta("Carbonara", 15);
         Pasta amatriciana = new Pasta("Amatriciana", 18);
         Salad caesar = new Salad("Caesar", 12);
         Salad greenBox = new Salad("Green Box", 15);
         Salad athena = new Salad("Athena", 14);
         Salad tuna = new Salad("Tuna", 20);
         //add food types to suborders
         //first restaurant
         subOrder1.addOrder(capriciosa);
         subOrder1.addOrder(prosciutto);
         subOrder1.addOrder(quatro);
         subOrder1.addOrder(greenBox);
         //second restaurant
         subOrder2.addOrder(arabiata);
         subOrder2.addOrder(carbonara);
         //third restaurant
         subOrder3.addOrder(caesar);
         //fourth restaurant
         subOrder4.addOrder(amatriciana);
         subOrder4.addOrder(athena);
         subOrder4.addOrder(tuna);
         //add suborders to main order
         mainOrder.addOrder(subOrder1);
         mainOrder.addOrder(subOrder2);
         mainOrder.addOrder(subOrder3);
         mainOrder.addOrder(subOrder4);
         //print the order
         mainOrder.print();
         System.out.println("--------------------------------------------------");
         //visitor
         PriceCalcVisitor visitor = new PriceCalcVisitor();
         mainOrder.accept(visitor);
         System.out.println("->Prices/food type:");
         visitor.foodTypePrice();
         System.out.println("->Total price:");
         visitor.foodTotalPrice();
    }
}