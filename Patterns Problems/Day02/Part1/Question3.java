import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows :");
    int rows = sc.nextInt();
    System.out.print("How many times repeate this pattern in row wise :");
    int noOfTimes = sc.nextInt();
    
      for(int i = 1; i <= rows; i++) {
        
          if(i == 1 || i == rows) {
            for(int h=1;h<=noOfTimes;h++) {
            for(int j = 1; j <= rows-1; j++) {
              System.out.print("*");
            }
          } 
          
          System.out.println();
          }
          else if(i >= 2 && i < rows) { 
            for(int h=1;h<=noOfTimes;h++) {
            for(int j = 1; j <= rows-1; j++) {
              if(j == 1 ) {
                System.out.print("* ");
              }
              else {
                System.out.print(" ");
              }
            }
            
          }        
            System.out.println(); 
          }
          
          }
        }
      }
    
    
  
  
