package OOPS;

public class Classes {
    public static void main(String[] args) {
      Blockchain Ethereum = new Blockchain(2018,"ETH","Buterin",20.22f);
      System.out.println(Ethereum);

      // method to call non static variables or methods without defining static
      Classes cls = new Classes();
      cls.hello()
    }
    


    void hello(){
        System.out.println("hello");
    }

}

class Blockchain {
    int year;
    String name;
    String founder;
    float price;

    Blockchain(){
        //declaring constructor in another constructor or calling
        this (2013,"Ethereum","Vitalik Buterin", 2000.34f);

    }

    //declaring constructor to input the values when an object is initialized

    Blockchain(int year, String name,String founder, float price){
        this.year = year;
        this.name = name;
        this.founder = founder;
        this.price = price;

    }


    @Override  
    public String toString(){
        return year + name + founder + price ;
    }
}
