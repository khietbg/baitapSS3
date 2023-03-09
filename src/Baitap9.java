import java.util.Scanner;

public class Baitap9 {
    public static void main(String[] args) {
        int arr[];
        int size;

        Scanner  input = new Scanner(System.in);
        System.out.println("nhap size");
        size = input.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=input.nextInt();
        }
        int max1=0;
        int max2=0;
        for (int i = 0; i < arr.length; i++) {
            if (max1<arr[i]){
                max2=max1;
                max1=arr[i];

            }
        }
        System.out.println("phan tu lon thu 2 la: " +max2);
    }
}
