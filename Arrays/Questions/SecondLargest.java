    public class SecondLargest {
        public static void main(String[] args) {
            int[] arr = { 10, 5, 8, 20, 15 };
            int secondLargest = 0, largest = 0;
            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > largest) {
                    secondLargest= largest;
                    largest = arr[i];
                }
                else if (arr[i]>secondLargest && arr[i]!=secondLargest) {
                    secondLargest = arr[i];
                }
            }
            System.out.println("Largest element: " + largest);
            System.out.println("Second largest element: " + secondLargest);

        }
    }
