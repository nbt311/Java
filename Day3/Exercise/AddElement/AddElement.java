import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Them phan tu vao mang----");
        int[] arr = {10,4,6,7,8};
        System.out.println("Nhap gia tri muon them");
        int number = scanner.nextInt();
        System.out.println("Nhap vi tri muon them phan tu");
        int index = scanner.nextInt();

        System.out.println("mang sau khi them: " + Arrays.toString(addElement(arr,number,index)));


    }

    public static int[] addElement(int[] array, int number,int index){
        int n = array.length;
        if ( index >= n){
            return array;
        }
        int k = 0;
        int[] result = new int[n+1];

        for (int i = 0; i < n; i++) {
            if (i == index){
                result[k] = number;
                k++;
            }
                result[k] = array[i];
            k++;
        }
        return result;
    }
}
