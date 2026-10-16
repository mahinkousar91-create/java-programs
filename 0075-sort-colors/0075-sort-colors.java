class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int last=nums.length-1;
        int right=0;
        while(right<=last){
            if(nums[right]==0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
                right++;
            }
            else if(nums[right]==2){
                int temp=nums[last];
                nums[last]=nums[right];
                nums[right]=temp;
                last--;
            }
            else{
                right++;
            }
        }
    }
}