package methodsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintingTriangle03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        printLine(n);
    }

    private static void printLine(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*⦁	Printing Triangle
Create a method for printing triangles as shown below:
Examples
Input
3

Output
1
1 2
1 2 3
1 2
1


Input
4

Output
1
1 2
1 2 3
1 2 3 4
1 2 3
1 2
1

Hints
After you read the input
Start by creating a method for printing a single line from a given start to a given end.
Choose a meaningful name for it, describing its purpose:


You will need two loops. In the first loop you can print the first half of the triangle without the middle line:

Next, print the middle line:

Lastly, print the rest of the triangle:
 */