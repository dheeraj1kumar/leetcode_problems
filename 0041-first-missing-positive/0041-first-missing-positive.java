//in O(nlogn) time and O(1) space

/*class Solution {
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
*/


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

/*TIME COMPLEXITY : O(N)
SPACE COMPLEXITY: O(1)
*/
class Solution{
public int firstMissingPositive(int[] nums) {
  // our ans lies within the range 1 to n+1
  //step 1 : filter out all those that cannot be our ans
  //traverse the array and remove all numbers that are <=0 or >n and mark them with n+1
  // if all numbers become >n then we simply return 1
  int n=nums.length;
  for(int i=0;i<n;i++){
   if(nums[i]<=0||nums[i]>n)
    nums[i]=n+1; 
   }
  //now all elements in the array are positive and in the range 1 to n+1 i.e our ans range 
  //we will use the array itself as a hashset and we will mark the array in such a way if a element is present in that array we can tell that in O(1)
  //how to mark the array ? 
  //suppose element 3 is present in the array 
  //so we go to index 3 and convert the number in that index to negative 
  //i.e if nums[i]=3 then nums[3]= -nums[3]
  //but there is a problem if nums[i]=n then nums[n] will be out of bounds since index of last element is n-1
  //hence we shift our indexes such that if 1 is present in the array then we mark nums[0] as negative
  // similarly if 2 is present then we mark nums[1] as negative and so on 
  //therefore if x is present in the array we mark[x-1] negative
  // so now if n is present in the array then we will mark nums[n-1] neagtive and it will be not out of bounds
  //important note : we ignore if nums[x] is n+1
  for(int i=0;i<n;i++){
    int curr=Math.abs(nums[i]); // we take absolute value since the number in nums[i] might have been turned -ve to mark some element previously
    if(curr>n) continue;
    if(nums[curr-1]>0) // if duplicates are present then it might have been already marked so we dont mark again
     nums[curr-1]=-nums[curr-1];
    }
  
  //now we find the first cell which is not negative 
  // if suppose nums[3] is positive then it means 4 is missing from the array
  //cause if 4 were present then nums[3] would have been marked negative
  for(int i=0;i<n;i++){
   if (nums[i]>0)
    return i+1;
    }
  // if all numbers are negative then it means 
  // the arrays originally consisted of [1,2,3....n]
  //in that case our first missing positive would be n+1
  return n+1;
 }}