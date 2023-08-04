package LinearSearch;

public class SearchinRange {
    public static void main(String[] args) {
        int[] array = { 1, 45, 32, 78, 99, 100 };
        int target = 32;
        int start = 03, end = 5;
        System.out.println(search(array, target, start, end));

        // minimum value

        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);

        // maximum value
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);

    }

    static int search(int[] array, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (array[i] == target) {
                return 1;
            }
        }
        return -1;
    }
}
