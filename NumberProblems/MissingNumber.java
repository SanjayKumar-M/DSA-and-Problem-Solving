package NumberProblems;

public class MissingNumber {
    public static void main(String[] args) {
        //optimized approach

        int[] arr = {1,2,3,4,5,7};
        int n = arr.length;
        int sum = n*(n+1)/2;
        System.out.println(sum-7);

    }
}
