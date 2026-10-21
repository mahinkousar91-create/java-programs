class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            sum1=sum1+i;
        }
        return sum1-sum;

    }
}