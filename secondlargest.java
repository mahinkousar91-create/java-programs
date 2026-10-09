public class secondlargest {
    public static void main(String[] args){
        int[]arr={10,20,30,40,50};
        int max=arr[0];
        for(int x:arr){
            if(max<x){
                max=x;
            }

        }
        int secondlar=arr[0];
        for(int x:arr){
            if(x>secondlar && x<max){
                secondlar=x;
            }
        }
        System.out.println("the second largest no. is"+secondlar);
    }

}
