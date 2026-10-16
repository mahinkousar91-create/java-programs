class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> mymap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mymap.containsKey(nums[i])){
                if(i-mymap.get(nums[i])<=k){
                    return true;
                }
            }
            mymap.put(nums[i],i);
        }
        return false;
    }
}