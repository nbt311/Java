import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Tim gia tri lon nhat----");
        System.out.println("Nhap do dai cua mang");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap phan tu cua mang tại vi tri: " + i);
            int value = scanner.nextInt();
            arr[i] = value;
        }
        System.out.println("Gia tri lon nhat la: " + getMax(arr));
    }


    public static int getMax(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
