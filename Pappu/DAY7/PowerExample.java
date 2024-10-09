package Pappu.DAY7;

public class PowerExample {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;  
        int n = 5;  
        int result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}

