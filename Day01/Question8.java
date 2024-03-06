import java.util.*;

public class Question8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int number = sc.nextInt();

       
        if (number < 10000 || number > 99999) {
            System.out.println("Invalid input");
        }

        int firstDigit = number / 10000;
        int secondLastDigit = (number / 10) % 10;
        int sum = firstDigit + secondLastDigit;

        System.out.println("Sum : " + sum);
    }
}
