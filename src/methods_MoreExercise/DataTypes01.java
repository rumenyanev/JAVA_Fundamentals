package methods_MoreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypes01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        String command = reader.readLine();
        String[]line = reader.readLine().split("\\s+");

        dataTypes(command,line);

    }

  private  static void dataTypes(String command,String []str){

        switch (command){
            case "int":
                System.out.println(Integer.parseInt(str[0])*2);

                break;
            case "real":
                System.out.printf("%.2f",Double.parseDouble(str[0])*1.5);

                break;
            case "string":
                System.out.println(String.format("$"+str[0]+"$"));

        }
    }

}
/*Data Types
Write a program that, depending on the first line of the input, reads an int, double or string.
If the data type is int, multiply the number by 2.
If the data type is real, multiply the number by 1.5 and format it to the second decimal point.
If the data type is string, surround the input with "$".
Print the result on the console.
Examples
Input
int
5

Output
10

Input
real
2

Output
3.00

Input
string
hello

Output
$hello$

Hint
Try to solve the problem using only one method with different overloads     */