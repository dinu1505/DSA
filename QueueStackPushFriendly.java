/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queuestack.pushfriendly;

/**
 *
 * @author BAT SHOP
 */
import java.util.LinkedList;
import java.util.Queue;
public class QueueStackPushFriendly {

  private Queue<Integer> q1 = new LinkedList<>();    
  private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int popped = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return popped;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        QueueStackPushFriendly stack = new QueueStackPushFriendly();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
    }
}
