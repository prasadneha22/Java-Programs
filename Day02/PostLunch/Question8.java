import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

       
        int maxDifference = Integer.MIN_VALUE;
        int minDifference = Integer.MAX_VALUE;
        int pairWithMaxDiffFirst = 0, pairWithMaxDiffSecond = 0;
        int pairWithMinDiffFirst = 0, pairWithMinDiffSecond = 0;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int difference = Math.abs(array[i] - array[j]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                    pairWithMaxDiffFirst = array[i];
                    pairWithMaxDiffSecond = array[j];
                }
                if (difference < minDifference) {
                    minDifference = difference;
                    pairWithMinDiffFirst = array[i];
                    pairWithMinDiffSecond = array[j];
                }
            }
        }

       
        System.out.println("Pair with maximum difference: " + pairWithMaxDiffFirst + " and " + pairWithMaxDiffSecond
                + " with difference " + maxDifference);
        System.out.println("Pair with minimum difference: " + pairWithMinDiffFirst + " and " + pairWithMinDiffSecond
                + " with difference " + minDifference);

        
    }
}
