package lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class ListManipulationAdvanced05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] tokens = line.split("\\s+");
            String comand = tokens[0];
            switch (comand) {
                case "Contains":
                    int element = Integer.parseInt(tokens[1]);
                    if (numbers.contains(element)) {
                        System.out.print("Yes");
                    } else {
                        System.out.print("No such number");
                    }
                    break;
                case "Print":
                    String parity = tokens[1];
                    if (parity.equals("even")) {
                        numbers.stream().filter(n -> n % 2 == 0).forEach(e -> System.out.print(e + " "));
                    } else {
                        numbers.stream().filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));
                    }
                    break;
                case "Get":
                    numbers.stream().reduce((e1, e2) -> e1 + e2).ifPresent(System.out::print);
                    break;
                case "Filter":
                    String condition = tokens[1];
                    int num = Integer.parseInt( tokens[2]);
                    if(condition.equals("<")){
                        numbers.stream().filter(e -> e < num).forEach(e -> System.out.print(e + " "));
                    }else if(condition.equals(">")){
                        numbers.stream().filter(e -> e > num).forEach(e -> System.out.print(e + " "));
                    }else if(condition.equals("<=")){
                        numbers.stream().filter(e -> e <= num).forEach(e -> System.out.print(e + " "));
                    }else if(condition.equals(">=")) {
                        numbers.stream().filter(e -> e >= num).forEach(e -> System.out.print(e + " "));
                    }
                    break;
                default:
                    break;
            }
            System.out.println();
            line = scanner.nextLine();
        }
    }
}
/*⦁	List Manipulation Advanced
Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
Contains {number} – check if the list contains the number. If yes print "Yes", otherwise print "No such number"
Print even – print all the numbers that are even separated by a space
Print odd – print all the numbers that are odd separated by a space
Get sum – print the sum of all the numbers
Filter ({condition} {number}) – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="
Example

Input
2 13 43 876 342 23 543
Contains 100
Contains 543
Print even
Print odd
Get sum
Filter >= 43
Filter < 100
end

Output
No such number
Yes
2 876 342
13 43 23 543
1842
43 876 342 543
2 13 43 23
                   */
