package examsFundamentals.programmingFundamentalsMidExam_2November2019Group1;

import java.util.*;
import java.util.stream.Collectors;

public class WizardPoker03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputCards = Arrays.
                stream(scanner.nextLine().
                        split(":")).
                collect(Collectors.toList());
        String line = scanner.nextLine();

        List<String>cards = new ArrayList<>();

        while (!"Ready".equals(line)) {
            String[] input = line.split("\\s+");
            String command = input[0];
            String card = input[1];
            switch (command) {
                case "Add":

                    if (!inputCards.contains(card)) {
                        System.out.println("Card not found.");

                    }else{
                        cards.add(card);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(input[2]);
                    if (!inputCards.contains(card) ||(index < 0 || index >= cards.size())) {
                        System.out.println("Error!");

                    } else {

                        cards.add(index, card);
                    }
                    break;
                case "Remove":
                    if (!cards.contains(card)) {
                        System.out.println("Card not found.");

                    } else {
                        cards.remove(card);
                    }
                    break;
                case "Swap":
                    String nameCard = input[2];
                    Collections.swap(cards, cards.indexOf(card), cards.indexOf(nameCard));
                    break;
                case "Shuffle":

                    Collections.reverse(cards);
                    break;

            }
            line = scanner.nextLine();
        }
        System.out.println(String.join(" ",cards));
    }
}




/*Problem 3. Wizard Poker

Create a program that adds, inserts, removes and swaps cards in a new deck.
On the first line, you will receive all cards in the form of strings separated by ":".
Until you receive the "Ready" command, you will get commands in the format:

Add {card name}
Adds the card to the end of the deck.
If the card doesn't exist in print "Card not found."

Insert {card name} {index}
Insert the card at the given index of the deck.
If the card doesn't exist or the index is invalid print "Error!"

Remove {card name}
Remove the card from the deck.
If the card doesn't exist in print "Card not found."

Swap {card name 1} {card name 2}
Swap the positions of the cards.

Input will always be valid

Shuffle deck

Reverse the deck

When you receive the "Ready" command print the cards in the deck separated by space.
Input
On the 1st line, you will receive the arsenal of all cards available separated by ":".
On the next lines, until you receive the "Ready" command you will receive commands to arrange your deck.
Output
Print the cards in your deck on a single line, separated by a single space.
Examples

Input
Innervate:Moonfire:Pounce:Claw:Wrath:Bite
Add Moonfire
Add Pounce
Add Bite
Add Wrath
Insert Claw 0
Swap Claw Moonfire
Remove Bite
Shuffle deck
Ready

Output
Wrath Pounce Claw Moonfire


Comments
First command is Add Moofire and now our deck has one card in it.
1. Moonfire Pounce
2. Moonfire Pounce Bite
3. Moonfire Pounce Bite Wrath
4. Claw Moonfire Pounce Bite Wrath
5. Moonfire Claw Pounce Bite Wrath
6. Moonfire Claw Pounce Wrath
7. Wrath Pounce Claw Moonfire


Input
Wrath:Pounce:Lifeweaver:Exodia:Aso:Pop
Add Pop
Add Exodia
Add Aso
Remove Wrath
Add SineokBqlDrakon
Shuffle deck
Insert Pesho 0
Ready

Output
Card not found.
Card not found.
Error!
Aso Exodia Pop
                     */