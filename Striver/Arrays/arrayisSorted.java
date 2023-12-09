package Striver.Arrays;

public class arrayisSorted {

    static boolean isArraySorted(int[] arr){
        for(int i= 1;i<arr.length;i++){
            if(arr[i]  < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,10,7,8};
        System.out.println(isArraySorted(arr));
    }
    
}
