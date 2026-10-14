class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]arr=new int[2];
        Map <Integer,Integer> mymap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ans=target-nums[i];
            if(mymap.containsKey(ans)){
                return new int[]{mymap.get(ans),i};
            }
            mymap.put(nums[i],i);
        }
        return new int[]{};
    }
}