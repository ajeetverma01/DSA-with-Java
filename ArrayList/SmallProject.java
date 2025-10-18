import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class SmallProject {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> names;

    public static void main(String[] args) throws IOException {

        SmallProject q1 = new SmallProject();
        q1.defaultDetails();
    }

    void defaultDetails() throws IOException {
        names = new ArrayList<>(5);
        names.add("Ajeet");
        names.add("Sujeet");
        names.add("Parul");
        names.add("Kanhaiya");
        names.add("Lavkush");
        executer();
    }

    int choices() throws IOException {
        System.out.println("Enter 1 to show available names.");
        System.out.println("Enter 2 to insert new names.");
        System.out.println("Enter 3 to update names.");
        System.out.println("Enter 4 to exit.");
        System.out.print("\nEnter your choice: ");

        int choice = Integer.parseInt(br.readLine());
        return choice;
    }

    void executer() throws IOException {
        int choice = choices();
        switch (choice) {
            case 1:
                availableNames();
                break;
            case 2:
                insertNewName();
                break;
            case 3:
                updateNames();
                break;
            case 4:
                System.out.println("Program Closed.");
                break;
            default:
                System.out.println("Wrong input.");
                break;
        }
    }

    void runAgain() throws IOException {

        String choice = br.readLine();
        if (choice.equalsIgnoreCase("y")) {
            executer();
        } else if (choice.equalsIgnoreCase("n")) {
            System.out.println("Program closed.");
        } else
            System.out.println("Wrong input... Program closed.");
    }

    void availableNames() throws IOException {
        System.out.println(names);
        System.out.print("Wanna run again? Enter y or n: ");

        runAgain();
    }

    void insertNewName() throws IOException {
        System.out.println("Enter names to insert (Enter 'done' to close): ");

        String nameStr;
        while (true) {
            nameStr = br.readLine();
            if (nameStr.equalsIgnoreCase("done"))
                break;
            else
                names.add(nameStr);
        }
        System.out.println("Names inserted successfully.");
        System.out.print("Wanna run again? Enter y or n: ");
        runAgain();
    }

    void updateNames() throws IOException { //This is not working .... 
        System.out.print("Enter name to update: ");
        String oldName = br.readLine();
        System.out.print("Enter new name: ");
        String newName = br.readLine();

        int i = 0;
        while (true) {
            if (names.indexOf(oldName) == i) {
                names.set(i, newName);
                System.out.println("Names updated successfully...\n");
                break;
            } else
                System.out.println("No names found.");
            break;
        }
        availableNames();
    }

}
