class Solution {
    public int getCommon(int[] a, int[] b) {
   int i,j;
        i=0;
        j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j])
            return a[i];
            else if(a[i]>b[j]){
                j++;
            }else{
                i++;
            }
        }
        return -1;
    }
}