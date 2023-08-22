class Solution {
    public String convertToTitle(int c) {
        String str = "";
      while(c>0){
        str = (char)('A'+(c-1)%26)+str;
          c=(c-1)/26;
            
       
        }
        return str;
    }
}



/*	var columnNumber = 0;
	for (var i = 0; i < columnTitle.length(); i++)
		columnNumber = columnNumber * 26 + columnTitle.charAt(i) - 'A' + 1;
	return columnNumber;  */