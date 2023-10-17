class Solution {
    public int[] frequencySort(int[] nums) {
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
      ArrayList<Integer> al = new ArrayList<>(map.keySet());
   Collections.sort(al,(a,b)->(map.get(a) == map.get(b))? b - a : map.get(a) - map.get(b));
        //  Collections.sort(al, (a, b) -> {
        //     return (map.get(a) == map.get(b))? b - a : map.get(a) - map.get(b);
        // });
    
    int a[]=new int[nums.length];
    int r=0;
    for(Integer num: al){
        for(int i=0;i<map.get(num);i++){
            a[r++]=num;
        }
    }
    
    return a;
    }
}