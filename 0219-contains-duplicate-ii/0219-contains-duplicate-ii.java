class Solution {
    public boolean containsNearbyDuplicate(int[] n, int k) {
       
for(int i=0;i<n.length-1;i++){
    for(int j=i+1;j<i+k+1&&j<n.length;j++){
        if(n[i]==n[j]&&Math.abs(i-j)<=k){
            return true;
        }
    }
}
       return false;
    }
}