class Solution {
    public int[] rearrangeArray(int[] nums) {
        // easiest problem
        //[3,1,-2,-5,2,-4]  for example in every arrays, the + no will be in even index and -ve no in odd index
        //that is the pattern that's it
        int n = nums.length;
        int[] result = new int[n];
        //initalizing index by 0 for eve and 1 for odd 
        int evenIndex = 0;
        int oddIndex = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                result[evenIndex] = nums[i];
                // so that now i can add 2 with 0 results only in even index
                evenIndex += 2;
            } else {
                result[oddIndex] = nums[i];
                
                oddIndex += 2;
            }
        }

        return result;
    }
}
