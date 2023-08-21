package BinarySearch;
// ceiling ->max value  floor -> min
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
        
        
            return arr[start];
        
    }
}
