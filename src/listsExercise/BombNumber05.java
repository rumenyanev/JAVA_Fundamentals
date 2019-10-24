package listsExercise;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumber05 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))   ///75/100 ...???
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int num = scanner.nextInt();
        int power = scanner.nextInt();
        scanner.close();

        int index = numbers.indexOf(num);
        int sum =0;
        while (numbers.contains(num)) {
            int left = Math.max(0, index - power);
            int right = Math.min(index + power, numbers.size() - 1);

            if (right >= left) {
                numbers.subList(left, right + 1).clear();
            }
        }
        sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
/*Bomb Numbers
Write a program that reads sequence of numbers and special bomb number with a certain power.
Your task is to detonate every occurrence of the special bomb number and according to its power his neighbors from left and right.
Detonations are performed from left to right and all detonated numbers disappear.
Finally print the sum of the remaining elements in the sequence.
Examples
Input
1 2 2 4 2 2 2 9
4 2

Output
12

Comments
Special number is 4 with power 2. After detonation we left with the sequence [1, 2, 9] with sum 12.


Input
1 4 4 2 8 9 1
9 3

Output
5

Comments
Special number is 9 with power 3. After detonation we left with the sequence [1, 4] with sum 5. Since the 9 has only 1 neighbor from the right we remove just it (one number instead of 3).

Input
1 7 7 1 2 3
7 1

Output
6

Comments
Detonations are performed from left to right. We could not detonate the second occurrence of 7 because its already destroyed by the first occurrence.
The numbers [1, 2, 3]
survive. Their sum is 6.

Input
1 1 2 1 1 1 2 1 1 1
2 1

Output
4

Comments
The red and yellow numbers disappear in two sequential detonations.
 The result is the sequence [1, 1, 1, 1]. Sum = 4.
*/