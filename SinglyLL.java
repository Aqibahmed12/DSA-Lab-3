/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EURO COMPUTERS
 */
import java.lang.*;
public class SinglyLL {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public void insertNode(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    
    public void delete() {
        if (head == null) {
            System.out.println("List is empty, not possible to delete");
            return;
        }

        System.out.println("Deleted: " + head.data);
        head = head.next;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }


    public void searchByValue(int value) {
        Node node = head;
        int position = 1; 
        boolean found = false;

        while (node != null) {
            if (node.data == value) {
                System.out.println("Value " + value + " found at position " + position);
                found = true;
                break;
            }
            node = node.next;
            position++;
        }

        if (!found) {
            System.out.println("Value " + value + " not found in the list.");
        }
    }

    public static void main(String args[]) {
         SinglyLL listObj = new  SinglyLL();

        listObj.insertNode(25);
        listObj.insertNode(20);
        listObj.insertNode(15);
        listObj.insertNode(10);
        listObj.insertNode(5);
 
        
        listObj.display();

        listObj.delete();
        listObj.searchByValue(5); 
    }
}

