package array;

import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int row = kb.nextInt();
        int col = kb.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter" + (row * col) + " elements");
                arr[i][j] = kb.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum = sum + arr[i][j];
            }

        }
        System.out.println("sum is"+sum);
        System.out.println("average is"+(float)sum/(row*col));
    }
}
