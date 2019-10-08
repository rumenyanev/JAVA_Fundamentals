package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class RageExpenses10Two {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int lostGame = Integer.parseInt(scanner.nextLine());
            double headsetPrice = Double.parseDouble(scanner.nextLine());
            double  mousePrice = Double.parseDouble(scanner.nextLine());
            double keyboardPrice = Double.parseDouble(scanner.nextLine());
            double displayPrice = Double.parseDouble(scanner.nextLine());

            int newHeadset = lostGame / 2;
            int newMouse = lostGame / 3;
            int newKeyboards = lostGame / 6;
            int newDisplay = lostGame / 12;
            double expenses =
                    headsetPrice * newHeadset + mousePrice * newMouse + keyboardPrice * newKeyboards + displayPrice *newDisplay;
            System.out.printf("Rage expenses: %.2f lv.",expenses);
        }
    }
/*
Integer sum = integers.stream()
  .reduce(0, (a, b) -> a + b);
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