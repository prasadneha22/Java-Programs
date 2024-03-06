public class Question7 {
    public static void main(String[] args) {
        
        int arr[] = {1,5,6,2,9,22,12};

        int max = arr[0];
        int min = arr[0];

        for(int i = 0;i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("The maximum value in array is : " +max);
        System.out.println("The minimum value in array is : " +min);
    }
}
