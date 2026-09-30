package arraylist;

import java.util.ArrayList;
import java.util.List;

public class intersection {
    static void main(String[] args) {
        List<Integer> myList=new ArrayList<>();
        int[]nums1={10,20,30,40,50,6};
        int[]nums2={10,30,70,80,90};
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(!myList.contains(nums1[i])){
                        myList.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        System.out.println(myList);
    }
}
