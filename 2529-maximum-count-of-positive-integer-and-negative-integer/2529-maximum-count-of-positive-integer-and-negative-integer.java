class Solution {
    public int maximumCount(int[] n) {
        
        int p=0;
        int n1=0;
        for(int i=0;i<n.length;i++){
            if(n[i]>0){
                p++;
            }
            else if(n[i]<0)n1++;
        }
        return Math.max(p,n1);
    }
}