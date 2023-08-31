class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder res = new StringBuilder();
        for(var w : words){
            res.append(w.charAt(0));
        }
        return res.toString().equals(s);
    
    }
}