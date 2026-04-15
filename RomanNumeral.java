// Shaurya Jain
// RomanNumeral.java
/* This program uses an if / else if / else statement to determine
the correct Roman Numeral for the number entered by the user.*/

import java.util.Scanner;

public class RomanNumeral {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 5: ");
        int number = kb.nextInt();
        
        String romanNumeral;
        
        if (number == 1) {
            romanNumeral = "I";
        } else if (number == 2) {
            romanNumeral = "II";
        } else if (number == 3) {
            romanNumeral = "III";
        } else if (number == 4) {
            romanNumeral = "IV";
        } else if (number == 5) {
            romanNumeral = "V";
        } else {
            romanNumeral = "Invalid input. Please enter a number between 1 and 5.";
        }
        
        System.out.println("The Roman numeral for" + number + " is: " + romanNumeral);
    }5
}