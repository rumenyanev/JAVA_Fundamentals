package mapsLambdaAndStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String,Integer> data = new LinkedHashMap<>();

        String input = "";
        while (!"stop".equals(input = scanner.nextLine())) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if(!data.containsKey(input)){
                data.put(input,quantity);
            }else{
                data.put(input,data.get(input)+ quantity);
            }
        }
        scanner.close();
        data.forEach((key,value)-> System.out.println(String.format("%s -> %d",key,value)));
    }
}
/*A Miner Task
You are given a sequence of strings, each on a new line.
Every odd line on the console is representing a resource
(e.g. Gold, Silver, Copper, and so on), and every even – quantity.
Your task is to collect the resources and print them each on a new line.
Print the resources and their quantities in format: {resource} –> {quantity}
The quantities inputs will be in the range [1 … 2 000 000 000]
Examples
Input

Gold
155
Silver
10
Copper
17
stop

Output
Gold -> 155
Silver -> 10
Copper -> 17

Input
gold
155
silver
10
copper
17
gold
15
stop

Output
gold -> 170
silver -> 10
copper -> 17
                          */