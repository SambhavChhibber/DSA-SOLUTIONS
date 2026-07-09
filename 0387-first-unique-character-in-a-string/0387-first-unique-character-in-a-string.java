class Solution {
    public int firstUniqChar(String s) {
       
      int[] counts= new int[26];
      for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        counts[ch-'a']++;
        
      }  
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(counts[ch-'a']==1){
            return i;
        }
      }
return -1;
    }
}