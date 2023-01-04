class Solution {
    public int kthSmallest(int[][] m, int k) {
        int n=m.length;
        int idx=0;
        int arr[]=new int[n*n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
              arr[idx++]=m[i][j];
               }
           }
       
       Arrays.sort(arr);
        
        return arr[k - 1];
    }
}