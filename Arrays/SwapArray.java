import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {
                1, 2, 3, 4, 5
        };
        int i1 = 1; // These values are indexes of the array.
        int i2 = 2;

        System.out.println("Before: " + Arrays.toString(arr));
        swap(arr, i1, i2);

        System.out.println("After: " + Arrays.toString(arr));

    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
