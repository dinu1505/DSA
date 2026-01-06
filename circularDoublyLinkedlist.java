/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author BAT SHOP
 */
public class circularDoublyLinkedlist {
      class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;
        newNode.next = head;
        head.prev = newNode;
    }

    // Display list
    public void display() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        circularDoublyLinkedlist list = new circularDoublyLinkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
    }
}
