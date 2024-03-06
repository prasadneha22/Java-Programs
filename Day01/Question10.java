import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number");
        int num  = sc.nextInt();
         int ans = 0;
    

        while(num!=0){
            int rem = num % 10;
            ans = ans * 10 + rem;
            num/=10;
        }
        System.out.println("After reversing : " + ans);
    }
}
