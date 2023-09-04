class Solution {
    public int trailingZeroes(int n) {
        
        if(n==0){
            return 0;
        }
        
        //how many times 5 comes in n
        int c=0;
        while(n>0){
            n/=5;
                c+=n;
            }
        
        return c;
    }
}