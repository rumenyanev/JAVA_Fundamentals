package lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced05Two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String comand = scanner.nextLine();

        List<Integer> numbers = Arrays.stream(comand.split("\\s+ "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while(!"end".equals(comand)){
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("end")){
                break;
            }
            String [] commandsArr = command.split("\\s+ ");

            switch (commandsArr[0]){
                case "Contains":
                    int toInt = Integer.parseInt(commandsArr[1]);
                    if (numbers.contains(toInt)){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No such number");
                    }
                    break;
                case"Print":
                    print(numbers,commandsArr[1]);
                    break;
                case "Get":
                    System.out.println(getSum(numbers));
                    break;
                case "Filter":
                    int number = Integer.parseInt(commandsArr[2]);
                    filter(commandsArr[1], number , numbers);
                    System.out.println(filter(commandsArr[1], number , numbers));
                    break;
            }
        }
    }

    private static void print (List<Integer> list,String evenOrOdd){
        if(evenOrOdd.equals("even")){
            printEven(list,evenOrOdd);
        }
        else if (evenOrOdd.equals("odd")){
            printOdd(list, evenOrOdd);
        }
    }

    private static void printEven(List<Integer> list, String evenOrOdd){
        String output = "";

        for (Integer num : list) {
            if (num % 2 == 0) {
                output += num + " ";
            }
        }

        System.out.println(output.trim());
    }

    private static void printOdd(List<Integer> list, String evenOrOdd){

        String output = "";

        for (Integer num : list) {
            if (num % 2 != 0) {
                output += num + " ";
            }
        }
        System.out.println(output.trim());
    }

    private static long getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static String filter(String sign, int number , List<Integer> list) {
        String output = "";
        switch (sign){
            case "<":
                for (Integer num : list) {
                    if (num < number) {
                        output += String.valueOf(num) + " ";
                    }
                }

                break;
            case ">":
                for (Integer num : list) {
                    if (num > number) {
                        output += String.valueOf(num) + " ";
                    }
                }
                break;

            case ">=":
                for (Integer num : list) {
                    if (num >= number) {
                        output += String.valueOf(num) + " ";
                    }
                }
                break;

            case "<=":
                for (Integer num : list) {
                    if (num <= number) {
                        output += String.valueOf(num) + " ";
                    }
                }
                break;
        }
        return output.trim();
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
