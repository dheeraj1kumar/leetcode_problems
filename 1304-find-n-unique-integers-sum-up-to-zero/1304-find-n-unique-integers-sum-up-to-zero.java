class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int i = 0;
        int j = n-1;
        while (i<j){
            ans[i] = i+1;
            ans[j] = -(i+1);
            i++;
            j--;
        }
        if (i==j) {
            ans[i]=0;
            return ans;
        }
        return ans;

    }
}