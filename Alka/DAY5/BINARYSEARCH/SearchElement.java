package Pappu.DAY5.BINARYSEARCH;

public class SearchElement {

    public static int searchElement(int[] arr,int target){

        int left=0;
        int right=arr.length-1;
        int idx =-1;
        while(left<=right){
            int mid = left+(right-left)/2 ;
            if(arr[mid]==target){
                idx = mid;
            }  
            else if(arr[mid]>target) right =mid-1;
            else left=mid+1;  
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int target = 5;
      int sol =  searchElement(arr,target);
      System.out.println("sol : "+sol);
    }
    
}
