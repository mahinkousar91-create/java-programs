
class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int count = 0;

        if (n == 0) {
            return true;
        }
        if (arr[0] == 0 && (arr.length == 1 || arr[1] == 0)) {
            arr[0] = 1;
            count++;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] == 0 && arr[i] == 0 && arr[i + 1] == 0) {
                arr[i] = 1;
                count++;
            }
        }
        if (arr.length > 1 && arr[arr.length - 1] == 0
                && arr[arr.length - 2] == 0) {
            arr[arr.length - 1] = 1;
            count++;
        }

        if (count >= n) {
            return true;
        } else {
            return false;
        }
    }
}