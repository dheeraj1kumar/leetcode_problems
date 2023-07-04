class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[]=new int[2];
        int k=0;
        for(Integer key:map.keySet()){
            if(map.get(key)==1)
                arr[k++]=key;
        }
        return arr;
    }
}