import java.util.ArrayList;
import java.util.Scanner;

class MultiDimentionArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(in.nextInt());
            }
        }

        System.out.println(arr);


        // Closing the scanner : Chatgpt nhi use kiya hai, don't worry
        in.close(); 
    }
}