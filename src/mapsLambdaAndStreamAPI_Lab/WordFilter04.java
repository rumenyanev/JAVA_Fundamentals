package mapsLambdaAndStreamAPI_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]words = scanner.nextLine().split("\\s+");

        List<String> evenLenght = new ArrayList<>() ;
        for (int i = 0; i < words.length ; i++) {
            if(words[i].length()%2 == 0){
                evenLenght.add(words[i]);
            }
        }
        String result = "";
        for (int i = 0; i <evenLenght.size() ; i++) {
           result = evenLenght.get(i);
            System.out.println(result);
        }

    }
}
/*⦁	Word Filter
Read an array of strings, take only words which length is even.
Print each word on a new line.

Examples
Input
kiwi orange banana apple


Output
kiwi
orange
banana

Input
pizza cake pasta chips

Output
cake


⦁	Read an array of strings
⦁	Filter those whose length is even

⦁	Print each word on a new line
*/