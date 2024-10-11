package Pappu.DAY8;

public class PalindromeCheck {
    public static Boolean isPalindrome(String str){
        if(str.length()==0 || str.length() ==1){
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1, str.length()-1));
        }
        return false;
    }

    public static void main(String[] args){
        String str = "madam";
        Boolean revStr = isPalindrome(str);
        System.out.println("Palindrome Check: "+revStr);
    }
    
}
