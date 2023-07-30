import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int elements = input.nextInt();
        int[] arr = new int[elements];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the element at index : "+ i+1);
            arr[i] = input.nextInt();
        }
        System.out.println("The array is: ");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        //     System.out.println();
        // }
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(sum(arr));
        System.out.println(linear(arr, 500));
    }
    //sum of arrays
    static int sum(int arr[]){
        int sum = 0;
        for(int i  =0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("The sum of array is: ");
        return sum;
    }

    //linear search
    static int linear(int arr[],int target){
            for(int num: arr){
                if (target == num){
                    return 1;
                }
            }
            return 0;


    }

    
}
