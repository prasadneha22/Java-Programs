import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter a number to search in the array: ");
        int search = sc.nextInt();

        boolean check = false;

        for (int n : numbers) {
            if (n == search) {
                check = true;
                break;
            }
        }

        if (check) {
            System.out.println("The number " + search + " is present in the array.");
        } else {
            System.out.println("The number " + search + " is not present in the array.");
        }

      
    }
}
