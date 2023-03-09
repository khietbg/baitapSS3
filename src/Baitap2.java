import java.util.Arrays;
import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        int [] arr= {2,4,5,7,3,8};
        int [] newArr = new int [arr.length+1];
        int addNum;
        int addI;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("nhap vi tri muon them");
            addI = input.nextInt();
            System.out.println("so muon them");
            addNum =  input.nextInt();
            System.arraycopy(arr,0,newArr,0,addI);
            newArr[addI]=addNum;
            System.arraycopy(arr,addI,newArr,addI+1,arr.length-addI);
            System.out.println("arr"+ Arrays.toString(arr));
            System.out.println("newarr"+ Arrays.toString(newArr));


        }while (addI<0||addI>arr.length);
    }
}
