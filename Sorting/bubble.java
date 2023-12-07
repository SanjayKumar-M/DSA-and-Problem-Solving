public class Bubble{

    public static void main(String[] args){
        int[] array = {3,6,7,1,2,4}; //123467
        printArray(array);
        System.out.println();
        BubbleSort(array);
        System.out.println();

        
    }

    static void printArray(int[] arr){
        for (int arrNums: arr){
            System.out.print(arrNums+" ");
        }

    }

    static void BubbleSort(int[] arr){
        int temp = 0;

        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                       temp = arr[j];
                       arr[j] = arr[j+1];
                       arr[j+1] = temp;
                }
            }
        }
      for(int nums:arr){
        System.out.print(nums+" ");
      }
    }
    
}