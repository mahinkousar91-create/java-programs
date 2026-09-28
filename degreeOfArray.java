package array;

import java.util.Arrays;
public class degreeOfArray {
    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,2, 2,4,4,8,9};
        Arrays.sort(arr);
        int maxCount = 0;
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int temp = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (temp == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                element = temp;
            }
        }
        System.out.println("element with maximum degree is:"+ element);
        System.out.println("degree:" + maxCount);
    }
}