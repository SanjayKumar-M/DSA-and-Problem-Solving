package LinearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String name = "ElonMusk";
        char target = 'o';
        System.out.println(search(name,target));
        
    }
    static boolean search(String name, char target){
        if(name.length() == 0){
            return true;
        }

            for(char ch: name.toCharArray()){
            if(target == ch){
                return true;
            }
        }
        return false;

    }
}
