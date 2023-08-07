package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 13, 15, 20};
        int target = 14;   // Output should be 15 i.e 15 >= 14 (minimum)
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return arr[mid];  // Found the exact target value
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        // At this point, the "start" pointer indicates the position where the smallest
        // element greater than the target would be inserted, which is also the ceiling value.
        if (start < arr.length) {
            return arr[end];
        } else {
            // If the target is greater than all elements in the array,
            // return a value indicating that no ceiling value exists.
            return -1;  // You can choose an appropriate value here
        }
    }
}
