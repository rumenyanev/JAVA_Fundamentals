package mapsLambdaAndStreamAPI_Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();

        while (n -- >0){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            words.putIfAbsent(word,new ArrayList<>());
            words.get(word).add(synonym);
        }
        String patern = "%s - %s";
        for (Map.Entry<String,ArrayList<String>> result: words.entrySet()) {
           String key = result.getKey();
            String value = String.join(", ", result.getValue());

            System.out.println(String.format(patern, key, value));
        }

    }

}
/*⦁	Word Synonyms
Write a program which keeps a map with synonyms.
The key of the map will be the word.
The value will be a list of all the synonyms of that word.
You will be given a number n. On the next 2 * n lines you will be given a word and a synonym each on a separate line like this:
⦁	{word}
⦁	{synonym}
If you get the same word for second time, just add the new synonym to the list.
Print the words in the following format:
{word} - {synonym1, synonym2… synonymN}
Examples

Input
3
cute
adorable
cute
charming
smart
clever


Output
cute - adorable, charming
smart - clever


Input
2
task
problem
task
assignment

Output
task – problem, assignment


Hints
⦁	Use LinkedHashMap (String -> ArrayList<String>) to keep track of all words

⦁	Read n * 2 lines
⦁	Add the word in the Map if it is not present
⦁	Add the synonym as value to the given word

⦁	Print each word with the synonyms in the required format
⦁	Odd Occurrences
Write a program that extracts from a given sequence of words all elements that present in it odd number of times (case-insensitive).
⦁	Words are given in a single line, space separated.
⦁	Print each word with the synonyms in the required format
           */
