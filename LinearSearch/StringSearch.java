package LinearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Sanjay Kumar";
        char target = ' ';
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
