class Solution {
    public String mergeAlternately(String word1, String word2) {

          StringBuilder s = new StringBuilder();
       
        int c1 = 0;
        int c2 = 0;

        while (c1 < word1.length() || c2 < word2.length()) {
            
            if (c1 < word1.length()) {
                s.append(word1.charAt(c1));}
            if (c2 < word2.length()){ 
                s.append(word2.charAt(c2));}
            c1++;
            c2++;
        }

        return s.toString();
    }
}