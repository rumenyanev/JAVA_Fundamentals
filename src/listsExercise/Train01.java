package listsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Train01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        List<Integer> train = new ArrayList<>();

        for (String s : input) {
            train.add(Integer.parseInt(s));
        }
            int maxCapacity = Integer.parseInt(reader.readLine());
            String line = reader.readLine();
            while (!"end".equalsIgnoreCase(line)) {
                String[] data = line.split("\\s+");
                if (data[0].equals("Add")) {
                    int travellers = Integer.parseInt(data[1]);
                    train.add(travellers);
                } else {
                    int travellers = Integer.parseInt(data[0]);
                    for (int i = 0; i < train.size(); i++) {
                        int currentTravellers = train.get(i);
                        if (currentTravellers + travellers <= maxCapacity) {
                            train.set(i, currentTravellers + travellers);
                            break;
                        }
                    }
                }
                line = reader.readLine();
            }

            System.out.println();
            System.out.print(train.toString().replaceAll("[\\[,\\]]",""));

    }
}
/*Train
On the first line you will be given a list of wagons (integers).
Each integer represents the number of passengers that are currently in each wagon.
On the next line you will get the max capacity of each wagon (single integer).
 Until you receive "end" you will be given two types of input:
Add {passengers} – add a wagon to the end with the given number of passengers.
{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
At the end print the final state of the train (all the wagons separated by a space)
Example
Input
32 54 21 12 4 0 23
75
Add 10
Add 0
30
10
75
end

Output
72 54 21 12 4 75 23 10 0

Input
0 0 0 10 2 4
10
Add 10
10
10
10
8
6
end

Output
10 10 10 10 10 10 10
                              */