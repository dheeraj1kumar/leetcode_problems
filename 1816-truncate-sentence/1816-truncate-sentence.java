class Solution {
    public String truncateSentence(String s, int k) {
  int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') count++;
            if(count == k) {
                s = s.substring(0, i);
                break;
            }
        }
        return s;
    
    }
}