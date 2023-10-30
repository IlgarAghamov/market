package org.example;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<String> queue;     // Список для хранения очереди людей
    private List<String> orders;    // Список для хранения заказов
    private boolean orderFulfilled; // Флаг, указывающий, выполнен ли заказ

    public Market() {
        this.queue = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.orderFulfilled = false;
    }

    // Метод добавления человека в очередь
    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    // Метод удаления и возврата первого человека из очереди
    @Override
    public String dequeue() {
        if (!queue.isEmpty()) {
            return queue.remove(0);
        } else {
            return null;
        }
    }

    // Метод размещения заказа
    @Override
    public void placeOrder(String order) {
        orders.add(order);
        System.out.println("Order placed: " + order);
    }

    // Метод выполнения заказа
    @Override
    public void fulfillOrder() {
        if (!orders.isEmpty()) {
            String currentOrder = orders.get(0);
            System.out.println("Order fulfilled: " + currentOrder);
            orders.remove(0);
            orderFulfilled = true;
        } else {
            System.out.println("No orders to fulfill.");
        }
    }

    // Метод обновления состояния магазина
    public void update() {
        if (orderFulfilled) {
            System.out.println("Market state updated after order fulfillment.");
            orderFulfilled = false;
        } else {
            System.out.println("No updates at this time.");
        }
    }
}
