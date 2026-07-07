class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int []result= new int[n];
        if(k==0){return result;}
        int start=1; int end=k;
        if(k<0){
            start=n-Math.abs(k);
            end=n-1;
            k=Math.abs(k);
        }
        int windowSum=0;
        for(int i=start;i<=end;i++){
            windowSum+=code[i];
        }
        for(int i=0;i<n;i++){
            result[i]=windowSum; //stores the value of index 0 first which will be the sum of next 3 when k is 3//
            windowSum-=code[start%n];
            windowSum+=code[(end+1)%n];
            start++; end++;
        }
        
        return result;
    }
}
  
        