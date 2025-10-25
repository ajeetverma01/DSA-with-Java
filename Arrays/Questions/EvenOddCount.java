public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = { 80, 2, 33, 5, 75, 7,0,9,44 };
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2==0) {
                even+=1;
            }
            else odd+=1;
        }
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }

}
