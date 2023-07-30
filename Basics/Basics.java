package Basics;
import java.util.Scanner;

class Basics{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;

        }
        System.out.println(fact);
        
        
    }

   
}