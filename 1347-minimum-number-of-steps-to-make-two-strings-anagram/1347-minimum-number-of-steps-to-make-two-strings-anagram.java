class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        
       
        
      int steps = 0;

        // Iterate through each character in string t
        for (char c : t.toCharArray()) {
            // Check if the character is not in the HashMap or its frequency is 0
            if (!map.containsKey(c) || map.get(c) == 0) {
                steps++; // If true, increment steps as this character needs to be added
            } else {
                map.put(c, map.get(c) - 1); // If the character is present, decrement its frequency in the HashMap
            }
        }
        return steps;
    }
}



/*
 var map1 = new int[26];
    var map2 = new int[26];
    var cnt = 0;

    for (var c : s.toCharArray()) map1[c - 'a']++;
    for (var c : t.toCharArray()) map2[c - 'a']++;

    for (var i=0; i<26; i++)
      if (map2[i] > map1[i])
        cnt += map2[i] - map1[i];
    
    return cnt;*/