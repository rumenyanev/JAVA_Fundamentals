package lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!"end".equals(command)){

            String[]token = command.split("\\s+");

            switch (token[0]){
                case"Add":
                    int numAdded = Integer.parseInt(token[1]);
                    numbers.add(numAdded);
                    break;
                case "Remove":
                    int numRemuved =  Integer.parseInt(token[1]);
                    numbers.remove((Object)numRemuved);

                    break;
                case"RemoveAt":
                    int indexRemuvedAt = Integer.parseInt(token[1]);
                    numbers.remove(indexRemuvedAt);
                    break;
                case "Insert":
                    int numInsert = Integer.parseInt(token[1]);
                    int indexToInsert = Integer.parseInt(token[2]);
                    numbers.add(indexToInsert,numInsert);
                    break;

            }
            command = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}

/*⦁	List Manipulation Basics
Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
Add {number}: add a number to the end of the list
Remove {number}: remove number from the list
RemoveAt {index}: removes number at a given index
Insert {number} {index}: inserts a number at a given index
Note: All the indices will be valid!
When you receive the "end" command print the final state of the list (separated by spaces)
Example

Input
4 19 2 53 6 43
Add 3
Remove 2
RemoveAt 1
Insert 8 3
end

Output
4 53 6 8 43 3
                      */