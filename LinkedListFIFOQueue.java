/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author BAT SHOP
 */
public class LinkedListFIFOQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node front = null, rear = null;

    // Enqueue operation
    public void enqueue(int x) {
        Node newNode = new Node(x);

        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue operation
    public int dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        int val = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return val;
    }

    public static void main(String[] args) {
        LinkedListFIFOQueue q = new LinkedListFIFOQueue();
        q.enqueue(10);
        q.enqueue(26);
        q.enqueue(39);

        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
    }
}

