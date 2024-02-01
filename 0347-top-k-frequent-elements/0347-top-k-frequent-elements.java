/*Simple solution, HashMap stores the elements and the count while allowing a constant time lookup.
The PriorityQueue then accepts the key value pair from the HashMap and the PriorityQueue then places a priority on the highest value from the key value pair.

So the second loop inserts the key value pair, the final while loop then takes the priority of each key value pair, the highest value within the priority queue will come first, removes that element, so the next highest value will be ready for polling, then inserts each one into an array.*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i: nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        
        PriorityQueue<Pair<Integer, Integer>> queue = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue());
        
        for (int key: map.keySet()){
            queue.offer(new Pair<Integer, Integer>(key, map.get(key)));
        }
        
        int[] ans = new int[k];
        int idx = 0;
        
        while (k > 0){
            ans[idx++] = queue.poll().getKey();
            k--;
        }
        
        return ans;
    }
}