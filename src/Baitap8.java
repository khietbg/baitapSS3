import java.util.Arrays;
import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        String arr[]={"hieu","nam","khiet","tuan"};
        Scanner input = new Scanner(System.in);
        System.out.println("nhap chuoi can tim");
        String name = input.nextLine();
        int count = 0;

        for ( int i=0; i < arr.length; i++) {
            if (arr[i].equals(name)){
                System.out.println("vi tri cua "+name+" la thu"+i);

                count++;
            }

        }
        System.out.println("xuat hien "+count+" lan");



    }
}
