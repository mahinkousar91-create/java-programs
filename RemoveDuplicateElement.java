package array;

public class RemoveDuplicateElement {
    static void main(String[] args) {
        int[]nums={10,10,20,30,10};
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
