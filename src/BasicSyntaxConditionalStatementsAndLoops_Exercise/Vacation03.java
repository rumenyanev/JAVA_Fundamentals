package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        switch (typeOfGroup) {
            case "Students":

                if ("Friday".equals(dayOfWeek)) {
                    price = 8.45;
                }
                if ("Saturday".equals(dayOfWeek)) {
                    price = 9.80;
                }
                if ("Sunday".equals(dayOfWeek)) {
                    price = 10.46;

                }
                break;
            case "Business":
                if ("Friday".equals(dayOfWeek)) {
                    price = 10.90;
                } else if ("Saturday".equals(dayOfWeek)) {
                    price = 15.60;
                } else if ("Sunday".equals(dayOfWeek)) {
                    price = 16;
                }if(groupOfPeople >= 100){
                    groupOfPeople -=10;
            }

                break;
            case "Regular":
                if ("Friday".equals(dayOfWeek)) {
                    price = 15;
                } else if ("Saturday".equals(dayOfWeek)) {
                    price = 20;
                } else if ("Sunday".equals(dayOfWeek)) {
                    price = 22.50;
                }
                break;
        }

        double totalSum = groupOfPeople * price;
        if ("Students".equals(typeOfGroup) && groupOfPeople >= 30) {
            totalSum = totalSum - totalSum * 0.15;
        }

        if ("Regular".equals(typeOfGroup) && groupOfPeople >= 10 && groupOfPeople <= 20) {
            totalSum -= totalSum * 0.05;
        }

        System.out.printf("Total price: %.2f", totalSum);


    }
}
/*Vacation
You are given a group of people, type of the group, on which day of the week they are going to stay. Based on that information calculate how much they have to pay and print that price on the console. Use the table below. In each cell is the price for a single person. The output should look like that: "Total price: {price}". The price should be formatted to the second decimal point.
	        Friday	Saturday	Sunday
Students	8.45	9.80	    10.46
Business	10.90	15.60	     16
Regular	      15	20	        22.50
There are also discounts based on some conditions:
Students – if the group is bigger than or equal to 30 people you should reduce the total price by 15%
Business – if the group is bigger than or equal to  100 people 10 of them can stay for free.
Regular – if the group is bigger than or equal 10 and less than or equal to 20 reduce the total price by 5%
You should reduce the prices in that EXACT order
Examples
Input
30
Students
Sunday

Output
Total price: 266.73

Input
40
Regular
Saturday

Output
Total price: 800.00
*/