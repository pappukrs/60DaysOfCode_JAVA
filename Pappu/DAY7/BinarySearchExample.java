package Pappu.DAY7;

public class BinarySearchExample {

    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        
        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        }
        
        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};  
        int target = 10;  
        int result = binarySearch(arr, 0, arr.length - 1, target);
        
        if (result == -1) {
            System.out.println("Target not found in the array.");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}

