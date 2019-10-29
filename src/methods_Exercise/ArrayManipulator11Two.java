package methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator11Two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = "";

        while (!"end".equals(input = scanner.nextLine())) {

            String[] command = input.split("\\s+");

            if ("exchange".equals(command[0])) {
                numbers = exchange(numbers, command[1]);

            } else if ("max".equals(command[0])) {

                if ("even".equals(command[1])) {
                    maxEven(numbers);

                } else if ("odd".equals(command[1])) {
                    maxOdd(numbers);
                }

            } else if ("min".equals(command[0])) {

                if ("even".equals(command[1])) {
                    minEven(numbers);
                } else if ("odd".equals(command[1])) {
                    minOdd(numbers);
                }

            } else if ("first".equals(command[0])) {
                firstCountElements(numbers, Integer.parseInt(command[1]), command[2]);

            } else  if ("last".equals(command[0])) {
                lastCountElements(numbers, Integer.parseInt(command[1]), command[2]);
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void lastCountElements(int[] numbers, int count, String command) {
        if (count < 0 || count > numbers.length) {
            System.out.println("Invalid count");
            return;
        }

        int num = command.equals("even") ? 0 : 1;

        int index = 0;
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] % 2 == num) {
                result[index++] = numbers[i];
            }
        }

        if (index == 0) {
            System.out.println("[]");

        } else {
            int startIndex = index - count;
            if (startIndex < 0) {
                startIndex = 0;
            }
            String output = "[";
            for (int i = startIndex; i < index ; i++) {

                if (i < index - 1) {
                    output += result[i] + ", ";
                } else {
                    output += result[i] + "]";
                }
            }
            System.out.println(output);
        }
    }

    private static void minOdd(int[] numbers) {
        int minOdd = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0 && numbers[i] <= minOdd) {
                minOdd = numbers[i];
                minIndex = i;
            }
        }

        if (minIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(minIndex);
        }
    }

    private static void minEven(int[] numbers) {
        int minEven = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0 && numbers[i] <= minEven) {
                minEven = numbers[i];
                minIndex = i;
            }
        }

        if (minIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(minIndex);
        }
    }

    private static void maxOdd(int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < numbers.length ; i++) {

            if (numbers[i] % 2 != 0 && numbers[i] >= maxOdd ) {
                maxOdd = numbers[i];
                maxIndex = i;
            }
        }
        if (maxIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(maxIndex);
        }
    }

    private static void maxEven(int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < numbers.length ; i++) {

            if (numbers[i] % 2 == 0 && numbers[i] >= maxEven ) {
                maxEven = numbers[i];
                maxIndex = i;
            }
        }

        if (maxIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(maxIndex);
        }
    }

    private static int[] exchange(int[] numbers, String s) {
        int index = Integer.parseInt(s);

        if (index < 0 || index >= numbers.length) {
            System.out.println("Invalid index");
        } else {
            int count = 0;
            int [] result = new int[numbers.length];

            for (int i = index + 1; i < numbers.length ; i++) {
                result[count++] = numbers[i];
            }
            for (int i = 0; i <= index ; i++) {
                result[count++] = numbers[i];
            }
            numbers = result;
        }
        return numbers;
    }

    private static void firstCountElements(int[] numbers, int count, String command) {
        if (count < 0 || count > numbers.length) {
            System.out.println("Invalid count");
            return;
        }

        int num = command.equals("even") ? 0 : 1;

        int index = 0;
        int[] result = new int[numbers.length];

        for (int number : numbers) {

            if (number % 2 == num) {
                result[index++] = number;

                if (index == count) {
                    break;
                }
            }
        }

        if (index == 0) {
            System.out.println("[]");

        } else {
            StringBuilder output = new StringBuilder();
            output.append("[");
            for (int i = 0; i < index ; i++) {

                if (i < index - 1) {
                    output.append(result[i]).append(", ");
                } else {
                    output.append(result[i]).append("]");
                }
            }
            System.out.println(output);
        }
    }
}
/*11. *Array Manipulator
Trifon has finally become a junior developer and has received his first task. It’s about manipulating an array of
integers. He is not quite happy about it, since he hates manipulating arrays. They are going to pay him a lot of
money, though, and he is willing to give somebody half of it if to help him do his job. You, on the other hand, love
arrays (and money) so you decide to try your luck.
The array may be manipulated by one of the following commands
 exchange {index} – splits the array after the given index, and exchanges the places of the two resulting sub-
arrays. E.g. [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
o If the index is outside the boundaries of the array, print “Invalid index”
 max even/odd– returns the INDEX of the max even/odd element -> [1, 4, 8, 2, 3] -> max odd -> print 4
 min even/odd – returns the INDEX of the min even/odd element -> [1, 4, 8, 2, 3] -> min even -> print 3
o If there are two or more equal min/max elements, return the index of the rightmost one
o If a min/max even/odd element cannot be found, print “No matches”
 first {count} even/odd– returns the first {count} elements -> [1, 8, 2, 3] -> first 2 even -> print [8, 2]
 last {count} even/odd – returns the last {count} elements -> [1, 8, 2, 3] -> last 2 odd -> print [1, 3]
o If the count is greater than the array length, print “Invalid count”
o If there are not enough elements to satisfy the count, print as many as you can. If there are zero
even/odd elements, print an empty array “[]”
 end – stop taking input and print the final state of the array
Input
 The input data should be read from the console.
 On the first line, the initial array is received as a line of integers, separated by a single space
 On the next lines, until the command “end” is received, you will receive the array manipulation commands
 The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
 The output should be printed on the console.
 On a separate line, print the output of the corresponding command
 On the last line, print the final array in square brackets with its elements separated by a comma and a space
 See the examples below to get a better understanding of your task


Constraints
 The number of input lines will be in the range [2 … 50].
 The array elements will be integers in the range [0 … 1000].
 The number of elements will be in the range [1 .. 50]
 The split index will be an integer in the range [-2 31 … 2 31 – 1]
 first/last count will be an integer in the range [1 … 2 31 – 1]
 There will not be redundant whitespace anywhere in the input
 Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.
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
[5,7]
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


    Trifon най-накрая стана младши разработчик и получи първата си задача. Става дума за манипулиране на масив от
числа. Той не е много щастлив, защото мрази манипулирането на масиви. Ще му платят много
пари, но той е готов да даде на някого половината, ако му помогне да си върши работата. Ти, от друга страна, обичаш
масиви (и пари), за да решите да опитате късмета си.
Масивът може да бъде манипулиран от една от следните команди
 exchange {index} - разделя масива след дадения индекс и разменя местата на двата получени под-
масиви. Например [1, 2, 3, 4, 5] -> обмен 2 -> резултат: [4, 5, 1, 2, 3]
o Ако индексът е извън границите на масива, отпечатайте „Невалиден индекс“
 max even / odd– връща INDEX на максималния четен / нечетен елемент -> [1, 4, 8, 2, 3] -> max odd -> print 4
 min even / odd - връща INDEX на минималния четен / нечетен елемент -> [1, 4, 8, 2, 3] -> min even -> print 3
o Ако има два или повече равни елемента min / max, върнете индекса на най-дясната
o Ако не може да бъде намерен мин. / макс.
 first {count} even / odd - връща първите {count} елементи -> [1, 8, 2, 3] -> първите 2 дори -> печат [8, 2]
 last {count} even / odd - връща последните {count} елементи -> [1, 8, 2, 3] -> последни 2 нечетни -> печат [1, 3]
o Ако броят е по-голям от дължината на масива, отпечатайте „Невалиден брой“
o Ако няма достатъчно елементи, за да задоволи броя, отпечатайте колкото можете. Ако има нула
четни / нечетни елементи, отпечатайте празен масив “[]”
 end - прекратяване на приемането и отпечатване на крайното състояние на масива
Вход
 Входните данни трябва да се четат от конзолата.
 В първия ред първоначалният масив се получава като линия от цели числа, разделени от едно пространство
 На следващите редове, докато бъде получена командата "end", ще получите командите за манипулиране на масив
 Входните данни винаги ще бъдат валидни и в описания формат. Няма нужда да я проверявате изрично.
продукция
 Изходът трябва да бъде отпечатан на конзолата.
 На отделен ред отпечатайте изхода на съответната команда
 В последния ред, отпечатайте крайния масив в квадратни скоби, чиито елементи са разделени със запетая и интервал
 Вижте примерите по-долу, за да разберете по-добре задачата си


Ограничения
 Броят на входните линии ще бъде в диапазона [2… 50].
 Елементите на масива ще бъдат цели числа в диапазона [0… 1000].
 Броят на елементите ще бъде в диапазона [1 .. 50]
 Индексът на разделяне ще бъде цяло число в диапазона [-2 31… 2 31 - 1]
 първият / последният брой ще бъде цяло число в диапазона [1… 2 31 - 1]
 Никъде във входа няма да има излишно празно пространство
 Позволено работно време за вашата програма: 0.1 секунди. Позволена памет: 16 MB.
Примери

Вход                                изход
1 3 5 7 9                           2
exchange 1                         Няма съвпадения
макс. коефициент                   [5,7]
min дори                           []
първите 2 нечетни                  [3, 5, 7, 9, 1]
последните 2 дори
обмен 3
край


Вход                                изход
1 10 100 1000                        3
max дори                           невалиден брой
първите 5 дори                     невалиден индекс
обмен 10                              0
min odd                               2
обмен 0                               0
макс дори                           [10, 100, 1000, 1]
мин дори
край


Вход                                 изход
1 10 100 1000                         [1]
обмен 3                               [1]
първите 2 нечетни                    [1, 10, 100, 1000]
последните 4 нечетни
   край */



