
import java.util.Arrays;


class ArrayExample {

    public static void main(String[] args){

        // Create an array of integers with a fixed size

        // int[] numbers = new int[5];

        // numbers[0]=1;
        // numbers[1]=2;
        // numbers[2]=3;
        // numbers[3]=4;

        
        // Integer array
        int[] numbers = {1, 2, 3, 4};
        System.out.println("int array: " + Arrays.toString(numbers));

        // Boolean array
        Boolean[] bool = {true, false, true, false};
        System.out.println("Boolean array: " + Arrays.toString(bool));

        // Character array
        char[] chars = {'A', 'B', 'C', 'D'};
        System.out.println("char array: " + Arrays.toString(chars));

        // String array
        String[] strings = {"Hello", "World", "Java"};
        System.out.println("String array: " + Arrays.toString(strings));

        // Double array
        double[] doubles = {1.1, 2.2, 3.3, 4.4};
        System.out.println("double array: " + Arrays.toString(doubles));

        // Array of arrays (2D array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D array: " + Arrays.deepToString(matrix));

    }
}