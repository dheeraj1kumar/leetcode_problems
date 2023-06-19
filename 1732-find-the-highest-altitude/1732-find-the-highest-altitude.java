class Solution {
    public int largestAltitude(int[] gain) {
         int currentalti = 0;
    int max = 0;

    for(int i=0; i<gain.length; i++){

        currentalti += gain[i];

        max = Math.max(max, currentalti);
    }
return max;
    }
}