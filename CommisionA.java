// Shaurya Jain
// CommissionA.java
/*A used car company pays a % commission to their salespeople if they make a sale of $7,500 or more.
If their sale does not meet or exceed that amount, they get no commission.*/

import java.util.Scanner;

public class CommisionA {
    public static void main(String[] args) {
        double commission = 0.0;
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter the amount of the sale: ");
        double saleAmount = kb.nextDouble();
        
        if (saleAmount >= 7500) {
            commission = saleAmount * 0.1; // 10% commission
        }
        
        double netProceed = saleAmount - commission;
        
        System.out.println("The sale amount is:     $" + saleAmount);
        System.out.println("The commission is:      $" + commission);
        System.out.println("The net proceeds are:   $" + netProceed);
    }
}

/* Output ($5000 sale):
Enter the amount of the sale: 5000
The sale amount is:     $5000.0
The commission is:      $0.0
The net proceeds are:   $5000.0

Output ($10000 sale):
Enter the amount of the sale: 10000
The sale amount is:     $10000.0
The commission is:      $1000.0
The net proceeds are:   $9000.0
*/