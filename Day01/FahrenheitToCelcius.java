import java.util.*;

public class FahrenheitToCelcius {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit :");
      
        float fahrenheit = sc.nextFloat();

        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("After converting : " + celsius);


    }
}
