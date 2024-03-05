class Solution {
    public void solve(int[] candidates, int target, int i, int total, List<Integer> subset, List<List<Integer>> result) {
        if (total == target) {
            result.add(new ArrayList<>(subset));
            return;
        }
        if (total > target || i == candidates.length) return;

        // Move to the next index without including the current element
        solve(candidates, target, i + 1, total, subset, result);

        // Include the current element
        total += candidates[i];
        subset.add(candidates[i]);
        solve(candidates, target, i , total, subset, result); // Increment i here

        // Backtrack
        total -= candidates[i];
        subset.remove(subset.size() - 1);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        solve(candidates, target, 0, 0, subset, result);
        return result;
    }
}
