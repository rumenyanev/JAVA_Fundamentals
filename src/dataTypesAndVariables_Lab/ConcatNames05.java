package dataTypesAndVariables_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("Duplicates")
public class ConcatNames05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String firstName = reader.readLine();
        String secondName = reader.readLine();
        String delimeter = reader.readLine();


        System.out.printf("%s%s%s",firstName,delimeter,secondName);

    }
}
/*⦁	Concat Names
Read two names and a delimiter. Print the names joined by the delimiter.
Examples
Input

John
Smith
->

Output
John->Smith

Input
Jan
White
<->

Output
Jan<->White

Input
Linda
Terry
=>

Output
Linda=>Terry
                        */