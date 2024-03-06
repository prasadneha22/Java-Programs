import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] reversedNumbers = new int[10];

        Scanner scanner = new Scanner(System.in);

        // Taking 10 integer inputs from the user and storing them in the array
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Copying elements into another array in reverse order
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[numbers.length - 1 - i] = numbers[i];
        }

        // Printing the reversed array
        System.out.println("\nThe elements in reverse order are:");
        for (int num : reversedNumbers) {
            System.out.println(num);
        }

        // Closing the Scanner object
        scanner.close();
    }
}
