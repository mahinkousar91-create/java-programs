class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>mylist=new ArrayList<>();
        Set<Integer>myset=new HashSet<>();
        for(int num:nums){
            boolean ans=myset.add(num);
            if(ans==false){
                mylist.add(num);
            }
        }
        return mylist;
    }
}