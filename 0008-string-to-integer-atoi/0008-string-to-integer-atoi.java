class Solution {
    public int myAtoi(String s) {
        // Check if the input string is null
        if(s == null) return 0;
        
        // Remove leading and trailing spaces
        s = s.trim();
        
        // Check if the string is empty after trimming
        if(s.length() == 0) return 0;
        
        int sign = 1;  // Initialize the sign to positive
        long ans = 0;  // Initialize the result as a long to handle overflow
        int MAX = Integer.MAX_VALUE; // Store the maximum integer value
        int MIN = Integer.MIN_VALUE; // Store the minimum integer value
        
        // Check if the first character is a negative sign
        if(s.charAt(0) == '-') sign = -1; 
        
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;  // Determine the starting position
        
        while(i < s.length()){
            // Check if the current character is a digit, break if not
            if(!Character.isDigit(s.charAt(i))) break;
            
            // Update the result by multiplying by 10 and adding the current digit
            ans = ans * 10 + (s.charAt(i) - '0'); 
            
            // Handle overflow for positive and negative results
            if(sign == -1 && ans * -1 < MIN) return MIN;
            if(sign == 1 && ans > MAX) return MAX;
            
            i++;
        }
        return (int)ans * sign;  // Convert the result to an integer and return
    }
}
