class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        
        int maxLen = 0;

        Map<Integer, Integer> lengthMap = new HashMap<>();


        for(int x: arr){
            int len = 1 + lengthMap.getOrDefault(x - difference, 0);
            maxLen = Math.max(maxLen, len);
            lengthMap.put(x, len);
        }

        return maxLen;
    }
}