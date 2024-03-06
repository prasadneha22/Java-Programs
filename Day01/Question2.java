public class Question2 {
    public static void main(String[] args) {
        
        double length1 = Double.parseDouble(args[0]);
        double length2 = Double.parseDouble(args[1]);
        double length3 = Double.parseDouble(args[2]);

        double perimeter = length1 + length2 + length3;

        System.out.println("Perimeter of triangle is : " + perimeter);
    }
}
