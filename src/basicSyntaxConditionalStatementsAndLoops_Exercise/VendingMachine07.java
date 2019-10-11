package basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        double sum = 0;
        double price = 0;

        while (true) {
            input = scanner.nextLine();

            if (input.equals("Start")) {
                break;
            }
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
        }

        String product = scanner.nextLine();
        boolean productPurchased = false;

        while (!product.equals("End")) {


            switch (product) {
                case "Nuts":
                    price = 2.0;

                    productPurchased = true;
                    break;
                case "Water":
                    price = 0.7;
                    productPurchased = true;
                    break;
                case "Crisps":
                    price = 1.5;
                    productPurchased = true;
                    break;
                case "Soda":
                    price = 0.8;
                    productPurchased = true;
                    break;
                case "Coke":
                    price = 1.0;
                    productPurchased = true;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;

            }

            if (sum >= price && productPurchased ) {
                System.out.printf("Purchased %s%n", product);
                sum -= price;

                price = 0;
            } else if (price > 0) {
                System.out.printf("Sorry, not enough coins%n");
                price = 0;

            }

            product = scanner.nextLine();


        }

        System.out.printf("Change: %.2f", sum);

    }
}
/*You task is to calculate the total price of a purchase from a vending machine. Until you receive "Start" you will be given different coins that are being inserted in the machine. You have to sum them in order to have the total coins inserted. There is a problem though. Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins. If someone tries to insert some other coins you have to display "Cannot accept {coins}", where the value is formated to the second digit after the decimal point and not add it to the total coins. On the next few lines until you receive "End" you will be given products to purchase. Your machine has however only "Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively. If the person tries to purchase a not existing product print “Invalid product”. Be careful that the person may try to purchase a product for which he doesn't have coins. In that case print "Sorry, not enough coins". If the person purchases a product successfully print "Purchased {product name}". After the “End” product print the coins that are left formatted to the second decimal point in the format "Change: {coins left}".
Examples
Input
1
1
0.5
0.6
Start
Coke
Soda
Crisps
End

Output
Cannot accept 0.60
Purchased Coke
Purchased Soda
Sorry, not enough coins
Change: 0.70
*/