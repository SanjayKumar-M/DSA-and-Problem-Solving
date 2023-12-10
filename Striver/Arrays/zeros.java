public class zeros {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,0,4,0,5};
        int n = arr.length;
        for(int i = 0;i<arr.length;i++){
            for(int j =1;j<arr.length;j++){
                if(arr[i] !=0){
                    arr[i] = arr[j];
                }
            }
        }
        for(int nums: arr){
        System.out.println(nums+ " ");
        }
    }

    
}
