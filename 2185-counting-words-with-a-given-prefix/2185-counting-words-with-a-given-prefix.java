class Solution {
    public int prefixCount(String[] words, String pref) {
           int count = 0;
        for (String w: words) {
            if (w.indexOf(pref) == 0) {
                count++;
            }
        }
        return count;
    
    }
}