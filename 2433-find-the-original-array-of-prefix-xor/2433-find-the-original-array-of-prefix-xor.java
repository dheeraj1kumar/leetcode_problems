class Solution {
    public int[] findArray(int[] p) {
        int t[]=new int[p.length];
        t[0]=p[0];
        int c=1;
        for(int i=0;i<p.length-1;i++){
            t[c++]=p[i]^p[i+1];
        }
        return t;
    }
}