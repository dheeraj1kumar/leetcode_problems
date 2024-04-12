class Solution {
    public int maxArea(int[] he) {
     
        int l=0;
        int r=he.length-1;
        int max=0;
        while(l<r){
            
            int h=Math.min(he[l],he[r]);
            int w=r-l;
          max =  Math.max(max,h*w);
            
            if(he[l]>=he[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return max;
    }   
}


//Brute force get tle
