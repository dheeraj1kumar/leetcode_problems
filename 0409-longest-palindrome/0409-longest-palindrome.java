import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        // Create a map to store the frequency of each character in the string
        Map<Character, Integer> map = new HashMap<>();
        
        // Populate the map with character frequencies
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        int ans = 0; 
        int odd = 0; 
        
        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                ans = ans + freq;
            } else {
                ans= ans+freq-1;
                odd=1;
            }
        }
        
         return (odd==1)?ans + 1:ans;
    }
}