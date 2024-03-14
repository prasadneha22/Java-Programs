import java.util.Scanner;

public class Question4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the row");
        int row = scanner.nextInt();
        System.out.println("Enter the number of columns required");
        int col = scanner.nextInt();

        for(int j = 0;j<col; j++){

       
        for (int i = 1; i <= row; i++) {
         
           
               
                for (int k = 1; k <= row; k++) {
                    
                    if (i == 1 || i == row || k == 1 || k == row) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            
            System.out.println(); 
        }
        
         }

    }
}