class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // Initialize variables
        int start = -1; // Initialize the starting index of the subarray
        int end = 0; // Initialize the ending index of the subarray
        int maxLength = 0; // Initialize the maximum length of the subarray
        
        // Create a HashMap to store the frequency of each element in the subarray
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (end = 0; end < nums.length; end++) {
            // Update the frequency of the current element in the map
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
          
            // If the frequency of any element in the subarray exceeds k
            while (map.get(nums[end]) > k) {
                // Move the starting index of the subarray forward
                start++;
                // Decrease the frequency of the element at the starting index
                map.put(nums[start], map.get(nums[start]) - 1);
            }
            
            // Update the maximum length of the subarray
            maxLength = Math.max(maxLength, end - start);
        }
        
        // Return the maximum length of the subarray
        return maxLength;
    }
}
