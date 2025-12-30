/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackQueue;

/**
 *
 * @author BAT SHOP
 */
import java.util.Stack;
public class stackQueueDequeueFriendly {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int dequeue() {
        if (s1.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return s1.pop();
    }

    public static void main(String[] args) {
        stackQueueDequeueFriendly q = new stackQueueDequeueFriendly();
        q.enqueue(18);
        q.enqueue(22);
        q.enqueue(39);

        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
    }
}

