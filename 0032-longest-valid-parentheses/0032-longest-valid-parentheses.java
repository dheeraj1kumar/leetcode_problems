


class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack();
        stack.push(-1);
        
        int maxLen = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){ //opening bracket
                
                stack.push(i);
            }else if(s.charAt(i) == ')'){ //closing bracket
                
                stack.pop();
                if(stack.empty()){
                    //reset
                    stack.push(i);
                }else{
                    //update maxLen
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
                    
            }
        }
        
        return maxLen;
    }}











/*


//for one stack

Scan the string from beginning to end.
If current character is '(',
push its index to the stack. If current character is ')' and the
character at the index of the top of stack is '(', we just find a
matching pair so pop from the stack. Otherwise, we push the index of
')' to the stack.
After the scan is done, the stack will only
contain the indices of characters which cannot be matched. Then
let's use the opposite side - substring between adjacent indices
should be valid parentheses.
If the stack is empty, the whole input
string is valid. Otherwise, we can scan the stack to get longest
valid substring as described in step 3.

















Using two stack
    class Solution {
    public int longestValidParentheses(String s) {
       
         Stack<Character> ch = new Stack<>();
         Stack<Integer> index = new Stack<>();
        index.add(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){//openning
                ch.add('(');
                index.add(i);
            }
            else{//closing
                if(!ch.isEmpty() && ch.peek()=='('){
                    ch.pop();
                    index.pop();
                    max=Math.max(max,i-index.peek());
                }
                else{
                    index.add(i);
                }
            }
        }
        return max;
    }
}
*/