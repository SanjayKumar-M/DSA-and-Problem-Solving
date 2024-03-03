class Solution {
    private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
    public void solve(int[] nums, int i,List<List<Integer>> result){
        if(i>= nums.length){
            List<Integer> copy = new ArrayList<>();
           for(int num: nums){
               copy.add(num);
           }
           result.add(copy);
           return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            solve(nums,i+1,result);
            swap(nums,j,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums,0,result);
        return result;


        
    }
}