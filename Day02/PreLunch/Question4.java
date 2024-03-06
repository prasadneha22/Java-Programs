import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }

        double average = (double) sum / 10;
        System.out.println("Average value: " + average);

        
    }
}
