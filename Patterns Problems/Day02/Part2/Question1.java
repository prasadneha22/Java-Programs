

public class Question1 {
    public static void main(String[] args) {
        
        int n  = 4;

        //upper half
        for(int i = 1; i<=n; i++){

            //spaces

            for(int s = 0; s<n-i; s++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half

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
        
    }
}
