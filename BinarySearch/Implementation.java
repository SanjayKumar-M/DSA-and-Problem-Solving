package BinarySearch;

public class Implementation {
    //implementation of binary search in java
    public static void main(String[] args) {
            int [] arr = {1,2,3,56,78,99,123,546,435,433};
            int [] des_arr = {567,364,231,77,66,43,21,10,1};
            int target = 435;
            int target2 = 77;
            System.out.println(search(arr, target));
            System.out.println(OrderAgostinicBinarySearch(des_arr, target2));
    }
    static int search(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start+(end-start) /2; 
            if(target < arr[mid]){
                end = mid-1;
            }
            if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
    static int OrderAgostinicBinarySearch(int[] des_arr,int target){
        //kind of approach of descending order array i.e big to small
        //int [] des_arr = {567,364,231,77,66,43,21,10,1};
        int start = 0;
        int end = des_arr.length-1;
        while (start <=end){
            int mid = start+(end-start)/2;
            if(des_arr[mid] == target){
                return mid;
            }
            else if(target>des_arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
