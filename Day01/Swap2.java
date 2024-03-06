public class Swap2 {
    
    public static void main(String[] args) {
        
        int a= 6;
        int b = 8;

        System.out.println("Before swapping\n" + "a = " + a +" "+ "b = " + b);

        a = a + b;
        b = a - b;
        a = a- b;

        System.out.println("Before swapping\n" + "a = " + a +" "+ "b = " + b);
    }
}
