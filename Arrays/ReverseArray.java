import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {
                1, 2, 3, 4, 5
        };
        System.out.println("Before:  " + Arrays.toString(arr));
        int i2 = arr.length-1;
        reverse(arr, 0, i2);
        System.out.println("After: " + Arrays.toString(arr));
    }

    static void reverse(int[] arr, int i1, int i2) {
        int start= i1;
        int end=i2;

        while (start>end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
