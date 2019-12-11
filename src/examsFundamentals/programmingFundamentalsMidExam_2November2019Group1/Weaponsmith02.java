package examsFundamentals.programmingFundamentalsMidExam_2November2019Group1;

import java.util.*;
import java.util.stream.Collectors;

public class Weaponsmith02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       List<String> weapons = Arrays.stream(scanner.nextLine().split("[|]")).collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!"Done".equals(line)) {
            String[] parts = line.split("\\s+");

            String command = parts[1];
            switch (command) {
                case "Left":
                    int indexLeft = Integer.parseInt(parts[2]);
                    if (indexLeft >= 1 && indexLeft <= weapons.size()) {
                        Collections.swap(weapons, indexLeft, indexLeft - 1);

                    }
                    break;
                case "Right":
                    int indexRight = Integer.parseInt(parts[2]);
                    if (indexRight >= 0 && indexRight < weapons.size() - 1) {
                        Collections.swap(weapons, indexRight, indexRight + 1);

                    }
                    break;
                case "Even":
                    List<String> evenPositions = new ArrayList<>();
                    for (int i = 0; i < weapons.size(); i++) {
                        if (i % 2 == 0) {
                            evenPositions.add(weapons.get(i));
                        }
                    }
                    System.out.println(String.join(" ", evenPositions));
                    break;
                case "Odd":
                    List<String> oddPositions = new ArrayList<>();
                    for (int i = 0; i < weapons.size(); i++) {
                        if (i % 2 != 0) {
                            oddPositions.add(weapons.get(i));
                        }
                    }
                    System.out.println(String.join(" ", oddPositions));
                    break;
            }
            line = scanner.nextLine();
        }
       scanner.close();
        System.out.println("You crafted " + String.join("", weapons) + "!");
    }
}
/*You are a legendary weaponsmith.
Heroes from all over the world come to you for the greatest weapons so they can rid the world of the greatest threats.
In order for you to craft a weapon you need to assemble its particles.
You will receive a line with string particles, separated by "|", representing parts of the name of a weapon.
The particles will be in mixed order and you can align them through the commands,
which you will receive on the next lines, until you receive the "Done" command.
They will come the form of strings, separated by space. There are five supported commands:

"Move Left {index}":
Moves the value at {index} position to the Left, if the index exist and the move is possible.
If movement is not possible, do nothing.

"Move Right {index}":
Moves the value at {index} position to the Right, if the index exists and the move is possible.
If movement is not possible, do nothing.

"Check Even":
Print the elements at even index positions, separated by a single space.

"Check Odd":
Print the elements at odd index positions, separated by a single space.

 After the "Done" command, the weapon name is considered correct and you should print
 the particles in their current order joined together in the following format: "You crafted {WeaponName}!"

Input
On the first line, you will receive parts of the given weapon name in a mixed order separated by "|".
On the next lines, until the "Done" command, you will receive commands in the format described above.
Output
Print the needed output upon the "Done" command as a string.
Output should be in the format "You crafted {Weapon name}!"
Examples

Input
ha|Do|mm|om|er
Move Right 0
Move Left 3
Check Odd
Move Left 2
Move Left 10
Move Left 0
Done

Output
ha mm
You crafted Doomhammer!


Comments
First, we receive the "Move Right 0" command, so we move "ha" one position to the right and we get "Do ha mm om as er".
Then we receive "Move Left 3" -> "Do ha om mm er"
Checking the current state of the array on odd index positons.
 "Move Left 2" -> "Do om ha mm er"
Invalid index, so we do nothing
We can't move the value at zero position to the left, so we do nothing
Lastly, we have to print the collection as one word, so our output is: "You crafted {Weapon name}!"

Input
ri|As|er|hb|ng
Move Left 1
Move Right 2
Move Right 3
Move Left 2
Done

Output
You crafted Ashbringer!

*/