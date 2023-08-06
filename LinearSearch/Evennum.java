package LinearSearch;

public class Evennum {
    public static void main(String[] args) {
        int[] arr = {10,20,345,678};
        int count = 0;
        for(int num: arr){
            int number = String.valueOf(num).length();
            if(number%2 == 0){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(answer(arr));
        
    }

    //bruteforce approach
    static int answer(int[] num){
        int ans = 0;
        for(int n:num){
            if(count(n)%2 == 0){
                ans++;
            }
        }
        return ans;
           
    }
    static int count(int num){
        int count = 0;
        while(num != 0){
            int rev = num%10;
            count++;
            num = num/10;
        }
        return count;
    }
}
