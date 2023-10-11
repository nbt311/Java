import java.util.Arrays;
import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Gop 2 mang----");
        System.out.println("Nhap do dai mang 1");
        int m = scanner.nextInt();
        int[] array1 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap phan tu cua array1 tai vi tri:" + i);
            int value = scanner.nextInt();
            array1[i] = value;
        }
        System.out.println("Nhap do dai mang 2");
        int n = scanner.nextInt();
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu cua array2 tai vi tri:" + i);
            int value = scanner.nextInt();
            array2[i] = value;
        }

        System.out.println("Mang 1: " + Arrays.toString(array1));
        System.out.println("Mang 2: " + Arrays.toString(array2));
        System.out.println("Mang sau khi gop: " + Arrays.toString(combine(array1,array2)));
    }

    public static int[] combine(int[] arr1,int[] arr2 ){
        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m+n];
        for (int i = 0; i < m; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < n; i++) {
            result[m] = arr2[i];
            m++;
        }
        return result;
    }

}
