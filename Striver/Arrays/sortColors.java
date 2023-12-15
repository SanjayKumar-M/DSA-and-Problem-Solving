class SortColors {
    public void sortColors(int[] nums) {
        int i = 0;int low=0;    //i is for iteration, low is start of the arr(only 0 can be there)
                               // high is end of the array (where only 2 can be there so automatically arr is sorted)
 
        int high = nums.length-1;
        while(i<=high){  // just still the i is less than or equal to last element
            
            if(nums[i]==0){
                swap(nums,i,low);
                i++;
                low++;
            }
            else if(nums[i] == 2){
                swap(nums,i,high);
               
                high--;
            }
            else{
                i++;
            }
        }
        
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}