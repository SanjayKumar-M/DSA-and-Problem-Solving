package Striver.Arrays.medium;

// max subarray prblm using kadane algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        //setting 2 vars current to keep track of current sum and maxsofar to compare current value and so far sum

       int currentValue = nums[0];
       int maxSoFar = nums[0];
       for(int i=1;i<nums.length;i++){
        //finding max of current index and currentvalue+current index
           currentValue = Math.max(nums[i],currentValue+nums[i]);

          // now comparing max so far and current value to get max sum of sub array 
           maxSoFar = Math.max(maxSoFar,currentValue);
       }
       return maxSoFar;
        
    }
}