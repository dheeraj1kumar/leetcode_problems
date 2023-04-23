class Solution {
    public int[] shuffle(int[] nums, int n) {
     int []arr=new int[2*n];
        int i=0,j=n;
        int k=0;
        while(k<2*n)
        {
            arr[k]=nums[i];
            k++;
            arr[k]=nums[j];
            k++;
            j++;
            i+=1;
        }
        return arr;      
    }
}