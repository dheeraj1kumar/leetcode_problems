class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
      HashMap<Integer,Integer> map=new HashMap<>();// a hash map to store number as key and frquency as value
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); // getOrDefault gives a frequency in case key already exist else 0 as default
        }
    Queue<Integer> pq = new PriorityQueue<>((a,b) ->(map.get(a)-map.get(b)));  // PQ initialized to sort based on frequency at insertion.
        
        for(int i : map.keySet()){    // keyset to get all nums from map keys
            pq.add(i);
            if(pq.size()>k) pq.poll(); // checking if we reached Kth position, then delete the first value(value with least frequency yet encountered)
        }
        return pq.stream().mapToInt(Integer::intValue).toArray(); // using streams and map api to get primitive values from Integer object and return as array,  upvote if you like this approach :)
    }
}

