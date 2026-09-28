class Solution {
    public int[] twoSum(int[] nums, int target) {
       
  HashMap<Integer,Integer> map = new HashMap<>();
  int index=0;
  for(int num:nums){
    int complement= target-num;
    if(map.containsKey(complement)){
        return new int[]{map.get(complement),index};
    }
    map.put(num,index);
    index++;
  }
  return new int[]{-1,-1};
    }
}
  
