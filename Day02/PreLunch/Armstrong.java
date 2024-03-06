public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");

        for (int num = 100; num <= 500; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        return result == number;
    }
}
