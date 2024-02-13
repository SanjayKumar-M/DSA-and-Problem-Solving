public class ASCII {
    public static void main(String[] args) {
        String word = "Hello";
        for (int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int ascii = ch;
           
            System.out.println("The ASCII value of "+ ch +" is "+ ascii);
        }
        StringBuilder newWord = new StringBuilder(word);
        
        int start = 0;
        int end = newWord.length()-1;
       
            Character.toLowerCase(newWord.charAt(start));
            Character.toUpperCase(newWord.charAt(end));
       
        System.out.println(newWord);
        
    }
    
}
