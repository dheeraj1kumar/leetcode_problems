class Solution {
    public char findTheDifference(String s, String t) {
    char c = 0;
        for(char s1 : s.toCharArray()) c ^= s1;
        for(char s2 : t.toCharArray()) c ^= s2;
        return c;
    }
}