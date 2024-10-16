package Pappu.DAY9;

public class ReverseList {
    
    static class  Node{
        int data;
        Node next;
        Node(int data,Node ptr){
            this.data = data;
            this.next=ptr;
          }
        Node(int data){
              this.data = data;
              this.next=null;
            }
    }

    public static void main(String[] args){
          int[] arr ={1,2,3,4};
          Node head =  new  Node(arr[0]);
          for(int i=1;i<arr.length;i++){
           Node te
          }
          
          head.next = new Node(arr[1]);
          System.out.println("temp "+head.next.data);
    }
 
}
