package Pappu.DAY7;

public class PalindromeExample {

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Base case: if the string has 0 or 1 character, it is a palindrome
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        // Recursive case: check if first and last characters are the same, and continue checking the substring between them
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        // If the first and last characters are not the same, it's not a palindrome
        return false;
    }

    public static void main(String[] args) {
        String str = "madam"; // Change this to test different strings
        boolean result = isPalindrome(str);
        System.out.println(str + " is a palindrome: " + result);
    }
}
