class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){return 0;}
    int writer=0;
    for(int reader=0;reader<nums.length;reader++){
        if(nums[reader]!=val){
            nums[writer]=nums[reader];
            writer++;
            
        }
    }
    return writer;
    }
}