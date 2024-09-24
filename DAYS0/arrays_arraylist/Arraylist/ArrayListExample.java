package DAYS0.arrays_arraylist.Arraylist;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]){
        ArrayList<Integer> list = new  ArrayList <Integer> ();



        try {

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    

        // Print ArrayList elements
        System.out.println("ArrayList elements: " + list);
        list.add(60);
        System.out.println("ArrayList elements: "+list);


        //remove one element from index
        list.remove(0);
        System.out.println("Updated ArrayList elements: "+list);

        list.add(1,10);
        System.out.println("Updated ArrayList elements:"+list);

        Boolean bool = list.isEmpty();
        System.out.println("bool "+bool);

        list.set(0, null);
        System.out.println("Updated ArrayList elements:"+list);
        list.add(0, null);
        System.out.println("Updated ArrayList elements:"+list);

        list.get(10);
        System.out.println("Updated ArrayList elements:"+list);

        } catch (Exception IndexOutOfBoundsException) {
            System.out.println("Error: Tried to access index 10, but list size is " + list.size());
        }




          // Initialize an ArrayList with some values
          ArrayList<String> stringList = new ArrayList<>();
          stringList.add("A");
          stringList.add("B");
          stringList.add("C");
          stringList.add("D");
  
          // Print the original list
          System.out.println("Original ArrayList elements: " + list);
  
          try {
              // Attempt to get the element at index 10
              String element = stringList.get(10);
              System.out.println("Element at index 10: " + element);
          } catch (IndexOutOfBoundsException e) {
              System.out.println("Error: Tried to access index 10, but list size is " + list.size());
          }

    }
}
