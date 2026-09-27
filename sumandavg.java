package arraysss;

public class sumandavg {
    static void main(String[] args) {
        int[]arr={10,20,3,5,6,7};
        int even=0,odd=0;
        for(int x: arr){
            if(x%2==0){
                even=even+x;
            }
            else {
                odd=odd+x;
            }
        }
        System.out.println(even);
        System.out.println(odd);

    }
}
