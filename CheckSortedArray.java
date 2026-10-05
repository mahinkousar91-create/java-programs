package array;

public class CheckSortedArray {
    static void main(String[] args) {
        int[]arr={1,3,4,2,6,7,8};
        int[]temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    temp[i]=arr[i];
                }
                else{
                    temp[i]=arr[j];

                }

            }
        }
        for(int x:temp){
            System.out.println(x);}
    }
}
