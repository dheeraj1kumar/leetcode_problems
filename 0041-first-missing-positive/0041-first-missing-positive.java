//in O(n) time and O(1) space

class Solution {
   public int firstMissingPositive(int[] nums) {
    //sort the array so the smaller numbers come first
    // our ans lies in the range 1....n+1
    // we start guessing our smallest missing as 1
    // we check if 1 is present if present then we made a wrong guess and
    // our next probable ans is smallestMissing++ i.e 2 and so on
    // if we ever encounter a number > smallest missing 
    // we made a correct guess and we break from the loop and return the smallest missing
    // note : we don't care for 0s and negatives
    Arrays.sort(nums);
    int smallestMissing=1; //probable ans
    for(int i=0;i<nums.length;i++){
     int curr=nums[i];
     if(curr==smallestMissing) smallestMissing++;
     else if(curr>smallestMissing)
      break;
   }
   return smallestMissing;
   }


 }



// class Solution {
//  public int firstMissingPositive(int[] nums) {
//         // our probable ans lies from 1....n+1
//    // we add all the numbers in nums to an hashset ignoring the negatives and 0s
//    //then we loop through our range of probable ans i.e 1 to n+1
//    //the moment we find the first number in our ans range that is not present in the set
//    // we return it
//         Set<Integer> set = new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>=0){
//         set.add(nums[i]);
//             }}
//         int s=0;
//             for(int i=1;i<=nums.length+1;i++){
//             if(!set.contains(i)){
//                 s=i;
//                 return s;
//             }
//         }
//         return -1;
//     }}