public class MaxElement {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {6,5,4},
                {10,4,6}
        };
        int max = matrix[0][0];
        int indexI = 0;
        int indexJ = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("Phan tu lon nhat la: " + max + " tai vi tri " + "[" + indexI +  "]" + "[" + indexJ + "]");
    }
}
