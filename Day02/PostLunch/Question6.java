public class Question6 {
    public static void main(String[] args) {
        // Initializing a 2D array
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Printing all elements of the 2D array
        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
