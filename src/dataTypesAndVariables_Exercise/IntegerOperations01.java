package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerOperations01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int result = ((a + b)/ c)* d;
        System.out.println(result);

    }
}
/*⦁	Integer Operations
Read four integer numbers.
Add first to the second, divide (integer) the sum by the third number and multiply the result by the fourth number. Print the result.
Constraints
⦁	First number will be in the range [-2,147,483,648… 2,147,483,647]
⦁	Second number will be in the range [-2,147,483,648… 2,147,483,647]
⦁	Third number will be in the range [-2,147,483,648… 2,147,483,647]
⦁	Fourth number will be in the range [-2,147,483,648… 2,147,483,647]
Examples
Input
10
20
3
3

Output
30


Input
15
14
2
3


Output
42
            */