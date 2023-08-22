package OOPS;

public class Classes {
    public static void main(String[] args) {
        Blockchain polygon = new Blockchain(2018,"Polygon","Sandeep Naiwal",167.23);
        System.out.println(polygon);
    }

}

class Blockchain {
    int year;
    String name;
    String founder;
    float price;
}
