
public class reverse {
    public static void main(String[] args) {
        String word = "Sanjay Kumar";
        // StringBuilder str = new StringBuilder(word);
        // System.out.println(str.reverse());
        char[] wordArray = word.toCharArray();
        int i = 0;
        int j = word.length()-1;
        while(i<j){
            char temp = wordArray[i];
            wordArray[i] = wordArray[j];
            wordArray[j] = temp;
            i++;
            j--;
        }
        System.out.println(wordArray);

    
        
        
    }
   
    
}
