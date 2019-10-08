package basicSyntaxConditionalStatementsAndLoops_MoreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortNumbers01Two {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());


        if (a >= b && a >= c) {
            System.out.println(a);
            if (b >= c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b >= a && b >= c) {
            System.out.println(b);
            if (a >= c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            System.out.println(c);
            if (b >= a) {
                System.out.println(b);
                System.out.println(a);
            } else {
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
}
/*Sort Numbers
 Read three real numbers and sort them in descending order. Print each number on a new line.
Examples
Input
2
1
3

Output
3
2
1

Input
-2
1
3

Output
3
1
-2


Input
0
0
2

Output
2
0
0
            */