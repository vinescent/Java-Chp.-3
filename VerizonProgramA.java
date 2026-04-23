// Shaurya Jain
// VerizonProgramA.java
/* Use nested if statements and String Comparisons to determine the cell
phone bill for the user. */

import java.util.Scanner;

public class VerizonProgramA {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Premptive var declerations to avoid scope issues
        double baseCost = 0.0;
        int gigsIncluded = 0;
        int costPerExtraGig = 0;

        System.out.println("Welcome to Verizon! - CELL PHONE PLAN OPTIONS\n\n");
        System.out.println("                    Plan A  Plan B  Plan C");
        System.out.println("Base Cost:          $9.95   $14.95  $24.95");
        System.out.println("Gigs Included:      10      20      Unlimited");
        System.out.println("Cost per extra gig: $3      $2      N/A\n\n\n");

        System.out.println("Please enter your plan (A, B, or C): ");
        String plan = kb.nextLine().toUpperCase();

//        if (plan != "A" || plan != "B" || plan != "C") {
//            System.out.println("Invalid input. Please enter A, B, or C: ");
//            plan = kb.nextLine().toUpperCase();
//        }

        // Set plan info vars based on selected plan
        if (plan.equals("A")) {
            baseCost = 9.95;
            gigsIncluded = 10;
            costPerExtraGig = 3;
        } else if (plan.equals("B")) {
            baseCost = 14.95;
            gigsIncluded = 20;
            costPerExtraGig = 2;
        } else if (plan.equals("C")) {
            baseCost = 24.95;
            gigsIncluded = 0;
            costPerExtraGig = 0;
        }

        System.out.println("Please enter the number of gigs used (whole number): ");
        int gigsUsed = kb.nextInt();

        double bill = 0.0;

        if (plan.equals("A")) {
            bill = 9.95;
            if (gigsUsed > 10) {
                bill = bill + (gigsUsed - 10) * 3;
            }
        } else if (plan.equals("B")) {
            bill = 14.95;
            if (gigsUsed > 20) {
                bill = bill + (gigsUsed - 20) * 2;
            }
        } else if (plan.equals("C")) {
            bill = 24.95;
        } else {
            System.out.println("Invalid plan entered.");
            return;
        }
        
        // Fix negative extra gigs
        int extraGigsUsed = 0;

        if (gigsUsed < gigsIncluded) {
            extraGigsUsed = 0;
        } else {
            extraGigsUsed = gigsUsed - gigsIncluded;
        }

        System.out.println("CALCULATION RESULTS:\n");

        System.out.printf("Base Plan " + plan + " costs:\t%.2f\n", baseCost);
        System.out.println("Gigs included in plan:\t" + gigsIncluded);
        System.out.println("Gigs used:\t\t" + gigsUsed);
        System.out.println("Extra gigs used:\t" + extraGigsUsed);
        System.out.println("Cost per extra gig:\t" + costPerExtraGig);
        System.out.printf("Your bill is: \t\t$%.2f", bill);

    }
}