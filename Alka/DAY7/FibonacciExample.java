package Pappu.DAY7;

public class FibonacciExample {

    
    public static int fibonacci(int n) {
       
        if (n == 0 || n == 1) {
            return n;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
