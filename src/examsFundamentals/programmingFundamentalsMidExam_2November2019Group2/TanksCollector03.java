package examsFundamentals.programmingFundamentalsMidExam_2November2019Group2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TanksCollector03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");
        List<String> tanks = new ArrayList<>();
        Collections.addAll(tanks, line);

        int numOfCommands = Integer.parseInt(scanner.nextLine());

        while (numOfCommands -- > 0){
            String[] inputTanks = scanner.nextLine().split(", ");
            String command = inputTanks[0];
            switch (command){
                case"Add":
                    String tankToAdd = inputTanks[1];
                    if(!tanks.contains(tankToAdd)) {
                        tanks.add(tankToAdd);
                        System.out.println("Tank successfully bought");
                    } else{
                        System.out.println("Tank is already bought");
                    }
                    break;
                case"Remove":
                    String tankToRemove = inputTanks[1];
                    if(tanks.contains(tankToRemove)){
                        System.out.println("Tank successfully sold");
                        tanks.remove(tankToRemove);
                    }else{
                        System.out.println("Tank not found");
                    }
                    break;
                case"Remove At":
                    int index = Integer.parseInt(inputTanks[1]);
                    if(index>=0 && index<= tanks.size()){
                        System.out.println("Tank successfully sold");
                        tanks.remove(index);
                    }else{
                        System.out.println("Index out of range");
                        continue;
                    }

                    break;
                case"Insert":
                    int indexOfTanks = Integer.parseInt(inputTanks[1]);
                    String nameTank = inputTanks[2];
                    if(indexOfTanks >=0 && indexOfTanks <= tanks.size()){
                        if(!tanks.contains(nameTank)) {
                            tanks.add(indexOfTanks, nameTank);
                            System.out.println("Tank successfully bought");
                            continue;
                        }else {
                            System.out.println("Tank is already bought");
                            continue;
                        }
                    }else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }
        System.out.println(String.join(", ",tanks));
    }
}
/*Problem 3. Tanks Collector

Tom is a world of tanks player and he likes to collect premium tanks.
You will receive a list of Tom's already owned premium vehicles on a single line separated by ", ".
On the next n lines you will receive commands that could be:

Add, {tankName}: Check if he already owns the wanted tank.
If he owns it, print on console:  "Tank is already bought"
If not, print on console:  "Tank successfully bought" and add it to the tank list.

Remove, {tankName}: Check if he owns the tank.
If he owns it print on console:   and remove it from the tank list.
If not print on console: "Tank not found"

Remove At, {index}: Check if the index is in the range of the list.
If not print on console: "Index out of range" and continue.
If it’s in range, remove at the given index and print on console: "Tank successfully sold"

Insert, {index}, {tankName}: Check if the index is in range of the list and check if he already owns the tank.
If not print on console: "Index out of range" and continue.
If it's in range and he doesn't own the tank then add the tank at the given index and print on console:
"Tank successfully bought"
If the tank is in range and he owns it already than print on console:
"Tank is already bought"
After you go through all the commands you need to print the list on a single line separated by ", ".
Input
The first input line will contain the list of already owned tanks.
The second input line  will be  the number of commands – an integer number in range [0…50].
On the next input lines you will be receiving commands.
Output
As output you must print a single line containing the elements of the list, joined by  ", ".
Examples

Input
T-34-85 Rudy, SU-100Y, STG
3
Add, King Tiger(C)
Insert, 2, IS-2M
Remove, T-34-85 Rudy

Output
Tank successfully bought
Tank successfully bought
Tank successfully sold
SU-100Y, IS-2M, STG, King Tiger(C)



Comments
The first command gives the tank list so its splitted and added into the list.
"T-34-85 Rudy, SU-100Y, STG"
The second commands gives the number of commands that will be received.
"3"
The Add command adds the tank to the list after the necessary checks.
"Add, King Tiger(C)" – "Tank successfully bought"
The Insert commands also adds the tank at the given spot after the necessary checks. "Insert, 2, IS-2M" – "Tank successfully bought"
The Remove command is the last one and after the checks the tank is sold.
"Remove, T-34-85 Rudy" – "Tank successfully sold"
After that we print the list on the console.
"SU-100Y, IS-2M, STG, King Tiger(C)"


Input
T 34, T 34 B, T92, AMX 13 57
4
Add, T 34
Remove, AMX CDC
Insert, 10, M60
Remove At, 1

Output
Tank is already bought
Tank not found
Index out of range
Tank successfully sold
T 34, T92, AMX 13 57
*/