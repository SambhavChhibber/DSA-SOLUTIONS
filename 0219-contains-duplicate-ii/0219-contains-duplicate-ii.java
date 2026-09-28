class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int index=0;
        for(int num:nums){
            
            if(map.containsKey(num)){
                int PreviousIndex=map.get(num);
                int distance=index-PreviousIndex;
                if(distance<=k){return true;}

            }
            map.put(num,index);
            index++;
        }
        return false;
    }
}