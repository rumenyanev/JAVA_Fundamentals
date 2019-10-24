package methodsLab;


import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.printf("%.2f", calculatePrice(product, quantity));


    }

    private static double calculatePrice(String product, int quantity) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        return quantity * price;

    }

}
/*⦁	Orders
Write a method that calculates the total price of an order and prints it on the console.
The method should receive one of the following products: coffee, coke, water, snacks; and a quantity of the product.
 The prices for a single piece of each product are:
⦁	coffee – 1.50
⦁	water – 1.00
⦁	coke – 1.40
⦁	snacks – 2.00
Print the result rounded to the second decimal place
Example

Input
water
5

Output
5.00


Input
coffee
2

Output
3.00

Hint
⦁	Read the first two lines
⦁	Create a method the pass the two variables in
⦁	Print the result in the methods
*/