package Pappu.DAY8;

public class SumOfArrayExample {

    public static int ArraySum(int[] arr,int n){
        if(n<=0){
            return 0;
        }

        return arr[n-1] + ArraySum(arr,n-1);
    }

    public static void main(String[] args){
        int[] arr ={1,2,34,5,6,5};
        int sum =ArraySum(arr,arr.length);
        System.out.println("Sum of Array is :"+sum);
    }
    
}
