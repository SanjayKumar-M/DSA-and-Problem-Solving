class Solution {
    private void subset(List<List<Integer>> result, List<Integer> leaf_output, int n, int i, int k){
        //since we keep on reducing k i.e k-1 once it reach 0 we can return the combination sets since we got the ans!
        if(k ==0){
            List<Integer> copyofLeafOutput = new ArrayList<>();
            for(int num: leaf_output){
                copyofLeafOutput.add(num);
            }
            result.add(copyofLeafOutput);
            return;

        }
        // so if the k is less than n-i+1 stop else return(that is exit the current recursive call and return back to the previous call or branh)
        if(k>n-i+1) return;
        // if i exceeds n i.e 4 = 4 means exit
        if(i > n){
            return;
        }
        //add  on th left side
        leaf_output.add(i);
        subset(result,leaf_output,n,i+1,k-1);
        // while backtracking i should remove the last element of the leaf node i.e (right side is removal of  last element in left side )
        leaf_output.remove(leaf_output.size()-1);
        
        // return as it is (remove on right side)
        subset(result,leaf_output,n,i+1,k);


    }
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> leaf_output = new ArrayList<>();
        subset(result,leaf_output,n,1,k);
        return result;
    }
}