//linera

class Solution {
//     public int search(int[] n, int target) {
//         for(int i=0;i<n.length;i++){
//             if(n[i]==target)
//                 return i;
//         }
//         return -1;
//     }
// }



 public static int search(int n[],int k){
        int start=0;
        int end = n.length-1;
        while(start<=end){
            int mid=(end+start)/2;
            if(n[mid]==k){
                return mid;

            }
            else if(n[mid]<k){
                start=mid+1;
            }
            else{
              end=  mid-1;
            }
        }
        return -1;

    }}
