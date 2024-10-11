package Pappu.DAY7;

public class ReverseStringExample {

    public static String reverse(String str) {
        
        if (str.isEmpty()) {
            return str;
        }
        
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "hello"; 
        String reversedStr = reverse(str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
