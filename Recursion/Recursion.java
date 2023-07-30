package Recursion;
public class Recursion {
    public static void main(String[] args) {
        
        // Scanner input = new Scanner(System.in);
        // int num = input.nextInt();
        // int fact = 1;
        // for(int i=1;i<=num;i++){
        //     fact = fact*i;

        // }
        // System.out.println(fact);
        System.out.println(Factorial(5));
        
    }

    static int Factorial(int num){
        if (num==1){
            return 1;
        }
        else{
            return num*Factorial(num -1);
        }
    }
}
