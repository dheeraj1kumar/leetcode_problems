class Solution {
    public boolean isPalindrome(String s) {
        
        String st = "";
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(Character.isAlphabetic(c)||Character.isDigit(c)){
                st+=c;
            }
        }
      st=st.toLowerCase();
        System.out.println(st);
        return pall(st,0,st.length()-1);
        
    }
        
        boolean pall(String s,int l, int r){
            
            while(l<=r){
                if(s.charAt(l++)!=s.charAt(r--)){
                    return false;
                }
            }
            return true;
            
        }
    
}