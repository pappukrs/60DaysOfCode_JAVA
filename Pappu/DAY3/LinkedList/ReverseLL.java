package Pappu.DAY3.LinkedList;

 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node ptr) {
        this.data = data;
        this.next = ptr;
     }
   }

public class ReverseLL {

    public static Node reverseList(Node head) {
        Node prev = null;  // Previous node starts as null
        Node current = head;  // Current node starts at the head

        while (current != null) {
            Node nextNode = current.next;  // Store the next node
            current.next = prev;  // Reverse the current node's pointer
            prev = current;  // Move prev to this node
            current = nextNode;  // Move to the next node
        }
        return prev;  // New head of the reversed list
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        // Reversing the linked list
        head = reverseList(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
