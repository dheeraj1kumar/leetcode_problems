class Solution {
    public long putMarbles(int[] weights, int k) {
        int n=weights.length-1;
        long array[]=new long[n];
        for(int i=0;i<n;i++){
         array[i]=weights[i]+weights[i+1];   
        }
        Arrays.sort(array);
        long min=0,max=0;
        for(int i=0;i<k-1;i++){
            min+=array[i];
            max+=array[n-i-1];
        }
        return max-min;
    }
}