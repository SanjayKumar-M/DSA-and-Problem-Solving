class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        subsets(nums,0,list,ls);
        return list;
    }
    public void subsets(int[] arr, int idx, List<List<Integer>>list,List<Integer> ls){
        if(idx>=arr.length){
            list.add(new ArrayList<>(ls));
            return;
        }
            // don't pick the element
            subsets(arr,idx+1,list,ls);
            
            // pick the element
            ls.add(arr[idx]);
            subsets(arr,idx+1,list,ls);
            ls.remove(ls.size()-1);
    }
}

// simple pattern : add, recursion, remove, recursion