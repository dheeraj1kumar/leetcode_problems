class Solution {
    public String frequencySort(String s) {
      
         // Step 1: Create a HashMap to store character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Create a PriorityQueue and define a custom Comparator
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue() // Compare based on frequency
        );
        
        // Step 3: Add entries from the HashMap to the PriorityQueue
        pq.addAll(freqMap.entrySet());
        
        // Step 4: Construct and return the sorted string
        StringBuilder sortedString = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char c = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                sortedString.append(c);
            }
        }
        
        return sortedString.toString();
    }
}

