class Solution {
    public String reverseWords(String s) {
    String str=   s.trim();//is used to remove leading and trailing space
    String[] arr = str.split("\s+");
    // str.split("\s+") pluse islay lagaye hai because agar string me eak se jayada space hoga to usko remove kar dega.
		// agar simpley space laga dete to string ke beach wala space nahi remove karta hai.
		
        String ans="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			ans+=arr[i]+" ";
		}

		ans=ans.trim();
		return ans;
    }
}
