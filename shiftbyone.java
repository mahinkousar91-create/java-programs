package arraysss.array;

public class shiftbyone {
    static void main() {
        int []arr={10,20,30,40,50};
        int last=arr.length-1;
        for(int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        for(int i=1;i<arr.length;i++){
            System.out.println(arr[1]);
        }

    }

}
