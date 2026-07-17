class Solution {
    public int lengthOfLongestSubstring(String s) {
      int left=0; int maxlength=0;
      int[] charCount=new int[128];
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        charCount[ch]++;
      while(charCount[ch]>1){
        char leftChar=s.charAt(left);
        charCount[leftChar]--;
        left++;
      }
        maxlength=Math.max(maxlength,i-left+1);
      }  
      return maxlength;
    }
}