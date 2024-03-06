import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();

        int temp = number;

       while(temp!=0){
        int rem = temp % 10;
        sum+=rem;
        temp/=10;
       }
       System.out.println("Sum of the digits is : " + sum);

    }
}
