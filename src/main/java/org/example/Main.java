package org.example;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();
        market.enqueue("Person 1");
        market.enqueue("Person 2");
        System.out.println(market.dequeue()); // выводит "Person 1"
        market.placeOrder("Order 1");
        market.fulfillOrder();
        market.update();

    }
}
