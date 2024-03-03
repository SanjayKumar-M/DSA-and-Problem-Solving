import java.util.HashMap;
import java.util.Map;

public class SayDigits {
    private Map<Character, String> map = new HashMap<>();

    public SayDigits() {
        map.put('1', "one");
        map.put('2', "two");
        map.put('3', "three");
        map.put('4', "four");
        map.put('5', "five");
        map.put('6', "six");
        map.put('7', "seven");
        map.put('8', "eight");
        map.put('9', "nine");
        map.put('0', "zero");
    }

    public void solve(String digits, int i, StringBuilder result) {
        if (i >= digits.length()) {
            System.out.println(result.toString()); // Print the result when all digits are processed
            return;
        }
        char ch = digits.charAt(i);
        String value = map.get(ch);
        result.append(value); // Append the word representation of the current digit
        solve(digits, i + 1, result); // Recursively process the next digit
        result.delete(result.length() - value.length(), result.length()); // Backtrack by removing the last added word
    }

    public static void main(String[] args) {
        SayDigits sayDigits = new SayDigits();
        String digits = "123";
        sayDigits.solve(digits, 0, new StringBuilder());
    }
}
