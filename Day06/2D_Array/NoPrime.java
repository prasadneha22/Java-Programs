import java.util.Scanner;

public class NoPrime {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

       
        int[][] arrayNoPrimes = new int[rows][cols];
        System.out.println("Enter values for 2D-array with no prime numbers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value;
                do {
                    System.out.print("Enter value for [" + i + "][" + j + "]: ");
                    value = scanner.nextInt();
                    if (isPrime(value)) {
                        System.out.println("Prime numbers are not allowed. Please enter a different value.");
                    }
                } while (isPrime(value));
                arrayNoPrimes[i][j] = value;
            }
        }

        System.out.println("2D-array with no prime numbers:");
        for (int[] row : arrayNoPrimes) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
