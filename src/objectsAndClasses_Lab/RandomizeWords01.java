package objectsAndClasses_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        while (!words.isEmpty()){
            Random random = new Random();
            int randomIndex = random.nextInt(words.size());
            String word = words.get(randomIndex);
            System.out.println(word);
            words.remove(randomIndex);
        }

    }
}
/*⦁	Randomize Words
You are given a list of words in one line. Randomize their order and print each word at a separate line.
Examples

Input
Welcome to SoftUni and have fun learning programming

Output
learning
Welcome
SoftUni
and
fun
programming
have
to


Comments
The order of the words in the output will be different after each program execution.
Hints
⦁	Split the input string by (space) and create an array of words.
⦁	Create a random number generator – an object rnd of type Random.
⦁	In a for-loop exchange each number at positions 0, 1, … words.Length-1 by a number at random position. To generate a random number in range use rnd.nextInt(words.length).
⦁	Print each word in the array on new line.
*/