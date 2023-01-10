class Solution {
    public int diagonalSum(int[][] maitrix) {
        
     int sum=0;

        for(int i=0;i<maitrix.length;i++){
            //pd
            sum+=maitrix[i][i];
//sd
if(i!=maitrix.length-1-i)
sum+=maitrix[i][maitrix.length-i-1];
        }
return sum;
    }
}