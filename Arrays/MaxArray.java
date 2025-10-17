import java.util.Arrays;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {
                11, 22, 33, 44, 55
        };

        System.out.println("Before: " + Arrays.toString(arr));
        int largest = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
