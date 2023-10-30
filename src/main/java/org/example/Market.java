package org.example;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<String> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    @Override
    public String dequeue() {
        if (!queue.isEmpty()) {
            return queue.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public void placeOrder(String order) {
        // logic to place the order
    }

    @Override
    public void fulfillOrder() {
        // logic to fulfill the order
    }

    public void update() {
        // logic to update the market state
    }
}