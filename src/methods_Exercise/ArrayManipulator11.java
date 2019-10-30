package methods_Exercise;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayManipulator11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String []line = reader.readLine().split("\\s+");  // 20/100

        int[]numbers = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }
        String input = "";
        while (!"end".equalsIgnoreCase(input = reader.readLine())){



                String[] data = input.split("\\s+");
                String comand = data[0];

                switch (comand) {
                    case "exchange":
                        exchangeArray(numbers, Integer.parseInt(data[1]));
                        break;
                    case "min":
                        minElementIndex(numbers, data[1]);
                        break;
                    case "max":
                        maxElementIndex(numbers, data[1]);
                        break;
                    case "first":
                        firstCountElement(numbers, Integer.parseInt(data[1]), data[2]);
                        break;
                    case "last":
                        lastCountElement(numbers, Integer.parseInt(data[1]), data[2]);
                        break;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }

        private static void lastCountElement(int[] numbers, int count, String type) {
            if (count < 0 || count > numbers.length) {
                System.out.println("Invalid count");

            }return;
        }

        private static void firstCountElement(int[] numbers, int count, String comand) {
            if (count < 0 || count > numbers.length) {
                System.out.println("Invalid count");
                return;
            }
            int num = comand.equals("even") ? 0 : 1;
            int index = 0;
            int[] result = new int[0];
            for (int number : numbers) {
                if (number % 2 == num) {
                    if (index == result.length) {
                        result = changeArraySize(result);
                    }
                    result[index++] = number;

                }
            }

            if (index == 0) {
                System.out.println("[]");
            } else {
                int minCount = Math.min(count, result.length);
                String output = "[";

                for (int i = 0; i < minCount; i++) {
                    if (i < minCount - 1) {
                        output +=( result[i] + ", ");
                    } else {
                        output += (result[i] + "]");
                    }
                }
                System.out.println(output);
            }
        }

        private static int[] changeArraySize(int[] result) {
            int[] newArray = new int[result.length + 1];
            int count = 0;
            System.arraycopy(result, 0, newArray, 0, result.length);
            return newArray;
        }

        private static void minElementIndex(int[] numbers, String comand) {
            int num = comand.equals("even") ? 0 : 1;

            int minElement = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == num) {
                    if (numbers[i] <= minElement) {
                        minElement = numbers[i];
                        index = i;
                    }
                }
            }
            if (index == -1) {
                System.out.println("No matches");
            } else {
                System.out.println(index);
            }
        }


        private static void maxElementIndex(int[] numbers, String comand) {
            int num = comand.equals("even") ? 0 : 1;

            int maxElement = Integer.MIN_VALUE;
            int index = -1;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == num) {
                    if (numbers[i] >= maxElement) {
                        maxElement = numbers[i];
                        index = i;
                    }
                }
            }
            if (index == -1) {
                System.out.println("No matches");
            } else {
                System.out.println(index);
            }
        }

        private static void exchangeArray(int[] numbers, int index) {
            if (index < 0 || index >= numbers.length) {
                System.out.println("Invalid index");
                return;
            }
            int count = 0;
            int[] result = new int[numbers.length];

            for (int i = index + 1; i < numbers.length; i++) {
                result[count++] = numbers[i];
            }
            for (int i = 0; i <= index; i++) {
                result[count++] = numbers[i];
            }
            System.arraycopy(result, 0, numbers, 0, numbers.length);
    }
}
/*Array Manipulator
 Trifon has finally become a junior developer and has received his first task. It’s about manipulating an array of integers.
 He is not quite happy about it, since he hates manipulating arrays.
 They are going to pay him a lot of money, though, and he is willing to give somebody half of it if to help him do his job.
 You, on the other hand, love arrays (and money) so you decide to try your luck.

 The array may be manipulated by one of the following commands

 exchange {index} – splits the array after the given index, and exchanges the places of the two resulting sub-arrays.
 E.g. [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
 If the index is outside the boundaries of the array, print “Invalid index”
 max even/odd– returns the INDEX of the max even/odd element -> [1, 4, 8, 2, 3] -> max odd -> print 4
 min even/odd – returns the INDEX of the min even/odd element -> [1, 4, 8, 2, 3] -> min even > print 3
 If there are two or more equal min/max elements, return the index of the rightmost one
 If a min/max even/odd element cannot be found, print “No matches”
 first {count} even/odd– returns the first {count} elements -> [1, 8, 2, 3] -> first 2 even -> print [8, 2]
 last {count} even/odd – returns the last {count} elements -> [1, 8, 2, 3] -> last 2 odd -> print [1, 3]
 If the count is greater than the array length, print “Invalid count”
 If there are not enough elements to satisfy the count, print as many as you can. If there are zero even/odd elements, print an empty array “[]”
 end – stop taking input and print the final state of the array
 Input
 The input data should be read from the console.
 On the first line, the initial array is received as a line of integers, separated by a single space
 On the next lines, until the command “end” is received, you will receive the array manipulation commands
 The input data will always be valid and in the format described. There is no need to check it explicitly.
 Output
 The output should be printed on the console.
 On a separate line, print the output of the corresponding command
 On the last line, print the final array in square brackets with its elements separated by a comma and a space
 See the examples below to get a better understanding of your task
 Constraints
 The number of input lines will be in the range [2 … 50].
 The array elements will be integers in the range [0 … 1000].
 The number of elements will be in the range [1 .. 50]
 The split index will be an integer in the range [-231 … 231 – 1]
 first/last count will be an integer in the range [1 … 231 – 1]
 There will not be redundant whitespace anywhere in the input
 Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.
 Examples

 Input
1 3 5 7 9
exchange 1
max odd
min even
first 2 odd
last 2 even
exchange 3
end

 Output
 2
 No matches
 [5, 7]
 []
 [3, 5, 7, 9, 1]


 Input
1 10 100 1000
max even
first 5 even
exchange 10
min odd
exchange 0
max even
min even
end

 Output
 3
 Invalid count
 Invalid index
 0
 2
 0
 [10, 100, 1000, 1]

 Input
1 10 100 1000
exchange 3
first 2 odd
last 4 odd
end

 Output
 [1]
 [1]
 [1, 10, 100, 1000]
                         */