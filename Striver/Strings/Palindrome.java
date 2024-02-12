public class Palindrome {
    public static boolean palindrome(String name) {
        
        name.toLowerCase();
        int start = 0;
        int end = name.length()-1;
        while(start < end){
            while(start <end && !Character.isLetterOrDigit(name.charAt(start))){
                start++;
            }
            while(start < end && !Character.isLetterOrDigit(name.charAt(end))){
                end--;
            }
            if(name.charAt(start) != name.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

        
    }
    public static void main(String[] args) {
       
        System.out.println(palindrome("malayalam"));
    }
    
}
