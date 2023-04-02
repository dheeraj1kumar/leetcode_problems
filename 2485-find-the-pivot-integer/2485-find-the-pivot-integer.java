class Solution {
    public int pivotInteger(int n) {
        
      int sum = (n + 1) * n / 2;
        int pivot = (int) Math.sqrt(sum);
        return pivot * pivot == sum ? pivot : -1;
    }
}