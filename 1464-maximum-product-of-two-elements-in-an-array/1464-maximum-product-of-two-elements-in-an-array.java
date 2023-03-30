class Solution {
    public int maxProduct(int[] n) {
        int c=0;
        Arrays.sort(n);
  
      
      c=(n[n.length-2]-1)*(n[n.length-1]-1);

        return c;
    }
}