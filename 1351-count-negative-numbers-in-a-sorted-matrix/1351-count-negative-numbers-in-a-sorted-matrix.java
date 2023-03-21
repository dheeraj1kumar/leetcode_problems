class Solution {
    public int countNegatives(int[][] g) {
        
        int  c=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[i].length;j++){
                if(g[i][j]<0){
                    c++;
                   // return 
                }
            }
        }
        return c;
    }
}