class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int lmom = 0;
        for(int l:left){
            lmom = Math.max(l,lmom);
        }
        for(int r:right){
            lmom = Math.max(n-r,lmom);
        }
        return lmom;
    }
}