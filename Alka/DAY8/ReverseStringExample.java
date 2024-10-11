package Pappu.DAY8;

public class ReverseStringExample {
    
    public static String reverseString(String str){
        if(str.equals("")) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    

    public static void main(String[] args) {
        String str = "recursion";  
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

}
