public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 80, 2, 33, 5, 75 };
        System.out.print("Array before reverse: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Array after reverse: ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
