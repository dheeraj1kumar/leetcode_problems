// Time Complexity : O(N + M)
// Space Complexity: O(M)
// where N is nums.length and M is queries.length.

class Solution {

    // The approach is to get the sum of the even numbers in nums array first.
    // Each time we update nums with queries, 2 things will happen:
    // 1. If previously nums[index] is even, we subtract from the sum.
    // 2. If now updated nums[index] is even, we add to the sum.
    // In both cases, no action is needed when the number (previous and updated) is odd.
    // Then record the sum in the result array.

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        // Get the sum of the even numbers in nums.
        int sumEven = 0;
        for (int number : nums) {
            if (number % 2 == 0) {
                sumEven += number;
            }
        }

        // Traverse the queries array, and update the numbers in nums.
        // Also, perform the operations as 1. and 2. described above.
        int[] result = new int[queries.length];
        int numsIndex;
        for (int i = 0; i < queries.length; i++) {
            numsIndex = queries[i][1];

            // 1. If previously nums[index] is even, we subtract from the sum.
            if (nums[numsIndex] % 2 == 0) {
                sumEven -= nums[numsIndex];
            }

            // 2. If now updated nums[index] is even, we add to the sum.
            nums[numsIndex] += queries[i][0];
            if (nums[numsIndex] % 2 == 0) {
                sumEven += nums[numsIndex];
            }

            // Record the sum in the result array.
            result[i] = sumEven;
        }
        return result;
    }
}