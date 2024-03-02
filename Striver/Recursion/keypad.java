class Solution {
    private Map<Character,String> phone = new HashMap<>();
    Solution(){
        phone.put('2',"abc");
        phone.put('3',"def");
        phone.put('4',"ghi");
        phone.put('5',"jkl");
        phone.put('6',"mno");
        phone.put('7',"pqrs");
        phone.put('8',"tuv");
        phone.put('9',"wxyz");
    }
    public void solve(String digits, StringBuilder alphabets,int i,List<String> result){
        if(i>=digits.length()){
            if(alphabets.length()>0){
                result.add(alphabets.toString());
            }
            return;
        }
        char currentchar = digits.charAt(i);
        String value = phone.get(currentchar);
        for(char ch: value.toCharArray()){
            alphabets.append(ch);
            solve(digits,alphabets,i+1,result);
            alphabets.deleteCharAt(alphabets.length() -1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        solve(digits,new StringBuilder(),0,result);
        return result;
        
    }
}