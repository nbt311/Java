import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Dao nguoc cac phan tu cua mang-----");
        int n = 5;
        int[] numbers = new int[n];
        int index = 0;
        while (index < n) {
            System.out.println("Nhap cac phan tu vi tri " + index + ": ");
            numbers[index] = scanner.nextInt();
            index++;
        }
        System.out.println("Mang ban dau: " + Arrays.toString(numbers));
        System.out.println("Mang sau khi dao nguoc: " + Arrays.toString(reverseArray(numbers)));
    }

    public static int[] reverseArray(int[] array) {
            int first = 0;
            int last = array.length - 1;
            while (first < last){
                int temp = array[first];
                array[first] = array[last];
                array[last] = temp;
                first++;
                last--;
       }
       return array;
    }
}
