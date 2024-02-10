class Solution {
    public int countSubstrings(String s) {
        
        int c=0;
        
        int n= s.length();
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(ispallindrome(s,i,j))
                    c++;
            }
        }
      return c;
        
    }      
    static boolean ispallindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }
        return true;
    }
    
    
    
}