package arraysss;
import java.util.Scanner;

public class largestno {
    public static void main(String[]args){
        Scanner kb=new Scanner(System.in);
        System.out.println("enter th length of arrays");
        int a=kb.nextInt();
        int[] arr=new int[a];
        System.out.println("enter the elements of array:");
        for (int i=0;i<a;i++){
            arr[i]=kb.nextInt();

        }
        int max=0;
        for(int x:arr){
            if(max<x){
                max=x;
            }
        }
        System.out.println("largest no. is"+max);
    }



}
