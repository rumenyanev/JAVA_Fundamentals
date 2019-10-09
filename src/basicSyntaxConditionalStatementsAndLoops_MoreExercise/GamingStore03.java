package basicSyntaxConditionalStatementsAndLoops_MoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class GamingStore03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double priceGame = 0.0;
        double currentBalance = balance;

        Map<String, Game> games = new LinkedHashMap<>();
        games.put("OutFall 4", new Game("OutFall 4", 39.99));
        games.put("CS: OG", new Game("CS: OG", 15.99));
        games.put("Zplinter Zell", new Game("Zplinter Zell", 19.99));
        games.put("Honored 2", new Game("Honored 2", 59.99));
        games.put("RoverWatch", new Game("RoverWatch", 29.99));
        games.put("RoverWatch Origins Edition", new Game("RoverWatch Origins Edition", 39.99));

        String game = scanner.nextLine();
        while (!game.equals("Game Time")) {


            if (games.containsKey(game)) {

                priceGame = games.get(game).getPrice();

                if (currentBalance < priceGame && priceGame > 0) {
                    System.out.println("Too Expensive");
                    game = scanner.nextLine();
                     continue;
                }
else if(currentBalance >= priceGame) {
                    currentBalance -= priceGame;
                    System.out.printf("Bought %s%n", game);
                }

            } else {
                System.out.println("Not Found");
            }
            if (currentBalance <= 0) {
                System.out.println("Out of money!");
                return;
            }

            game = scanner.nextLine();


        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", balance - currentBalance, currentBalance);
    }
}


class Game {
    private String name;
    private double price;

    public Game(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}

/*

⦁	Gaming Store
Write a program, which helps you buy the games. The valid games are the following games in this table:
Name	                     Price

OutFall 4	                 $39.99
CS: OG	                     $15.99
Zplinter Zell	             $19.99
Honored 2	                 $59.99
RoverWatch	                 $29.99
RoverWatch Origins Edition	 $39.99


On the first line, you will receive your current balance – a floating-point number in the range [0.00…5000.00].
Until you receive the command “Game Time”, you have to keep buying games.
 When a game is bought, the user’s balance decreases by the price of the game.
Additionally, the program should obey the following conditions:
⦁	If a game the user is trying to buy is not present in the table above, print “Not Found” and read the next line.
⦁	If at any point, the user has $0 left, print “Out of money!” and end the program.
⦁	Alternatively, if the user is trying to buy a game which they can’t afford, print “Too Expensive” and read the next line.
When you receive “Game Time”, print the user’s remaining money and total spent on games, rounded to the 2nd decimal place.
Examples
Input
120
RoverWatch
Honored 2
Game Time

Output
Bought RoverWatch
Bought Honored 2
Total spent: $89.98. Remaining: $30.02

Input
19.99
Reimen origin
RoverWatch
Zplinter Zell
Game Time

Output
Not Found
Too Expensive
Bought Zplinter Zell
Out of money!

Input
79.99
OutFall 4
RoverWatch Origins Edition
Game Time

Output
Bought OutFall 4
Bought RoverWatch Origins Edition
Total spent: $79.98. Remaining: $0.01


     */