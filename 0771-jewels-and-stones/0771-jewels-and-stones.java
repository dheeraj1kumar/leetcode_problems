class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     
        int ct = 0;
        for(char c: stones.toCharArray()){
            if(jewels.indexOf(c) != -1){
                ct++;
            }
        }
        return ct;
    }
}
