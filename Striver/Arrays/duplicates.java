package Striver.Arrays;

public class duplicates {
        static int duplicate(int[] arr){
            int i = 0;
            for (int j = 1;j<arr.length;j++){
                if(arr[i] != arr[j]){
                    i++;
                    arr[i] = arr[j];
                }
            }
            return i+1; //incrementing by 1 to return the exact size of the array
        }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5,5};
        int originalArrNumbers = duplicate(arr);
        for (int i = 0;i<originalArrNumbers;i++){
            System.out.print(arr[i]+" ");
            
        }
        

    }
}
