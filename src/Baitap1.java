import java.util.Arrays;
import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner iDel = new Scanner(System.in);
        int [] arr = {1,2,4,6,8,3};
        int [] newArr = new int[arr.length-1];
        int index;
        do {

            System.out.println("nhap vi tri muon xoa");
            index = iDel.nextInt();
            System.arraycopy(arr,0,newArr,0,index);
            System.arraycopy(arr,index+1,newArr,index,arr.length-index-1);
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(newArr));

        }while (index<0||index>arr.length );



    }
}