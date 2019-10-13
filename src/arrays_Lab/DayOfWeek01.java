package arrays_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (number <= 0 || number > 7){
            System.out.println("Invalid day!");
        }else {
            System.out.println(daysOfWeek[number - 1]);
        }
    }
}
/*⦁	Day of Week
Enter a day number [1…7] and print the day name (in English) or "Invalid day!". Use an array of strings.
Examples
Input
1

Output
Monday

Input
2

Output
Tuesday

Input
7

Output
Sunday

Input
0

Output
Invalid day!


Hints
⦁	Use an array of strings holding the day names: {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}.
⦁	Print the element at index (day-1) when it is in the range [1…7] or "Invalid Day!" otherwise.
*/