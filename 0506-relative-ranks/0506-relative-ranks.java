/*class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]); // max-heap
        
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{score[i], i});
        }
        
        int rank = 1;
        
        while (!pq.isEmpty()) {
            int[] athlete = pq.poll();
            int idx = athlete[1];
            
            if (rank == 1) {
                result[idx] = "Gold Medal";
            } else if (rank == 2) {
                result[idx] = "Silver Medal";
            } else if (rank == 3) {
                result[idx] = "Bronze Medal";
            } else {
                result[idx] = String.valueOf(rank);
            }
            
            rank++;
        }
        
        return result;
    }
}*/

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        
        String[] result = new String[n];
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            mp.put(score[i], i); // ith athlete
        }
        
        Arrays.sort(score); // ascending
        
        for (int i = n - 1; i >= 0; i--) {
            int ath = mp.get(score[i]);
            if (i == n - 1) {
                result[ath] = "Gold Medal";
            } else if (i == n - 2) {
                result[ath] = "Silver Medal";
            } else if (i == n - 3) {
                result[ath] = "Bronze Medal";
            } else {
                result[ath] = String.valueOf(n - i);
            }
        }
        
        return result;
    }
}