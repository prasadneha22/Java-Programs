import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int gcd = 1;
        for(int i = 1; i<=a && i<=b; i++ ){
            if(a%i ==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println("Gcd of two  numbers are : " +gcd);
    }
}
