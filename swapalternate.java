package array;

public class swapalternate {
    static void main() {
        int[]arr={10,20,30,40,50,60};
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
}
