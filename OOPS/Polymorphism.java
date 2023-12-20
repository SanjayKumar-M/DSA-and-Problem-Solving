package OOPS;

public class Polymorphism {

    // this is dynamic polymorphism

    class Blockchain {
        //method created which is not static (that is not related to object)
        void saymyName(){
            System.out.println("Hello My Name is Blockchain");
        }
    }

    class Ethereum extends Blockchain{
        void saymyName(){
            System.out.println("My Name is Ethereum");
        }
    }
    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();
        Ethereum eth = poly.new Ethereum();
        eth.saymyName();
    }
    
}




// Now i got it static is a keyword normally used to define a variable or methods
//  in java to state that the particular variavle or method belongs to the class 
//  but not the object, for example we are defining public static void main(String[] args){} 
//  funtion under main class so without static keyword we need to initalize this function to an object which can't be possible
