package Striver.Arrays;

// Example 1:
// Input: [1,2,4,7,7,5]
// Output: Second Smallest : 2
// 	Second Largest : 5
// Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

// Example 2:
// Input: [1]
// Output: Second Smallest : -1
// 	Second Largest : -1
// Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

public class secondElement {
    public static void main(String[] args) {

        int[] arr = {12, 13, 14, 17, 21, 8};
        
        int[] result = getSecondOrderElements(arr);
        
        System.out.println("Second Smallest: " + result[1]);
        System.out.println("Second Largest: " + result[0]);


        

    }
    static int[] getSecondOrderElements(int[] arr) {

        // assigning max value to smallest and min to largest to find the max and min

        int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        // if num in array is larger/ smaller that first smallest/largest then assign first l/s to second s/l
        //then assign first largest/smallest to num  
        //else if num is greater/smaller than second largest/smallest and the current num not equal to first small or large
        // assign that num to second largest/small

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }

            if (num < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = num;
            } else if (num < secondSmallest && num != firstSmallest) {
                secondSmallest = num;
            }
        }

        return new int[]{secondLargest, secondSmallest};
    }


}
