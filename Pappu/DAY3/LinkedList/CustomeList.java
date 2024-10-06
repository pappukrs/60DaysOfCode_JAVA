package Pappu.DAY3.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data) {
           this.data = data;
           this.next = null;
    }
    Node(int data,Node ptr) {
        this.data = data;
        this.next = ptr;
 }
}

public class CustomeList{
    public static Node arraytoLL(int[] arr){
        Node mover = new Node(arr[0]);
        Node head = mover;
        for(int i=1; i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover=mover.next;
        }
        return head;
    }
      
    public static void llTraversal(Node head){
      Node mover = head;
      while(mover!=null){
        System.out.println("mover data: "+mover.data);
        System.out.println("mover next: "+mover.next);
        mover = mover.next;
      }
    }

    public static int findElementExist(Node head, int val){

        if(head==null){
            return 0;
        }
      
        Node mover = head;
        while(mover!=null){
            if(mover.data==val){
                return 1;
            }
            mover=mover.next;
        }
        return 0;
    }


    public static Node findElementExistAndReturnNode(Node head,int val){

        if(head==null){
            return null;
        }
        Node mover = head;
        while(mover!=null){
            if (mover.data==val){
                return mover;
            }
            mover = mover.next;
        }
        return null;
    }


    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        Node head = arraytoLL(arr);
        System.out.println("Traversal of linkedlist  ");
        llTraversal( head);
        String existence = findElementExist(head, 30)==1?"exist":"not Exist";

        System.out.println("Elememt 3 :" +existence);

        System.out.println("Node reference");

        Node foundNode = findElementExistAndReturnNode(head, 3);
          if (foundNode != null) {
         System.out.println("Element 3 found at node address: " + foundNode);
        } else {
        System.out.println("Element 3 not found in the linked list.");
        }
    }
}