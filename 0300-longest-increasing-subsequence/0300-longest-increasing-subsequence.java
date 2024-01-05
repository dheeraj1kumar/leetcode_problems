class Solution {
    public int lengthOfLIS(int[] numbers) {
        // Initialize an array to store the length of longest increasing subsequence ending at each index
            int[] lisLengths = new int[numbers.length];
            Arrays.fill(lisLengths, 1);
    
            // Iterate through each element in the array
            for (int i = 1; i < numbers.length; i++) {
                // Iterate through all previous elements
                for (int j = 0; j < i; j++) {
                    // If the current element is greater than the previous element, update the LIS length
                    if (numbers[j] < numbers[i]) {
                        lisLengths[i] = Math.max(lisLengths[j] + 1, lisLengths[i]);
                    }
                }
            }
    
            // Find the maximum length of LIS in the lisLengths array
            int maxLength = 0;
            for (int length : lisLengths) {
                maxLength = Math.max(maxLength, length);
            }
    
            // Return the maximum length of LIS
            return maxLength; 
    }
}