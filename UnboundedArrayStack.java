/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unboundedarraystack;

/**
 *
 * @author BAT SHOP
 */
import java.util.Arrays;
public class UnboundedArrayStack { 

    private int[] arr;
    private int top;

    public UnboundedArrayStack() {
        arr = new int[2]; 
        top = -1;
    }

    public void push(int x) {
        if (top + 1 == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        int val = arr[top--];
        if (top + 1 <= arr.length / 4 && arr.length > 2) {
            arr = Arrays.copyOf(arr, arr.length / 2);
        }
        return val;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        UnboundedArrayStack stack = new UnboundedArrayStack();
        stack.push(5);
        stack.push(15);
        stack.push(17);

        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
    }
}