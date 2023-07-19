class Solution {
    public int maxOperations(int[] a, int k) {
        Arrays.sort(a);
        int i=0;
        int j=a.length-1;
        int c=0;
        while(i<j){
    // if the Integers at i and j are greater the k, we need the decrease the sum so we move the j pointer by -1
            if(a[i]+a[j]>k){
                j--;
            }
            // if the Integers at i and j are smaller the k, we need the decrease the sum so we move the i pointer by +1 
          else  if(a[i]+a[j]<k){
                i++;
            }
            //if Integer at i and j = equal, increament the Count and move the pointer
            else{
                i++;
            j--;
                c++;
        }}
        return c;
    }
}

