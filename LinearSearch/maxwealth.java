package LinearSearch;

import java.util.Scanner;

public class maxwealth {
   public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] arr = new int[5];
            for(int i=0;i<arr.length;i++){
                System.out.println("Enter the element at index:"+i);
                arr[i] = input.nextInt();
            }
            System.out.println(java.util.Arrays.toString(arr));

   }
}
