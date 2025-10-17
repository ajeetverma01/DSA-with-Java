
import java.util.ArrayList;

public class ArraylistEX {
    static void arrayList() {
        // We pass wrapper classes inside AL
        ArrayList<Integer> ar = new ArrayList<Integer>(3); //It can increase its capacity...
        ar.add(20);
        ar.add(25);
        ar.add(22);
        ar.add(25);
        ar.add(22);

        ar.set(2, 56); //To update
        System.out.println(ar);
    }

    public static void main(String[] args) {
        arrayList();
    }
}
