public class Hourglass{
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = n; i>=1; i--){
        
            //spaces

            for(int s = 0; s<n-i; s++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 2; i<=n; i++){
        
            //spaces

            for(int s = 0; s<n-i; s++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}