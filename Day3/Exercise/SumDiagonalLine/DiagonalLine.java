public class DiagonalLine {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {4,3,2,1},
                {3,4,5,2},
                {5,4,3,1}
        };
        int sumA  = 0;
        int sumB  = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( i == j){
                    sumA += arr[i][j];
                }if ( i + j == arr.length - 1){
                    sumB += arr[i][j];
                }
            }
        }
        int sum = sumA + sumB;
        System.out.println("Tong cua 2 duong cheo la: " + sum);
    }
}
