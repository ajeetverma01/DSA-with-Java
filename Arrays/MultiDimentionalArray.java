package Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        String arr[][][] = new String[3][3][3];
        Scanner sc = new Scanner(System.in);

        //input in 3d array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int j2 = 0; j2 < arr[i][j].length; j2++) {
                    arr[i][j][j2] = sc.nextLine();
                }
            }
        }

        System.err.println("Printing.............................");
        // Printing
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int j2 = 0; j2 < arr[i][j].length; j2++) {
                    System.out.print(arr[i][j][j2]);
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
