/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackQueue;

/**
 *
 * @author BAT SHOP
 */
public class ArrayCircularQueue {

    private int[] queue;
    private int front, rear, size, capacity;

    public ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int x) {
        if (size == capacity) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = x;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        int val = queue[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue(3);
        q.enqueue(45);
        q.enqueue(72);
        q.enqueue(67);

        System.out.println(q.dequeue()); 
        q.enqueue(40);
        System.out.println(q.dequeue()); 
    }
}

