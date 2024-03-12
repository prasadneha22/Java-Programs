import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoDuplicate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

       
        int[][] arrayNoDuplicates = new int[rows][cols];
        System.out.println("Enter values for 2D-array with no duplicate values:");

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer>[] colSets = new HashSet[cols];
        for (int i = 0; i < cols; i++) {
            colSets[i] = new HashSet<>();
        }

        for (int i = 0; i < rows; i++) {
            rowSet.clear(); 
            for (int j = 0; j < cols; j++) {
                int value;
                do {
                    System.out.print("Enter value for [" + i + "][" + j + "]: ");
                    value = scanner.nextInt();
                } while (rowSet.contains(value) || colSets[j].contains(value));
                arrayNoDuplicates[i][j] = value;
                rowSet.add(value);
                colSets[j].add(value);
            }
        }

        
        System.out.println("2D-array with no duplicate values:");
        for (int[] row : arrayNoDuplicates) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
