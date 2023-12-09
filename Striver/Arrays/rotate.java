package Striver.Arrays;

public class rotate {
    public static void main(String[] args) {
         int arr[] = {0,1,2,3,4,5,6};  //op-> [2,3,4,5,1]
        //taking 1st value and storing in variable
        int firstValue =  arr[0];
        for(int i=0;i<arr.length-1;i++){
            //iterating and storing values in current index of next index value
            //ex  at i = 0 -> value of index  1 is stored i.e 1
            arr[i] = arr[i+1];
        }
        //finally storing the 1st value at the last index
        arr[arr.length-1] = firstValue;

        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

        
    }
   
    
}
