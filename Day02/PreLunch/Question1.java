import java.util.Scanner;

public class Question1 {

      /**
     * This is the main method where the program starts execution.
     * It prompts the user to enter the length and breadth of the rectangle.
     * It then checks whether the given rectangle is a square or a rectangle based on its dimensions.
     * @param args The command-line arguments passed to the program (not used in this program).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int length = sc.nextInt();

        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();

        if(length == breadth){
            System.out.println("The rectangle is a square.");
        } else {
            System.out.println("It is a rectangle.");
        }
    }
}
