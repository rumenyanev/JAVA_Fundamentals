package mapsLambdaAndStreamAPI_Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String,Integer>keyItems = new HashMap<>();
        TreeMap<String,Integer>junk = new TreeMap<>();

        keyItems.put("shards", 0);
        keyItems.put("fragments", 0);
        keyItems.put("motes", 0);

        boolean isObteined = false;

        while (!isObteined){
            String[] materials = scanner.nextLine().split("\\s+");
            for (int i = 0; i < materials.length - 1; i+= 2) {
                int quantity = Integer.parseInt(materials[i]);
                String item = materials[i + 1].toLowerCase();

                if (item.equals("shards") || item.equals("fragments") || item.equals("motes")){
                    keyItems.put(item,keyItems.get(item)+ quantity);
                    if(keyItems.get(item) >= 250){
                        keyItems.put(item, keyItems.get(item) - 250);

                        if (item.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (item.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isObteined=true;
                        break;
                    }
                } else {
                    if (!junk.containsKey(item)) {
                        junk.put(item, quantity);
                    } else {
                        junk.put(item, junk.get(item) + quantity);
                    }
                }

            }

        }
        scanner.close();

        keyItems.entrySet().stream().sorted
                (Map.Entry.<String,Integer>comparingByValue().reversed().
                        thenComparing(Map.Entry.comparingByKey())).forEach(el->{
            System.out.println(String.format("%s: %d",el.getKey(),el.getValue()));
        });
        junk.forEach((key,value)->{
            System.out.println(String.format("%s: %d",key,value));
        });
    }
}



/*Legendary Farming
You’ve beaten all the content and the last thing left to accomplish is own a legendary item.
However, it’s a tedious process and requires quite a bit of farming.
Anyway, you are not too pretentious – any legendary will do.
The possible items are:
Shadowmourne – requires 250 Shards;
Valanyr – requires 250 Fragments;
Dragonwrath – requires 250 Motes;
Shards, Fragments and Motes are the key materials, all else is junk.
You will be given lines of input, such as 2 motes 3 ores 15 stones.
Keep track of the key materials - the first that reaches the 250 mark wins the race.
At that point, print the corresponding legendary obtained.
Then, print the remaining shards, fragments, motes, ordered by quantity in descending order,
then by name in ascending order, each on a new line.
Finally, print the collected junk items, in alphabetical order.
Input
Each line of input is in format {quantity} {material} {quantity} {material} … {quantity} {material}
Output
On the first line, print the obtained item in format {Legendary item} obtained!
On the next three lines, print the remaining key materials in descending order by quantity
If two key materials have the same quantity, print them in alphabetical order
On the final several lines, print the junk items in alphabetical order
All materials are printed in format {material}: {quantity}
All output should be lowercase, except the first letter of the legendary
Examples

Input
3 Motes 5 stones 5 Shards
6 leathers 255 fragments 7 Shards

Output
Valanyr obtained!
fragments: 5
shards: 5
motes: 3
leathers: 6
stones: 5

Input
123 silver 6 shards 8 shards 5 motes
9 fangs 75 motes 103 MOTES 8 Shards
86 Motes 7 stones 19 silver

Output
Dragonwrath obtained!
shards: 22
motes: 19
fragments: 0
fangs: 9
silver: 123

                  */