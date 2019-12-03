package mapsLambdaAndStreamAPI_Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]words = scanner.nextLine().split("\\s+");
        
        LinkedHashMap<String,Integer> inputOccurrences = new LinkedHashMap<>();
        
        for (String word : words) {
          String wordsInLowerCase = word.toLowerCase();
          if(inputOccurrences.containsKey(wordsInLowerCase)){
              inputOccurrences.put(wordsInLowerCase,inputOccurrences.get(wordsInLowerCase)+1);
          }else{
              inputOccurrences.put(wordsInLowerCase,1);
          }
        }
        ArrayList<String>oddOccurrences = new ArrayList<>();
        for (var entry : inputOccurrences.entrySet()) {
            if(entry.getValue() % 2 == 1){
                oddOccurrences.add(entry.getKey());
            }
        }
        for (int i = 0; i < oddOccurrences.size(); i++) {
            System.out.print(oddOccurrences.get(i));
            if(i < oddOccurrences.size()-1){
                System.out.print(", ");
            }
        }
    }
}
/*⦁	Odd Occurrences
Write a program that extracts from a given sequence of words all elements that present in it odd number of times (case-insensitive).
⦁	Words are given in a single line, space separated.
⦁	Print the result elements in lowercase, in their order of appearance.
Examples
Input
Java C# PHP PHP JAVA C java

Output
java, c#, c


Input
3 5 5 hi pi HO Hi 5 ho 3 hi pi


Output
5, hi

Input
a a A SQL xx a xx a A a XX c

Output
a, sql, xx, c


Hints
Read a line from the console and split it by a space

Use a LinkedHashMap (String  int) to count the occurrences of each word

Pass through all elements in the array and count each word.

Create a new ArrayList (String), which will hold all the words with odd occurences.

Now all that is left is to print the words, separated by commas ( , ).


*/