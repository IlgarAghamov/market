package org.example;

public interface QueueBehaviour {
    void enqueue(String person); // Добавляет человека в очередь

    String dequeue();            // Удаляет и возвращает первого человека из очереди
}
