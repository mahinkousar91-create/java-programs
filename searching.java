package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class searching {
    static void main() {
        ArrayList<String> movie=new ArrayList<>();
        movie.add("pathan");
        movie.add("gadar-2");
        movie.add("RARKPK");
        movie.add("kerela story");
        movie.add("TJMM");
        System.out.println("enter the movie you want to search");
        Scanner sc=new Scanner(System.in);
        String kb=sc.nextLine();
        int x=movie.indexOf(kb);
        System.out.println("the ranking is "+(x+1));


    }

}
