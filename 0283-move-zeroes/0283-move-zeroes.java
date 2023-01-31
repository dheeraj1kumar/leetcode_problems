class Solution {
    public void moveZeroes(int[] n) {
        
       int s=0; 
     for(int i=0;i<n.length;i++)  {
         if(n[i]!=0)
             n[s++]=n[i];
         }
        while(s<n.length)
            n[s++]=0;
            
        
    }
}