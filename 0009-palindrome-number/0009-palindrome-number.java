class Solution {
    public boolean isPalindrome(int x) {
        int r;
        int s=0;
        int t=x;
        while(x!=0 && x>0)
            {
            r=x%10;
            s=s*10+r;
                x/=10;
        }
            if(s==t){
                return true;
            }
            else {
                return false;
            }
        
    }
      
}