// Shaurya Jain
// WhatsMyGrade.java
/*Use an if, else if conditional statements to determine the letter grade of the average.*/

import java.util.Scanner;

public class WhatsMyGrade  {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Welcome to the avg num grade to letter grade converter.");
        
        System.out.print("Enter grade #1: ");
        double grade1 = kb.nextDouble();

        System.out.print("Enter grade #2: ");
        double grade2 = kb.nextDouble();

        System.out.print("Enter grade #3: ");
        double grade3 = kb.nextDouble();

        double avg = (grade1 + grade2 + grade3)/3;
        
        String letter;

        if (avg >= 90) {
            letter = "A";
        } else if (avg >= 80 && avg < 90) {
            letter = "B";
        } else if (avg >= 70 && avg < 80) {
            letter = "C";
        } else if (avg >= 60 && avg < 70) {
            letter = "D";
        } else {
            letter = "F";
        }

        System.out.println("\nYour three grades are: " + grade1 + ", " + grade2 + ", " + grade3 + ".");
        System.out.printf("Your average is: %.2f", avg);
        System.out.println("\nYour letter grade is: " + letter);
    }
}

/* Output (91, 80, 70):
Welcome to the avg num grade to letter grade converter.
Enter grade #1: 91
Enter grade #2: 80
Enter grade #3: 70

Your three grades are: 91.0, 80.0, 70.0.
Your average is: 80.33
Your letter grade is: B

(68, 73, 85):
Welcome to the avg num grade to letter grade converter.
Enter grade #1: 68
Enter grade #2: 73
Enter grade #3: 85

Your three grades are: 68.0, 73.0, 85.0.
Your average is: 75.33
Your letter grade is: C

(93, 97, 95):
Welcome to the avg num grade to letter grade converter.
Enter grade #1: 93
Enter grade #2: 97
Enter grade #3: 95

Your three grades are: 93.0, 97.0, 95.0.
Your average is: 95.00
Your letter grade is: A
*/