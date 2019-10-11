package basicSyntaxConditionalStatementsAndLoops_MoreExercise;

import java.util.Scanner;

public class GamingStore_333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double startBalance = balance;
        double price = 0;

        while (true) {
            String game = scanner.nextLine();
            if (game.equals("Game Time")) {
                if (balance <= 0) {
                    System.out.println("Out of money!");
                }
                break;
            }

            if (!(game.equals("OutFall 4")) && !(game.equals("CS: OG")) && !(game.equals("Zplinter Zell"))
                    && !(game.equals("Honored 2")) && !(game.equals("RoverWatch")) && !(game.equals("RoverWatch Origins Edition"))) {
                System.out.println("Not Found");
                continue;
            }

            switch (game) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
            }
            if (balance <= 0) {
                System.out.println("Out of money!");
                break;
            }
            if (balance < price) {
                System.out.println("Too Expensive");
                continue;
            }
            System.out.println("Bought " + game);
            balance -= price;
        }
        if (balance > 0) {
            double totalSpent = startBalance - balance;
            double remaining = startBalance - totalSpent;
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, remaining);
        }
    }
}
