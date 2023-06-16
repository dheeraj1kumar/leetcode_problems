class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String a : arr)
        map.put(a,map.getOrDefault(a,0)+1);
        int count=1;
        for(String a : arr) {
            if(map.get(a)==1 && count++ ==k)
                return a;     
        }
        return "";
    }
}