class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> freq= new HashSet<>();
        for(int num : nums){
            if(freq.contains(num)){
                return true;
            }
            freq.add(num);
            
        }
        return false;
    }
}