// Shaurya Jain
// WatchYourBP.java
/* This program uses an if/else if and a logical operator && to determine if the person
has high, normal,or low blood pressure. Write a program that accepts input and tells user
if blood pressure if high, normal, low. */

import java.util.Scanner;
public class WatchYourBP {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter your systolic blood pressure: ");
        int systolic = kb.nextInt();
        
        System.out.print("Enter your diastolic blood pressure: ");
        int diastolic = kb.nextInt();
        
        if (systolic < 90) {
            System.out.println("Your blood pressure is low at " + systolic + "/" + diastolic);
        } else if (systolic >= 90 && systolic <= 140) {
            System.out.println("Your blood pressure is normal at " + systolic + "/" + diastolic);
        } else if (systolic > 140) {
            System.out.println("Your blood pressure is high at " + systolic + "/" + diastolic);
        }
    }
}

/* Output (high blood pressure):
Enter your systolic blood pressure: 150
Enter your diastolic blood pressure: 70
Your blood pressure is high at 150/70.

Output (low blood pressure):
Enter your systolic blood pressure: 80
Enter your diastolic blood pressure: 70
Your blood pressure is low at 80/70.

Output (normal blood pressure):
Enter your systolic blood pressure: 120
Enter your diastolic blood pressure: 70
Your blood pressure is normal at 100/70.
*/