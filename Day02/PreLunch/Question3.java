import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of classes : ");

        int no_of_class = sc.nextInt();

        System.out.println("Enter the number of class attended");
        int no_of_classAttended = sc.nextInt();

        double percentage = (double) no_of_classAttended / no_of_class * 100;

        System.out.println("Percentage is : " + percentage);
        if (percentage < 75) {
            System.out.println("Are you medical cause ? yes or not ???");
            char choice = sc.next().charAt(0);
            System.out.println("Enter your choise");
            switch (choice) {
                case 'Y':
                    System.out.println("you can sit an exam");
                    break;
                case 'N':
                    System.out.println("you can't sit an exam");
                    break;
                default:
                    System.out.println("If any other is pressed");

            }
        } else
            System.out.println("You can sit in examination room");

    }
}

