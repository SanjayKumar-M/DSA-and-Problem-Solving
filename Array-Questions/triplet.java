public class triplet {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 11;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == target) {
                        System.out.println("Triplet found at indices: " + i + ", " + j + ", " + k);
                        return;
                    }
                }
            }
        }
        System.out.println("Triplet not found");
    }
}
