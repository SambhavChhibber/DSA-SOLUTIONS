class Solution {
    public void sortColors(int[] nums) {
       int count1=0;
       int count2=0;
       int count3=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==0){count1++;}
        else if(nums[i]==1){count2++;}
        else if(nums[i]==2){count3++;}
     }
     int index=0;
     while(count1>0){
        nums[index]=0;
        index++; count1--;
     }
     while(count2>0){
        nums[index]=1;
        index++; count2--;
     }
     while(count3>0){
        nums[index]=2;
        index++; count3--;
     }
    
    }
}