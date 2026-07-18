class Solution {
    public int characterReplacement(String s, int k) {
    int[] charCount= new int[26];
    int left=0;
    int maxFrequency=0;
    int maxlength=0;
    for(int right=0;right<s.length();right++){
        int charIndex=s.charAt(right)-'A';
        charCount[charIndex]++;
        maxFrequency=Math.max(maxFrequency,charCount[charIndex]);

        if((right-left+1)-maxFrequency>k){
            charCount[s.charAt(left)-'A']--;
            left++;
        }
        maxlength=Math.max(maxlength,right-left+1);
    }
    return maxlength;

    }
    
}