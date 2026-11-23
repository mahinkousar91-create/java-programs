class Solution {
    public int subarraySum(int[] nums, int k) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            int req=nums[i]-k;
            if(map.containsKey(req)){
                count+=map.get(req);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}