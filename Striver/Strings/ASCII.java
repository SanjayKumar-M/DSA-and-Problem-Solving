public class ASCII {
    public static void main(String[] args) {
        String word = "Hello";
        for (int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int ascii = ch;
           
            System.out.println("The ASCII value of "+ ch +" is "+ ascii);
        }
    }
    
}
