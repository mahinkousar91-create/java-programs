class Solution {
    public int thirdMax(int[] nums) {
        TreeSet <Integer> myset=new TreeSet<>();
        for(int x:nums){
            myset.add(x);
        }
        if(myset.size() < 3){
            return myset.last();
        }
        Iterator<Integer>itr=myset.descendingIterator();
        itr.next();
        itr.next();
        return itr.next();
    }
}