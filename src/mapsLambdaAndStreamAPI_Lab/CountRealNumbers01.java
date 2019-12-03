package mapsLambdaAndStreamAPI_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[]nums = Arrays.stream(scanner.nextLine().
                split("\\s+")).
                mapToDouble(Double::parseDouble).
                toArray();
        TreeMap<Double,Integer>counts = new TreeMap<>();

        for (double num : nums) {
            if (!counts.containsKey(num)){
                counts.put(num,0);
            }
            counts.put(num,counts.get(num)+1);
        }
        for(Map.Entry<Double,Integer> entry : counts.entrySet()){
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n",df.format(entry.getKey()),entry.getValue());
        }

    }
}
/*⦁	Count Real Numbers
Read a list of real numbers and print them in ascending order along with their number of occurrences.
Examples
Input
8 2 2 8 2

Output
2 -> 3
8 -> 2

Input
1 5 1 3

Output
1 -> 2
3 -> 1
5 -> 1

Input
-2 0 0 2

Output
-2 -> 1
0 -> 2
2 -> 1


Solution
Read an array of real numbers (double).

Use TreeMap<Double, Integer> named counts.

Pass through each input number num and increase counts (when num exists in the map) or add it with value 1.

Pass through all numbers num in the map and print the number and its count of occurrences after formatting it to a decimal place without trailing zeros (otherwise the output will have too much decimal places, e.g. 2.500000 instead of 2.5);

*/