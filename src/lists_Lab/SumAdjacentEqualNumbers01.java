package lists_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class SumAdjacentEqualNumbers01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
    
        String[]numbers = reader.readLine().split("\\s+");

        List<Double> elements = new ArrayList<>();
        for (String number:numbers) {
            elements.add(Double.parseDouble(number));
        }
        for (int i = 0; i <elements.size()-1 ; i++) {
            double firstNum = elements.get(i);
            double secondNum = elements.get(i + 1);
            if(firstNum == secondNum){
                double sum = firstNum + secondNum;
                elements.set(i,sum);
                elements.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(concatListElement(elements));

    }
   private static String concatListElement(List<Double>list){
        StringBuilder result = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.####");
        for (Double num : list) {
            result.append(df.format(num)).append(" ");
        }
        return result.toString().trim();
    }
}
/*⦁	Sum Adjacent Equal Numbers
Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.
⦁	After two numbers are summed, the obtained result could be equal to some of its neighbors and should be summed as well (see the examples below).
⦁	Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).
Examples
Input
3 3 6 1

Output
12 1

Explanation
3 3 6 1 -> 6 6 1 -> 12 1

Input
8 2 2 4 8 16

Output
16 8 16

Explanation
8 2 2 4 8 16 -> 8 4 4 8 16 -> 8 8 8 16 -> 16 8 16

Input
5 4 2 1 1 4

Output
5 8 4

Explanation
5 4 2 1 1 4 -> 5 4 2 2 4 -> 5 4 4 4 -> 5 8 4

Input
0.1 0.1 5 -5

Output
0.2 5 -5

Explanation
0.1 0.1 5 -5 -> 0.2 5 -5

*/