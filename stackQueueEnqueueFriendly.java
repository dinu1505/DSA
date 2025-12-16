/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackQueue;

/**
 *
 * @author BAT SHOP
 */
import java.util.Stack;
public class stackQueueEnqueueFriendly {

   private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return s2.pop();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        stackQueueEnqueueFriendly queue = new stackQueueEnqueueFriendly();
        queue.enqueue(46);
        queue.enqueue(56);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
    }
}
