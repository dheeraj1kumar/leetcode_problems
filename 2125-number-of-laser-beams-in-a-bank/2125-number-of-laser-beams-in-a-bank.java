/*
Time Complexity: O(m * n)
Space Complexity: O(1)
 */

class Solution {
    public int numberOfBeams(String[] bank) {
        int preLaser =0, res =0;
        for(String floor: bank){
            int currl=0;


        //     for (int i = 0; i < s.length(); i++)
        // if (s.charAt(i) == '1') {
        //   count++;
        // }
        
            for(char cell : floor.toCharArray()){
                if(cell=='1')
                    currl++;
            }
            if(currl>0){
                res+=preLaser*currl;//beam count
                preLaser=currl;//update prev
            }
            
        }
        return res;
    }
}