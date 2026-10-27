class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        char[]arr=s.toCharArray();
        String reverse="";
        for(int i=arr.length-1;i>=0;i--){
            reverse=reverse+arr[i];
         }
         if(reverse.equals(s)){
            return true;
         }
         else{
            return false;
         }
    }
}