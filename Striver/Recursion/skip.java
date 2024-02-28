public class skip {
    public static void main(String[] args) {
        System.out.println(SkipString("Sanjay apple"));
       
        
    }
    public static String Skip(String input){
        if(input.isEmpty()){
            return "";
        }
        char ch = input.charAt(0);
        if(ch == 'a'){
            return Skip(input.substring(1));
        }
        else{
            return ch+ Skip(input.substring(1));
        }
    }
    public static String SkipString(String input){
        if(input.isEmpty()) return "";
        if(input.startsWith("apple")) return SkipString(input.substring(5));    
        else return input.charAt(0) + SkipString(input.substring(1)); 
        
    }
    
}
