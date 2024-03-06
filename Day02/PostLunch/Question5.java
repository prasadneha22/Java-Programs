public class Question5 {
    public static void main(String[] args) {
        
        int arr[] = {2, 12, 14, 6, 1};

        int sum = 0;
        int prod = 1;

        for(int i = 0; i<arr.length; i++){
            prod = prod * arr[i];
            sum = sum + arr[i];
        }
        System.out.println("the sum of the array elements are : " + sum);
        System.out.println("the product of the array elements are : " + prod);
    }
}
