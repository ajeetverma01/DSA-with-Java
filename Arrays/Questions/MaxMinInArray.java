public class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = { 80, 2, 33, 75, 7 };
        int smallest = arr[0], largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }

        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
