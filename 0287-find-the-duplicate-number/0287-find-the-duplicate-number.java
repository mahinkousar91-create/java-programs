class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer>myset=new HashSet<>();
        boolean x=true;
        for(int i=0;i<nums.length;i++){
            x=myset.add(nums[i]);
            if(x==false){
                return nums[i];
            }
        }
        return 0;
    }
}