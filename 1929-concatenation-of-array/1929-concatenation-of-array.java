class Solution {
    public int[] getConcatenation(int[] n) {
        
        int a[]=new int[n.length*2];
        for(int i=0;i<n.length;i++){
            a[i]=n[i];
         a[i+n.length]=n[i];
        
            
                
        }
        return a;
    }
}