import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr;
        int col;
        int row;
        System.out.println("nham vao row");
        row = input.nextInt();
        System.out.println("nhap col");
        col = input.nextInt();
        arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
