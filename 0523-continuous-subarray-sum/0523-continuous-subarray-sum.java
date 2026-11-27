class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int a=prefix%k;
            if(!(map.containsKey(a))){
                map.put(a,i);
            }
            else{
                int x=map.get(a);
                int ans=i-x;
                if(ans>=2){
                    return true;
                }
            }
        }
        return false;
    }
}