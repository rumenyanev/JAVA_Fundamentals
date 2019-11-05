package lists_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergingLists03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        List<String>firstList = Arrays.stream(reader.readLine().
                split("\\s+")).
                collect(Collectors.toList());
        List<String>secondList = Arrays.stream(reader.readLine().
                split("\\s+")).
                collect(Collectors.toList());

        List<String>thirdList = new ArrayList<>();

        int minLenght = Math.min(firstList.size(),secondList.size());

        for (int i = 0; i <minLenght ; i++) {
           thirdList.add(firstList.get(i));
           thirdList.add(secondList.get(i));
            }

        if (firstList.size() > secondList.size()){
            thirdList.addAll(firstList.subList(minLenght,firstList.size()));
        }
        else {
            thirdList.addAll(secondList.subList(minLenght,secondList.size()));
        }
        System.out.println(thirdList.toString().replaceAll("\\[|,|\\]",""));
        }

    }

/*⦁	Merging Lists
You are going to receive two lists with numbers. Create a result list which contains the numbers from both of the lists.
The first element should be from the first list, the second from the second list and so on.
If the length of the two lists are not equal, just add the remaining elements at the end of the list.
Example
Input
3 5 2 43 12 3 54 10 23
76 5 34 2 4 12

Output
3 76 5 5 2 34 43 2 12 4 3 12 54 10 23

Input
76 5 34 2 4 12
3 5 2 43 12 3 54 10 23

Output
76 3 5 5 34 2 2 43 4 12 12 3 54 10 23
Hint
⦁	Read the two lists
⦁	Create a result list
⦁	Start looping through them until you reach the end of the smallest one
⦁	Finally add the remaining elements (if any) to the end of the list
*/