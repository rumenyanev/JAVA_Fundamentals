package mapsLambdaAndStreamAPI_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ForceBook09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputData = reader.readLine();

        TreeMap<String, List<String>> forceBook = new TreeMap<>();


        while (!inputData.equals("Lumpawaroo")) {
            String[] command;
            String symbol = "";

            if (inputData.contains("|")) {
                command = inputData.split("\\s+\\|\\s+");
                symbol = "|";
            } else {
                command = inputData.split("\\s+->\\s+");
                symbol = "->";
            }

            switch (symbol) {
                case "|":
                    String side = command[0];
                    String user = command[1];

                    boolean isChecking = false;

                    for (Map.Entry<String, List<String>> current : forceBook.entrySet()) {
                        if (current.getValue().contains(user)) {
                            isChecking = true;
                            break;
                        }
                    }

                    if (!isChecking) {
                        if (!forceBook.containsKey(side)) {
                            forceBook.put(side, new ArrayList<>());
                            forceBook.get(side).add(user);
                        } else if (forceBook.containsKey(side) && !forceBook.get(side).contains(user)) {
                            forceBook.get(side).add(user);
                        }
                    }

                    break;

                case "->":
                    String player = command[0];
                    String playerSide = command[1];

                    for (Map.Entry<String, List<String>> current : forceBook.entrySet()) {
                        if (current.getValue().contains(player)) {
                            forceBook.get(current.getKey()).remove(player);
                            break;
                        }
                    }

                    if (!forceBook.containsKey(playerSide)) {
                        forceBook.put(playerSide, new ArrayList<>());
                        forceBook.get(playerSide).add(player);
                        System.out.printf("%s joins the %s side!%n", player, playerSide);
                    } else if (forceBook.containsKey(playerSide) && !forceBook.get(playerSide).contains(player)) {
                        forceBook.get(playerSide).add(player);
                        System.out.printf("%s joins the %s side!%n", player, playerSide);
                    }

                    break;

                default:
                    break;
            }

            inputData = reader.readLine();
        }
        reader.close();
        forceBook
                .entrySet()
                .stream()
                .filter(player -> player.getValue().size() > 0)
                .sorted(Map.Entry.<String, List<String>>comparingByValue(Comparator.comparing(List::size)).reversed())
                .forEach(pl -> {
                    System.out.printf("Side: %s, Members: %d%n", pl.getKey(), pl.getValue().size());

                    pl.getValue()
                            .stream()
                            .sorted(String::compareTo)
                            .forEach(element -> System.out.printf("! %s%n", element));
                });
    }
}
/*ForceBook
The force player are struggling to remember which side are the different forceplayer from,
because they switch them too often. So you are tasked to create a web application to manage their profiles.
You should store information for every unique forceUser, registered in the application.
You will receive several input lines in one of the following formats:
{forceSide} | {forceUser}
{forceUser} -> {forceSide}
The forceUser and forceSide are strings, containing any character.
If you receive forceSide | forceUser you should check if such forceUser already exists, and if not, add him/her to the corresponding side.
If you receive a forceUser -> forceSide you should check if there is such forceUser already and if so, change his/her side.
If there is no such forceUser, add him/her to the corresponding forceSide, treating the command as new registered forceUser.
Then you should print on the console: "{forceUser} joins the {forceSide} side!"
You should end your program when you receive the command "Lumpawaroo". At that point you should print each force side,
ordered descending by forceplayer count, than ordered by name. For each side print the forceplayer, ordered by name.
In case there are no forceplayer in a side, you shouldn`t print the side information.
Input / Constraints
The input comes in the form of commands in one of the formats specified above.
The input ends when you receive the command "Lumpawaroo".
Output
As output for each forceSide, ordered descending by forceplayer count, then by name, you must print all the forceplayer, ordered by name alphabetically.
The output format is:
Side: {forceSide}, Members: {forceplayer.Count}
! {forceUser}
! {forceUser}
! {forceUser}
In case there are NO forceplayer, don`t print this side.

Examples
Input
Light | Gosho
Dark | Pesho
Lumpawaroo

Output
Side: Dark, Members: 1
! Pesho
Side: Light, Members: 1
! Gosho


Comments
We register Gosho in the Light side and Pesho in the Dark side.
After receiving "Lumpawaroo" we print both sides, ordered by membersCount and then by name.


Input
Lighter | Royal
Darker | DCay
Ivan Ivanov -> Lighter
DCay -> Lighter
Lumpawaroo

Output
Ivan Ivanov joins the Lighter side!
DCay joins the Lighter side!
Side: Lighter, Members: 3
! DCay
! Ivan Ivanov
! Royal


Comments
Although Ivan Ivanov doesn`t have profile, we register him and add him to the Lighter side.
We remove DCay from Darker side and add him to Lighter side.
We print only Lighter side because Darker side has no members.

*/