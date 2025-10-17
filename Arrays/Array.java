import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // arr={1,2,3,4,5}; //Wrong
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
 
        // Using normal for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]); 
        }

        // using for each loop
        for (int i : arr) {
            System.out.print(i+" ");
        }


        // Using built in function
        System.out.println(Arrays.toString(arr));

        String[]  str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();
        }

        System.out.println(Arrays.toString(str));
        change(str);
        System.out.println(Arrays.toString(str));
        sc.close();
    }
    static void change(String[] a){
        a[0]="Ajjeeet";
    }   
    
    
}
