package NumberProblems;

/*Example 1:
Input: 18
Output: Abundant Number
Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number.

Example 2:
Input: 21
Output: Not Abundant Number
Explanation:Divisors of 21 are 1,3,7. 1+3+7=11, Since 11 is smaller than 21, 11 is not an abundant number. */

import java.util.Scanner;
class Abundant{
    public static void main(String[] args) {
        
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=1;i<n;i++){
            if(n%i == 0){
                
                sum = sum+i;
            }
        }
        System.out.println(sum);
        if (sum> n){
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not an Abundant Number");
        }

    }
}