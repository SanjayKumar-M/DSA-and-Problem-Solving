class Solution {
    public void swap(int[] n,int i, int j){
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }
    public void solve(int[] nums, int i, List<List<Integer>> result) {
    if (i == nums.length - 1) {
        List<Integer> permutation = new ArrayList<>();
        for (int num : nums) {
            permutation.add(num);
        }
        result.add(permutation);
        return;
    }

    Set<Integer> swapped = new HashSet<>();
    for (int j = i; j < nums.length; j++) {
        if (swapped.add(nums[j])) {  // Skip duplicates
            swap(nums, i, j);
            solve(nums, i + 1, result);
            swap(nums, i, j);  // Backtrack
        }
    }


}

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        solve(nums,0,result);
        return result;


        
    }
}