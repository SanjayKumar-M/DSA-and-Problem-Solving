package Striver.Strings;

public class Palindrome {
    public boolean main(String[] args) {
        String name = "A man";
      
        int start = 0;
        int end = name.length()-1;
        while(start < end){
            while(start <end && !Character.isLetterOrDigit(name.charAt(start))){
                start++;
            }
            while(start < end && !Character.isLetterOrDigit(name.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(name.charAt(start)) != Character.isLowerCase(name.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;

        
    }
    
}
