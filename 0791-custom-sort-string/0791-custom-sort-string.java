class Solution {
    public String customSortString(String order, String s) {
        
        String s1="",s2="";
        
        //step 1 count freq of order string
        int[] freqs = new int[26];
        for (char c : order.toCharArray()) {
            freqs[c - 'a']++;
        }
   
        
        //if char freq = 0 then store s2 else +
          for (char c : s.toCharArray()) {
            if(freqs[c-'a']==0){
                s2+=c;
                
            }else{
                freqs[c-'a']++;
            }
        }
        
        
        //when if freq >  1 then store s1 and decrease -1 and after concatenate s1+s2
           for (char c : order.toCharArray()) {
            while(freqs[c-'a']>1){
                s1+=c;
                
            
                freqs[c-'a']--;
            }
        }
        return s1+s2;
        }
    
}




/*    public String customSortString(String st, String s) {
        
   StringBuilder result = new StringBuilder();

        int[] freqs = new int[26];
        for (char c : s.toCharArray()) {
            freqs[c - 'a']++;
        }

        for (char c : order.toCharArray()) {
            while (freqs[c - 'a']-- > 0) {
                result.append(c);
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            while (freqs[c - 'a']-- > 0) {
                result.append(c);
            }
        }

        return result.toString();
        }*/