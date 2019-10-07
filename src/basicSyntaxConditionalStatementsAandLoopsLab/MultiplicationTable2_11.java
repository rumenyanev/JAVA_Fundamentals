package basicSyntaxConditionalStatementsAandLoopsLab;

import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        int result = 0;
        if(multiplier <=10){
        for (int i = multiplier; i <= 10 ; i++) {
            result = n * i;
            System.out.printf("%d X %d = %d%n", n, i, result);
        }
        }else {
            result = n * multiplier;
            System.out.printf("%d X %d = %d%n", n, multiplier, result);
        }
    }
}
/*⦁	Multiplication Table 2.0
Rewrite you program so it can receive the multiplier from the console. Print the table from the given multiplier to 10. If the given multiplier is more than 10 - print only one row with the integer, the given multiplier and the product. See the examples below for more information.
Output
Print every row of the table in the following format:
{theInteger} X {times} = {product}
Constraints
⦁	The integer will be in the interval [1…100]
Examples
Input
5
1

Output
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
5 X 8 = 40
5 X 9 = 45
5 X 10 = 50

Input
2
5

Output
2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18
2 X 10 = 20

Input
2
14

v
2 X 14 = 28

    */