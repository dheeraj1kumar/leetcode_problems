//linera

class Solution {
    public int search(int[] n, int target) {
        for(int i=0;i<n.length;i++){
            if(n[i]==target)
                return i;
        }
        return -1;
    }
}