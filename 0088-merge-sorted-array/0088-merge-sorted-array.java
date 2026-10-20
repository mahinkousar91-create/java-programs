class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<nums2.length;i++){
            if(i<n){
                nums1[m]=nums2[i];
                m++;
            }
            
        }
        Arrays.sort(nums1);
    }
}