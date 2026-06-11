public class abc {
    public static void main(String[] args) {
        //sum of array in variable
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array: " + sum);
    }
}