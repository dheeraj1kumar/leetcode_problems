class Solution {
    public int[] countBits(int n) {
       
        int t[]=new int[n+1];
        for(int i=0;i<=n;i++){
        int c=0;
       String  b=Integer.toBinaryString(i);
            for(int k=0;k<b.length();k++){
            if(b.charAt(k)==49)
                c++;
            
            }
                t[i]=c;
        }
        return t;
    }
}
