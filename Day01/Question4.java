import java.util.*;

public class Question4 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Robert in three subjects out of 100 : ");

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        System.out.println("Total marks is : " + total);

        float percentage = ((float) total / 300) * 100;
        System.out.println("Percentage: " + percentage + "%");
        
        
    }
}
