import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
    
        int[] numbers = new int[10];

      
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

       
        System.out.println("The integers you entered are:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }

        
    }
}
