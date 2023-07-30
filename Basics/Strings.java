package Basics;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        if(name1.length() == name2.length()){
            System.out.println("Both names are equal in size");
        }
        else if(name1.length() > name2.length()){
            System.out.println("Name 1 is greater than Name2");
        }
        else{
            System.out.println("Name 2 is greater than Name1");
        }

        
    }
}
