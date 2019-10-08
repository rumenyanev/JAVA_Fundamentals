package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RageExpenses10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        List<Double> gameSet = new ArrayList<>();
        double setPrice = 0;
        for (int i = 1; i < countLostGames + 1; i++) {
            if (i % 12 == 0) {
                gameSet.add(displayPrice);
            }
            if (i % 6 == 0) {
                gameSet.add(keyboardPrice);
            }
            if (i % 3 == 0) {
                gameSet.add(mousePrice);
            }
            if (i % 2 == 0) {
                gameSet.add(headsetPrice);
            }
        }
        //6 5 4 3 2 1
        for (int i = 0; i < gameSet.size(); i++) {
            setPrice += gameSet.get(i);
        }

        /*System.out.println();
        for (int j = gameSet.size(); j >= 0; j--) {
            setPrice += j;
        }*/

        System.out.printf("Rage expenses: %.2f lv.",setPrice);
    }
}
/*Rage Expenses
As a MOBA challenger player, Pesho has the bad habit to trash his PC when he loses a game and rage quits.
 His gaming setup consists of headset, mouse, keyboard and display. You will receive Pesho`s lost games count.
Every second lost game, Pesho trashes his headset.
Every third lost game, Pesho trashes his mouse.
When Pesho trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
Every second time, when he trashes his keyboard, he also trashes his display.
You will receive the price of each item in his gaming setup. Calculate his rage expenses for renewing his gaming equipment.
Input / Constraints
On the first input line - lost games count – integer in the range [0, 1000].
On the second line – headset price - floating point number in range [0, 1000].
On the third line – mouse price - floating point number in range [0, 1000].
On the fourth line – keyboard price - floating point number in range [0, 1000].
On the fifth line – display price - floating point number in range [0, 1000].
Output
As output you must print Pesho`s total expenses: "Rage expenses: {expenses} lv."
Allowed working time / memory: 100ms / 16MB.
Examples
Input
7
2
3
4
5

Output
Rage expenses: 16.00 lv.

Comment
Trashed headset -> 3 times
Trashed mouse -> 2 times
Trashed keyboard -> 1 time
Total: 6 + 6 + 4 = 16.00 lv;


Input
23
12.50
21.50
40
200

Output
Rage expenses: 608.00 lv.
                              */