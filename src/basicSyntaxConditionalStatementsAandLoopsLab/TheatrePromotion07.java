package basicSyntaxConditionalStatementsAandLoopsLab;

import java.util.Scanner;

public class TheatrePromotion07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int ageOfPerson = Integer.parseInt(scanner.nextLine());

        int price = 0;
        switch (typeOfDay) {
            case "Weekday":
                if (ageOfPerson >= 0 && ageOfPerson <= 18) {
                    price = 12;

                } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                    price = 18;

                } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                    price = 12;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;
            case "Weekend":
                if (ageOfPerson > 0 && ageOfPerson <= 18) {
                    price = 15;
                } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                    price = 20;
                } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                    price = 15;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;
            case "Holiday":
                if (ageOfPerson > 0 && ageOfPerson <= 18) {
                    price = 5;
                } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                    price = 12;
                } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                    price = 10;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;
            default:
                System.out.println("Error!");
                break;


        }
        System.out.println(price + "$");
    }
}
/*⦁	Theatre Promotions
A theatre is doing a ticket sale, but they need a program to calculate the price of a single ticket. If the given age does not fit one of the categories, you should print "Error!".  You can see the prices in the table below:
Day / Age	0 <= age <= 18	    18 < age <= 64     	64 < age <= 122
Weekday	          12$	              18$	               12$
Weekend	          15$	              20$	               15$
Holiday         	5$              	12$	                10$
Input
The input comes in two lines. On the first line, you will receive the type of day. On the second – the age of the person.
Output
Print the price of the ticket according to the table, or "Error!" if the age is not in the table.
Constraints
⦁	The age will be in the interval [-1000…1000].
⦁	The type of day will always be valid.
Examples
Input			Input	Output		Input	Output		Input	Output
Weekday
42

Output
18$

Input
Holiday
-12

Output
Error!

Input
Holiday
15

Output
5$

Input
Weekend
122
Output
15$

Hints
We need to read two lines. First one will be the type of day. We will convert it to lower case letters with the method "toLowerCase()". After that, we will read the age of the person and declare a variable – price, which we will use to set the price of the ticket.

For every type of day, we will need to add different cases to check the age of the person and set the price. Some of the age groups have equal prices for the same type of day. This means we can use logical operators to merge some of the conditions.

Think where and how you can use logical operators for the other cases.
We can check if the price has a value different, than the initial one. It it does, that means we got a valid combination of day and age and the price of the ticket is saved in the price variable. If the price has a value of 0, then none of the cases got hit, therefore we have to print the error message.

*/