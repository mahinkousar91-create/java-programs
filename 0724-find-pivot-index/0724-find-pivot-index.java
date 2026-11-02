class Solution {
    public int pivotIndex(int[] nums) {
        int prev=0;
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(prev==(nums[nums.length-1]-nums[i])){
                return i;
            }
            prev=nums[i];
        }
        return -1;
    }
}