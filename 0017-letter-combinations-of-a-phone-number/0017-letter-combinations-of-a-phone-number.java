import java.util.*;

class Solution {
    List<String> ans;
    String[] dial = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        helper("", 0, digits);
        return ans;
    }
    
    private void helper(String comb, int index, String digits) {
        if (index == digits.length()) {
            ans.add(comb);
            return;
        }
            
        String letters = dial[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            helper(comb + letters.charAt(i), index + 1, digits);
        }
    }
}