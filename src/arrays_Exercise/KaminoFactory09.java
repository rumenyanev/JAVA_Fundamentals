package arrays_Exercise;

import java.util.Scanner;

public class KaminoFactory09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine()); // четем число, което определя дължината на масива
        int bestCount = Integer.MIN_VALUE;
        int smallestIndex = Integer.MAX_VALUE;
        int bestSum = Integer.MIN_VALUE;
        int bestIteration = 0;
        String[] bestSequence = new String[n]; // създаваме масив, който ще пълним ( тук пазим най-добрата редица)
        String line = scanner.nextLine(); // първоначално подаваме редицата като стринг за улеснение на while цикъла

        int iter = 0; // тази променлива ще запази итерациите
        while (!line.equalsIgnoreCase("Clone them!")) { // до командата в скобите въртим цикъла
            iter++; // това ще запази интерацията "победител "
            String[] sequence = line.split("!+"); // създаваме масив, който взима линията и преобразува и сплитва
            int sum = 0; // пазиме сумата на елементите
            for (int i = 0; i < n; i++) { // въртим цикъла, за да намерим сбора
                sum += Integer.parseInt(sequence[i]); // тук преобразува стойностите от масива в цели числа
            }

            int countSingles = 0; // променлива, която пази броя съвпадения
            if (n == 1 && sequence[0].equals("1")) { // ако ни подадът масив с един елемент и той е еднакъв с 1
                countSingles++;
                if (countSingles > bestCount) {
                    bestCount = countSingles;
                    smallestIndex = 0;
                    bestSum = sum;
                    bestSequence = sequence;
                    bestIteration = iter;
                }
            }
            for (int i = 0; i < n - 1; i++) { // въртим цикъла до дължината -1, за да не излезнем от масива
                if (sequence[i].equals(sequence[i + 1]) && sequence[i].equals("1")) { // това говори само за себе си
                    countSingles++; // ако имаме повтарящисе единички брояча на единици се увеличава
                    if (countSingles > bestCount) { // ако сегашния брояч на единици е > от най-големия .....
                        bestCount = countSingles; // тогава най-големият = на настоящия броян на единици
                        smallestIndex = i - countSingles; // най- малкия индекс = (сегашния индекс - брояча на единици)
                        bestSum = sum; // най-добрата сума = на  настощата сума
                        bestSequence = sequence; // най-добрата поредица = на на стоящата поредица
                        bestIteration = iter; // най- добрата итерация = на настоящата итерация
                    }

                    if (countSingles == bestCount) { //ако на новата и старата линия единичкики са равни..
                        if (i - countSingles < smallestIndex) { // ако индекса, от който започват единичките < от най-малкия индекс
                            bestCount = countSingles; // тогава най-големият = на настоящия брояч на единици
                            smallestIndex = i - countSingles;//най- малкия индекс = сегашния индекс - брояча на единици
                            bestSum = sum; // най-добрата сума = на  настощата сума
                            bestSequence = sequence; //най-добрата поредица = на на стоящата поредица
                            bestIteration = iter; // най- добрата итерация = на настоящата итерация
                        }
                        if (i - countSingles == smallestIndex) { // Ако ли пък случайно (индекса - брояча на единички) = на най- малкия индекс
                            if (sum > bestSum) { // тогава вече сравняваме сумите на линиите
                                bestCount = countSingles;// тогава най-големият = на настоящия брояч на единици
                                smallestIndex = i - countSingles; // най- малкия индекс = (сегашния индекс - брояча на единици)
                                bestSum = sum; // най-добрата сума = на  настощата сума
                                bestSequence = sequence; // най-добрата поредица = на на стоящата поредица
                                bestIteration = iter; // най- добрата итерация = на настоящата итерация
                            }
                        }
                    }
                } else { // използваме го , когато не влиза в  някое от условията
                    countSingles = 0; // и съответно зануляваме брояча на единички
                }
            }

            line = scanner.nextLine(); // четем нова линия
        }

        if (bestSum == Integer.MIN_VALUE) { // тази проверка служи само ако получим нули (0) като вход
            System.out.println("Best DNA sample 1 with sum: 0.");
            for (int i = 0; i < n ; i++) { // въртим цикъла, за да отпечатаме числата в масива
                System.out.print(0 + " ");
            }
        } else { // в останалите случаи печатаме най-добрата итерация и сумата на елементите
            System.out.printf("Best DNA sample %d with sum: %d.\n", bestIteration, bestSum);
            System.out.println(String.join(" ", bestSequence)); // тук отпечавтаме цялата редица с числа
        }
    }
}


/*Kamino Factory
The clone factory in Kamino got another order to clone troops. But this time you are tasked to find the best DNA sequence to use in the production.
You will receive the DNA length and until you receive the command "Clone them!" you will be receiving a DNA sequences of ones and zeroes, split by "!" (one or several).
You should select the sequence with the longest subsequence of ones. If there are several sequences with same length of subsequence of ones, print the one with the leftmost starting index, if there are several sequences with same length and starting index, select the sequence with the greater sum of its elements.
After you receive the last command "Clone them!" you should print the collected information in the following format:
"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
"{DNA sequence, joined by space}"
Input / Constraints
The first line holds the length of the sequences – integer in range [1…100];
On the next lines until you receive "Clone them!" you will be receiving sequences (at least one) of ones and zeroes, split by "!" (one or several).
 Output
The output should be printed on the console and consists of two lines in the following format:
"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
"{DNA sequence, joined by space}"
 Examples
Input
5
1!0!1!1!0
0!1!1!0!0
Clone them!


Output
Best DNA sample 2 with sum: 2.
0 1 1 0 0

Comments
We receive 2 sequences with same length of subsequence of ones,
but the second is printed, because its subsequence starts at index[1].
Input
4
1!1!0!1
1!0!0!1
1!1!0!0
Clone them!

Output
Best DNA sample 1 with sum: 3.
1 1 0 1

Comments
We receive 3 sequences. Both 1 and 3 have same length of subsequence of ones -> 2,
and both start from index[0], but the first is printed, because its sum is greater.
                                                                                           */


