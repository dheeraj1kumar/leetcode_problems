class Solution {
    public int islandPerimeter(int[][] g) {
        int sum=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[i].length;j++){
                if(g[i][j]==1){
                    sum+=4;
                
                if((i>0) &&(g[i-1][j]==1))
                    sum=sum-2;
            
                 if((j>0) &&( g[i][j-1]==1))
                    sum-=2;
            
            
            }}
        }
        return sum;
    }
}