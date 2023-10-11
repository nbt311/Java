import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Tim gia tri nho nhat trong mang----");
        System.out.println("Nhap do dai cua mang");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap phan tu cua mang tai vi tri: " + i);
            int value = scanner.nextInt();
            arr[i] = value;
        }
        System.out.println("Mang: " + Arrays.toString(arr));
        System.out.println("Gia tri nho nhat la: " + getMinElement(arr));
    }

    public static int getMinElement(int[] array){
        int n = array.length;
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
