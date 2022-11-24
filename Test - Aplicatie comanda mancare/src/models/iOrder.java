package models;
import services.*;
public interface iOrder {
    public void print();
    public void accept(Visitor visitor);
}
