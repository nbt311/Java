public class NumberArray {
    public static void main(String[] args) {
        System.out.println("----Tim gia tri nho nhat----");
        int [] arr = {4,12,7,8,1,6,9};
        System.out.println("Gia tri nho nhat la: " + getMin(arr));

    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
