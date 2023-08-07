package BinarySearch;

public class ceiling {
    public static void main(String[] args) {
        int[] arr ={2,3,5,7,13,15,20};
        int target = 0;   //output should be 15 i.e 15>=14(min)
        System.out.println(ceiling(arr, target));

    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <=end){
            int mid = start +(end-start)/2;
            if(arr[mid] > target){
                return mid;
            }
            else if(target >= arr[mid]){
                start = mid+1;
                
                
            }
            else{
                end = mid-1;
            }
        }
        return -1 ;
    }
}
