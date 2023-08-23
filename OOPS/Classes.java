package OOPS;

public class Classes {
    public static void main(String[] args) {
        Blockchain polygon = new Blockchain(2018,"Polygon","Sandeep Naiwal",167.2f);
        System.out.print(polygon.name);
        Blockchain another = new Blockchain();
        System.out.println(another.name);
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
}
