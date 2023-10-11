import java.util.Arrays;
import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Xoa phan tu khoi mang----");
        int[] arr = {2,4,6,7,8,1};
        System.out.println("Nhap index");
        int index = scanner.nextInt();
        System.out.println("Mang sau khi xoa: " + Arrays.toString(remove(arr,index)) );

    }


    public static int[] remove(int[] array, int index) {
        int n = array.length;
        if (index >= n){
            return array;
        }
        int[] result = new int[n-1];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if ( i == index){
                continue;
            }
            result[k] = array[i];
            k++;
        }
        return result;
    }
}
