// Shaurya Jain
// NameOrder.java
/* Use an if/else if statement, String Comparisons, and relational operators to
determine which name comes first alphabetically, not case sensitive. */

import java.util.Scanner;

public class NameOrder {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String name1 = kb.nextLine();

        System.out.print("Enter the second name: ");
        String name2 = kb.nextLine();

        System.out.println("You entereed the names: " + name1 + " and " + name2);

        if (name1.compareToIgnoreCase(name2) < 0) {
            System.out.println(name1 + " comes before " + name2 + " alphabetically.");
        } else if (name1.compareToIgnoreCase(name2) > 0) {
            System.out.println(name2 + " comes before " + name1 + " alphabetically.");
        } else {
            System.out.println("Both names are the same.");
        }
    }
}

/* Sample Output (Michael and Michelle):
Enter the first name: Michael
Enter the second name: Michelle
You entereed the names: Michael and Michelle
Michael comes before Michelle alphabetically.

Sample Output (Michael and Michael):
Enter the first name: Michael
Enter the second name: Michael
You entereed the names: Michael and Michael
Both names are the same.
*/