package arrays_Exercise;

import java.util.Scanner;

public class KaminoFactory09Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sequanceLenght = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        int bestLenght = 0;
        String bestDna = "";
        int bestIndex = 0;
        int bestSum = 0;
        int counter = 0;
        int bestCounter = 0;

        while (!line.equals("Clone them!")){
            counter++;
            String sequence =  line.replaceAll("!+","");

            String[] dna = sequence.split("0+");

            int maxLenght = 0;
            int sum = 0;
            String bestLocalDna = "";


            for (int i = 0; i < dna.length ; i++) {

                if(dna[i].length() > maxLenght){
                    maxLenght = dna[i].length();
                    bestLocalDna = dna[i];

                }
                sum += dna[i].length();
            }
            int beginIndex = sequence.indexOf(bestLocalDna);
            if(maxLenght > bestLenght){
                bestLenght = maxLenght;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCounter = counter;

            }else if(maxLenght == bestLenght && beginIndex
                    < bestIndex || sum > bestSum){
                bestLenght = maxLenght;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCounter = counter;

            }else if(counter == 1){
                bestLenght = maxLenght;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCounter = counter;
            }
            line = scanner.nextLine();

        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.",bestCounter,bestSum));
        for (int i = 0; i <bestDna.length() ; i++) {
            System.out.print(bestDna.charAt(i)+" ");
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
