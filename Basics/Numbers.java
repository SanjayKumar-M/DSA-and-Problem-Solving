package Basics;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the Number: ");
       int num= input.nextInt();
       
    // Amstrong(num);
    // Reverse(num);
    // Divisors(num);
    for(int i=100;i<=600;i++){
        if(Palindrome(i)){
            System.out.print(i+ " ");
        }
    }
    }
    static void Amstrong(int num){
        int answer = 0;
        int temp = num;
        while(num !=0){
            int reverse = num%10;
            answer = answer+(reverse*reverse*reverse);
            num /=10;

        }

        if (temp == answer){
            System.out.println("The given number is Amstrong Number");
        }
        else{
            System.out.println("The given number is not an Amstrong Number");
        }
    }

    static void Reverse(int num){
        int ans = 0;
       int count = 0;
       int sum = 0;
       while(num != 0){
            int rev = num%10;
            count++;
            sum = sum+rev;
            ans = ans*10+rev;
            num /=10;
       }
       System.out.println("The reverse number is:"+ans);
       System.out.println("The count of number is :"+count);
       System.out.println("The sum of numbers is: "+sum);
    }
    static void Divisors(int num){
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i == 0){
                
                count = count+1;
                System.out.print(i+ " ");
                
            }
            
        }
        System.out.println();
        System.out.println("The total divisors are: "+count);
    }

    static boolean Palindrome(int num){
        int ans = 0, temp = num;
        while(num != 0){
            int rev = num%10;
            ans = ans*10 +rev;
            num /= 10;
        }
        if(temp == ans){
            // System.out.println("Is a Palindrome");
            return true;
        }
        else{
            // System.out.println("Not a Palindrome");
            return false;
        }
    }
   
}
