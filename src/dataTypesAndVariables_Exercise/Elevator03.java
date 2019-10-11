package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elevator03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int people = Integer.parseInt(reader.readLine());
        int capacityElevator = Integer.parseInt(reader.readLine());

        int courses = (int)Math.ceil((double)people / capacityElevator);


        System.out.println(courses);
    }

}
/*⦁	Elevator
Calculate how many courses will be needed to elevate n persons by using an elevator with capacity of p persons.
The input holds two lines: the number of people n and the capacity p of the elevator.
Examples
Input
17
3

Output
6

Comments
5 courses * 3 people
+ 1 course * 2 persons

Input
4
5

Output
1

Comments
All the persons fit inside in the elevator.
Only one course is needed.

Input
10
5

Output
2

Comments
2 courses * 5 people
Hints
⦁	You should divide n by p. This gives you the number of full courses (e.g. 17 / 3 = 5).
⦁	If n does not divide p without a remainder, you will need one additional partially full course (e.g. 17 % 3 = 2).
⦁	Another approach is to round up n / p to the nearest integer (ceiling), e.g. 17/3 = 5.67  rounds up to 6.
⦁	Sample code for the round-up calculation:
 */