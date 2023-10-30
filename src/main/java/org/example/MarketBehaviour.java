package org.example;

public interface MarketBehaviour {
    void placeOrder(String order);         // Размещает заказ

    void fulfillOrder();                   // Выполняет заказ
}
