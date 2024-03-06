public class Swap1 {
    
    public static void main(String[] args) {

        // swapping two numbers using 3rd variable
        
        int a = 6;
        int b = 8;
        System.out.println("Before swapping\n" + "a = " + a +" "+ "b = " + b);
        

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping\n" + "a = " + a +" "+ "b = " + b);
    }
}
