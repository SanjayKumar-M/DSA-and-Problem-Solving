package OOPS;

public class Classes {
    public static void main(String[] args) {
        Blockchain polygon = new Blockchain(2018,"Polygon","Sandeep Naiwal",167.2f);
        System.out.print(polygon.founder,polygon.year,polygon.price,polygon.name);
    }

}

class Blockchain {
    int year;
    String name;
    String founder;
    float price;

    //declaring constructor to input the values when an object is initialized

    Blockchain(int year, String name,String founder, float price){
        this.year = year;
        this.name = name;
        this.founder = founder;
        this.price = price;

    }
}
