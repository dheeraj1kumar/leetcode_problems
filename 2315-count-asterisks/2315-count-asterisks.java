class Solution {
    public int countAsterisks(String s) {
        
      int barsEven = 0, ans = 0;
      for(int i = 0; i < s.length(); ++ i) {
          if(s.charAt(i) == '*' && barsEven % 2 == 0)
          ans ++;
          
          if(s.charAt(i) == '|')
          barsEven ++;
      } 
      return ans; 
    }
}