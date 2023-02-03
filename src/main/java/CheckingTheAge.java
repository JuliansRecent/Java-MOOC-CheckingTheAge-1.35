
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user for their age
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        // If they are less than 0 y/o or more than 120 y/o print "Impossible!" to the console
        if (age < 0 || age > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
